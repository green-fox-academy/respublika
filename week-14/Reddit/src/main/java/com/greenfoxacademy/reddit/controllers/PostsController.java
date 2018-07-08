package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class PostsController {
    private PostRepository postRepository;

    private UserRepository userRepository;

    @Autowired
    public PostsController(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository=userRepository;
    }

    @GetMapping(value = "/posts")
    public Object getPosts() {
        return postRepository.findAll();
    }

    @PostMapping(value = "/posts/add")
    public Object postPosts(@RequestBody(required = false) Post post) {
        if (post.getOwner() != null && userRepository.findByName(post.getOwner().getName()) == null) {
            userRepository.save(post.getOwner());
            User owner=userRepository.findByName(post.getOwner().getName());
            postRepository.save(new Post(post.getTitle(), post.getUrl(), owner));
        } else if (post.getOwner() != null && userRepository.findByName(post.getOwner().getName()) != null) {
            User owner=userRepository.findByName(post.getOwner().getName());
            postRepository.save(new Post(post.getTitle(), post.getUrl(), owner));
        } else {
            postRepository.save(new Post(post.getTitle(), post.getUrl()));
        }

        return postRepository.findAllByTitle(post.getTitle());
    }

    @PutMapping(value="/posts/{id}/upvote")
    public Object putPostUpvote(@PathVariable Long id) {
        Integer score=postRepository.findById(id).get().getScore()+1;
        postRepository.findById(id).get().setScore(score);
        postRepository.save(postRepository.findById(id).get());
        return postRepository.findById(id).get();
    }

    @PutMapping(value="/posts/{id}/downvote")
    public Object putPostDownvote(@PathVariable Long id) {
        Integer score=postRepository.findById(id).get().getScore()-1;
        postRepository.findById(id).get().setScore(score);
        postRepository.save(postRepository.findById(id).get());
        return postRepository.findById(id).get();
    }

    @DeleteMapping(value="/posts/{id}/delete")
    public Object deletePost(@PathVariable Long id) {
        postRepository.delete(postRepository.findById(id).get());
        return postRepository.findAll();
    }

    @PutMapping(value="/posts/{id}/update")
    public Object deletePost(@PathVariable Long id, @RequestBody Post post) {
        postRepository.findById(id).get().setTitle(post.getTitle());
        postRepository.findById(id).get().setUrl(post.getUrl());
        postRepository.findById(id).get().setTimestamp(new Date());
        postRepository.findById(id).get().setOwner(post.getOwner());
        postRepository.save(postRepository.findById(id).get());
        return postRepository.findById(id).get();
    }

}


