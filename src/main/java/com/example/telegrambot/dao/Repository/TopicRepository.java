package com.example.telegrambot.dao.Repository;

import com.example.telegrambot.dao.Entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic,Integer> {
    Optional<Topic> findByNameTopic(String nameTopic);
}
