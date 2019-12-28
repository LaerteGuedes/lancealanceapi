package com.rabbit.lancealance.service;

import com.rabbit.lancealance.model.lance.Partida;
import com.rabbit.lancealance.repository.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidaService extends BaseService<Partida, Long> implements IPartidaService {

    @Autowired
    private PartidaRepository repo;

    @Override
    public PartidaRepository getRepository() {
        return repo;
    }

}
