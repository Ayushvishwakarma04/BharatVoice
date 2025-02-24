package com.karok.govconnect.controller;


import com.karok.govconnect.entity.Comment;
import com.karok.govconnect.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gg/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/{userId}/{postId}")
    public ResponseEntity<Comment> addComment(@PathVariable Long userId, @PathVariable Long postId, @RequestBody String content) {
        return ResponseEntity.ok(commentService.addComment(userId,postId,content));
    }

    @GetMapping("/post/{postId}")
    public ResponseEntity<List<Comment>> getCommentsByPost(@PathVariable Long postId) {
        return ResponseEntity.ok(commentService.getCommentsByPostId(postId));
    }

}
