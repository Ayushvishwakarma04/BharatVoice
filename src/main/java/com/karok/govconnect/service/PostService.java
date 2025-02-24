package com.karok.govconnect.service;

import com.karok.govconnect.entity.Channel;
import com.karok.govconnect.entity.Post;
import com.karok.govconnect.entity.User;
import com.karok.govconnect.repository.ChannelRepository;
import com.karok.govconnect.repository.PostRepository;
import com.karok.govconnect.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;
    private final ChannelRepository channelRepository;

    public PostService(PostRepository postRepository, UserRepository userRepository, ChannelRepository channelRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.channelRepository = channelRepository;
    }

    public Post createPost(Long userId, Long channelId, String content) {

        //1. Check whether user exists
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        //2. Check whether channel exist
        Channel channel = channelRepository.findById(channelId)
                .orElseThrow(()-> new RuntimeException("Channel not found"));

        //3. create and save post
        Post post = new Post();
        post.setUser(user);
        post.setChannel(channel);
        post.setContent(content);

        return postRepository.save(post);
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElseThrow(()-> new RuntimeException("Post not found"));
    }

    public List<Post> getPostsByChannelId(Long channelId) {
        return postRepository.findByChannelId(channelId);
    }
}
