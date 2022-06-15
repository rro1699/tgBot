package com.example.telegrambot.Services;

import com.example.telegrambot.dao.Entity.Cource;
import com.example.telegrambot.dao.Repository.CourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourceServiceImpl implements CourceService{
    private CourceRepository courceRepository;

    public CourceServiceImpl(CourceRepository courceRepository) {
        this.courceRepository = courceRepository;
    }

    @Override
    public void save(Cource cource) {
        if(cource.getIdCource()!=null && !cource.getNameCource().isEmpty()){
            courceRepository.save(cource);
        }
    }

    @Override
    public Optional<Cource> findByIdCource(Integer idCource) {
        Optional<Cource> resultCource = Optional.empty();
        if(idCource!=null){
            resultCource = courceRepository.findById(idCource);
        }
        return resultCource;
    }

    @Override
    public List<Cource> getAllCources() {
        return courceRepository.findAll();
    }
}
