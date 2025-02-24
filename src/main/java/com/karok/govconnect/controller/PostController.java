package com.karok.govconnect.controller;

import com.karok.govconnect.entity.Post;
import com.karok.govconnect.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gg/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/{userId}/{channelId}")
    public ResponseEntity<Post> createPost(@PathVariable Long userId, @PathVariable Long channelId, @RequestBody String content){
        return ResponseEntity.ok(postService.createPost(userId,channelId,content));
    }

    @GetMapping("{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        return ResponseEntity.ok(postService.getPostById(id));
    }

    @GetMapping("/channel/{channelId}")
    public ResponseEntity<List<Post>> getPostByChannelId(@PathVariable Long channelId){
        return ResponseEntity.ok(postService.getPostsByChannelId(channelId));
    }

}
