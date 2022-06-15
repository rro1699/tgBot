package com.example.telegrambot.Services;

import com.example.telegrambot.dao.Entity.Topic;

import java.util.List;
import java.util.Optional;

public interface TopicService {
    void save(Topic topic);
    List<Topic> findAll();
    Optional<Topic> findByNameTopice(String nameTopic);
    Optional<Topic> findById(Integer idTopic);
}
