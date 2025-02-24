package com.karok.govconnect.service;

import com.karok.govconnect.entity.Channel;
import com.karok.govconnect.entity.User;
import com.karok.govconnect.repository.ChannelRepository;
import com.karok.govconnect.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
//     Encryption using BCRYPTpass remaining

    private final UserRepository userRepository;
    private final ChannelRepository channelRepository;

    public UserService(UserRepository userRepository, ChannelRepository channelRepository) {
        this.userRepository = userRepository;
        this.channelRepository = channelRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void joinChannel(Long userId, Long channelId) {
        User user = getUserById(userId);
        Channel channel = channelRepository.findById(channelId).orElseThrow(() -> new RuntimeException("Channel not found"));

        user.getChannels().add(channel);
        userRepository.save(user);
    }
}
