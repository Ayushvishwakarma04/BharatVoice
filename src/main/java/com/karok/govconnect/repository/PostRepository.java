package com.karok.govconnect.repository;

import com.karok.govconnect.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByChannelId(Long channelId);
}
