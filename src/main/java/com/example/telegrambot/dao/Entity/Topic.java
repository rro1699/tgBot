package com.example.telegrambot.dao.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="topic")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtopic")
    Integer idTopic;

    @Column(name = "nametopic")
    String nameTopic;

    @Column(name="content")
    String content;

    @Column(name="question")
    String question;

    @Column(name="optionsofanswer")
    String optionsOfAnswer;

    public Topic(Integer idTopic, String nameTopic, String content, String question, String optionsOfAnswer) {
        this.idTopic = idTopic;
        this.nameTopic = nameTopic;
        this.content = content;
        this.question = question;
        this.optionsOfAnswer = optionsOfAnswer;
    }

    public Topic() {
    }
}
