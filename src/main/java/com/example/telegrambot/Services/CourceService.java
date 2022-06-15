package com.example.telegrambot.Services;

import com.example.telegrambot.dao.Entity.Cource;

import java.util.List;
import java.util.Optional;

public interface CourceService {
    void save(Cource cource);
    Optional<Cource> findByIdCource(Integer idCource);
    List<Cource> getAllCources();
}
