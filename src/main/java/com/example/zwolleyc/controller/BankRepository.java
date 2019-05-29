package com.example.zwolleyc.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.zwolleyc.domein.Bank;

@Component
public interface BankRepository extends CrudRepository< Bank, Long >   {

}
