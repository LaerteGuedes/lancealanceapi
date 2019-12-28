package com.rabbit.lancealance.repository;

import com.rabbit.lancealance.model.lance.Lance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanceRepository extends JpaRepository<Lance, Long> {
    List<Lance> findAllByPartidaIdOrderByTempo(Long idPartida);
}
