package com.example.zwolleyc.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zwolleyc.domein.Bank;
import com.example.zwolleyc.domein.Rekening;



@Service
@Transactional
public class RekeningService {
	@Autowired
	public RekeningRepository rekRepository;
	
	
	@Autowired
	public BankRepository bRepository;
	
	public Iterable<Rekening> alleRekeningenGeven() {
		Iterable<Rekening> rekeningen = rekRepository.findAll();
		
		
		return rekeningen;
	}
	
	public void maakNieuweRekening(Rekening rekening) {
		rekRepository.save(rekening);
	}
	
	
	
	
	public String inRekeningService() {
		rekRepository.save(new Rekening());
		Iterable<Bank> banken = bRepository.findAll();
		for(Bank b : banken) {
			System.out.println("een bank"+ b.getBedrijfsnaam());
		}
		return "het is gelukt";
	}

}
