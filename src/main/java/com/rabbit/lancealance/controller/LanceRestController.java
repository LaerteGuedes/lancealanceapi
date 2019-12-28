package com.rabbit.lancealance.controller;

import com.rabbit.lancealance.model.lance.Lance;
import com.rabbit.lancealance.service.ILanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lance")
public class LanceRestController {

    @Autowired
    private ILanceService lanceService;

    @GetMapping("/partida/{idPartida}")
    public ResponseEntity<List<Lance>> allByPartida(@PathVariable("idPartida") Long idPartida) {
        return ResponseEntity.ok(lanceService.searchByPartida(idPartida));
    }

}
