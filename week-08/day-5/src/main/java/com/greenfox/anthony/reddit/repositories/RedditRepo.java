package com.greenfox.anthony.reddit.repositories;

import com.greenfox.anthony.reddit.models.RedditPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RedditRepo extends CrudRepository <RedditPost, Long> {
    List<RedditPost> findAllByIdGreaterThanOrdeOrderByVotesDesc(Long number);

    RedditPost findFirstById(Long number);

    Page<RedditPost> findAllByIdGreaterThanOrderByVotesDesc(Pageable pageable, long l);
}
