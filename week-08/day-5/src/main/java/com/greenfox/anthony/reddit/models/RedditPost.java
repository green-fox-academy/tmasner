package com.greenfox.anthony.reddit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class RedditPost {

    @Id
    @GeneratedValue
    private long id;

    private int votes;
    private String title;
    private String url;
    private LocalDate date;

    public RedditPost() {
        this.date = LocalDate.now();
    }

    public RedditPost(int votes, String title, String url, LocalDate date) {
        this.votes = votes;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public int getVotes() {
        return votes;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
