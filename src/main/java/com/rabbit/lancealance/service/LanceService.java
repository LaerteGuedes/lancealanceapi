package com.rabbit.lancealance.service;

import com.rabbit.lancealance.model.lance.Lance;
import com.rabbit.lancealance.repository.LanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanceService extends BaseService<Lance, Long> implements ILanceService {

    @Autowired
    private LanceRepository repository;

    @Override
    public JpaRepository<Lance, Long> getRepository() {
        return repository;
    }

    @Override
    public List<Lance> searchByPartida(Long idPartida) {
        return repository.findAllByPartidaIdOrderByTempo(idPartida);
    }
}
