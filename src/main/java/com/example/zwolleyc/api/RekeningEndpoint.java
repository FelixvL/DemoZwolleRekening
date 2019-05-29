package com.example.zwolleyc.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.zwolleyc.controller.RekeningService;
import com.example.zwolleyc.domein.Rekening;

@RestController
public class RekeningEndpoint {
	@Autowired
	RekeningService rs;
	
	@GetMapping("hallo")
	public Rekening eenNaam() {
		Rekening r = new Rekening();
		r.setRekeningNummer("05ABNA304055667");
		r.setSaldo(100);
		return r;
	}
	
	@GetMapping("hallo2")
	public String eenNaam2() {
		String ffchecken = rs.inRekeningService();
		return "hallo2" + ffchecken;
		
	}

}
