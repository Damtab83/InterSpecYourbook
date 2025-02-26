package fr.dam.yourbook_api.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String emplacement;

	public Stock(String nom) {
		this.emplacement = emplacement;
	}
	public Stock() {}
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	
}
