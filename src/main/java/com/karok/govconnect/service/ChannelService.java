package com.karok.govconnect.service;

import com.karok.govconnect.entity.Channel;
import com.karok.govconnect.entity.Post;
import com.karok.govconnect.repository.ChannelRepository;
import com.karok.govconnect.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelService {

    private final ChannelRepository channelRepository;
    private final PostRepository postRepository;

    public ChannelService(ChannelRepository channelRepository, PostRepository postRepository) {
        this.channelRepository = channelRepository;
        this.postRepository = postRepository;
    }

    public Channel createChannel(Channel channel) {
        return channelRepository.save(channel);
    }

    public Channel getChannelById(Long id) {
        return channelRepository.findById(id).orElseThrow(() -> new RuntimeException("Channel not found"));
    }

    public List<Channel> getAllChannels() {
        return channelRepository.findAll();
    }

    public List<Post> getPostsByChannelId(Long channelId) {
        return postRepository.findByChannelId(channelId);
    }
}
