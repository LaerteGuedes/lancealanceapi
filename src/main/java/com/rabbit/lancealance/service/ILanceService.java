package com.rabbit.lancealance.service;

import com.rabbit.lancealance.model.lance.Lance;

import java.util.List;

public interface ILanceService extends IBaseService<Lance, Long> {

    List<Lance> searchByPartida(Long idPartida);

}
