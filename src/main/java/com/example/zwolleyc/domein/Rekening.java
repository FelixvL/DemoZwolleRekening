package com.example.zwolleyc.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rekening {
	
		@Id
		@GeneratedValue( strategy = GenerationType.AUTO)
		private long id;
		
		private int saldo;
		private String rekeningNummer;
		private String stad;
		private String namecustomer;
		
		
		public int getSaldo() {
			return saldo;
		}
		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}
		public String getRekeningNummer() {
			return rekeningNummer;
		}
		public void setRekeningNummer(String rekeningNummer) {
			this.rekeningNummer = rekeningNummer;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getStad() {
			return stad;
		}
		public void setStad(String stad) {
			this.stad = stad;
		}
		public String getNamecustomer() {
			return namecustomer;
		}
		public void setNamecustomer(String namecustomer) {
			this.namecustomer = namecustomer;
		}
		
		
}
