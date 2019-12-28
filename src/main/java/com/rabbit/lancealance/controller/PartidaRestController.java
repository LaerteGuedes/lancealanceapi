package com.rabbit.lancealance.controller;

import com.rabbit.lancealance.model.lance.Partida;
import com.rabbit.lancealance.service.IPartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/partida")
public class PartidaRestController {

    @Autowired
    private IPartidaService partidaService;

    @GetMapping
    public ResponseEntity<List<Partida>> all() {
        return ResponseEntity.ok(partidaService.all());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Partida> detalhe(@PathVariable("id") Long id) {
        return ResponseEntity.ok(partidaService.search(id));
    }

}
