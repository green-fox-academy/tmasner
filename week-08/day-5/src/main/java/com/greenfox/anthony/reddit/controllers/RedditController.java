package com.greenfox.anthony.reddit.controllers;

import com.greenfox.anthony.reddit.models.RedditPost;
import com.greenfox.anthony.reddit.repositories.RedditRepo;
import com.greenfox.anthony.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class RedditController {

    private RedditRepo redditRepo;
    private RedditService redditService;

    @Autowired
    public RedditController(RedditRepo redditRepo, RedditService redditService) {
        this.redditRepo = redditRepo;
        this.redditService = redditService;
    }

    @GetMapping(value = "/{page}")
    public String listArticlesPageByPage(@PathVariable("page") int page, Model model) {
        PageRequest pageable = PageRequest.of(page - 1, 10);
        Page<RedditPost> redditPage = redditService.getPaginatedRedditPosts(pageable);
        int totalPages = redditPage.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed().collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        model.addAttribute("reddits", redditPage.getContent());
        return "main";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("reddit", new RedditPost());
        return "add";
    }

    @PostMapping("/add")
    public String handleAdd(@ModelAttribute RedditPost newPost) {
        redditRepo.save(newPost);
        return "redirect:/1";
    }
}