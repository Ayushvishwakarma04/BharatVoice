package com.karok.govconnect.controller;

import com.karok.govconnect.entity.Channel;
import com.karok.govconnect.entity.Post;
import com.karok.govconnect.service.ChannelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gg/channels")
public class ChannelController {

    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @PostMapping
    public ResponseEntity<Channel> createChannel(@RequestBody Channel channel) {
        return ResponseEntity.ok(channelService.createChannel(channel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Channel> getChannelById(@PathVariable Long id) {
        return ResponseEntity.ok(channelService.getChannelById(id));
    }

    @GetMapping
    public ResponseEntity<List<Channel>> getChannels() {
        return ResponseEntity.ok(channelService.getAllChannels());
    }

    @GetMapping("/{channelId}/posts")
    public ResponseEntity<List<Post>> getPostsByChannel(@PathVariable Long channelId ) {
        return ResponseEntity.ok(channelService.getPostsByChannelId(channelId));
    }

}
