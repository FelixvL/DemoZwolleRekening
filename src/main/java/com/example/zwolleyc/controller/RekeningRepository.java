package com.example.zwolleyc.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.zwolleyc.domein.Rekening;

@Component
public interface RekeningRepository extends CrudRepository<Rekening,Long> {

}
