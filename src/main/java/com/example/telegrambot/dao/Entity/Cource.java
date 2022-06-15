package com.example.telegrambot.dao.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="cource")
public class Cource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcource")
    Integer idCource;

    @Column(name="namecource")
    String nameCource;

    @Column(name="spacedrepetion")
    Boolean spacedRepetion;

    public Cource(Integer idCource, String nameCource, Boolean spacedRepetion) {
        this.idCource = idCource;
        this.nameCource = nameCource;
        this.spacedRepetion = spacedRepetion;
    }

    public Cource(Integer idCource, String nameCource) {
        this.idCource = idCource;
        this.nameCource = nameCource;
        this.spacedRepetion = false;
    }

    public Cource() {
    }

}
