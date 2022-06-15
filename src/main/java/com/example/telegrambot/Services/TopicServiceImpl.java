package com.example.telegrambot.Services;

import com.example.telegrambot.dao.Entity.Topic;
import com.example.telegrambot.dao.Repository.TopicRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImpl implements TopicService{
    private TopicRepository topicRepository;

    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public void save(Topic topic) {
        if(empty(topic)){
            topicRepository.save(topic);
        }
    }

    @Override
    public List<Topic> findAll() {
        return topicRepository.findAll();
    }

    @Override
    public Optional<Topic> findByNameTopice(String nameTopic) {
        Optional<Topic> resultTopic = Optional.empty();
        if(!nameTopic.isEmpty()){
            resultTopic = topicRepository.findByNameTopic(nameTopic);
        }
        return resultTopic;
    }

    @Override
    public Optional<Topic> findById(Integer idTopic) {
        Optional<Topic> resultTopic = Optional.empty();
        if(idTopic!=null){
            resultTopic = topicRepository.findById(idTopic);
        }
        return resultTopic;
    }

    private boolean empty(Topic topic){
        if(topic.getIdTopic()!=null && !topic.getNameTopic().isEmpty() && !topic.getContent().isEmpty()
        && !topic.getOptionsOfAnswer().isEmpty() && !topic.getQuestion().isEmpty())
            return true;

        else
            return false;


    }
}
