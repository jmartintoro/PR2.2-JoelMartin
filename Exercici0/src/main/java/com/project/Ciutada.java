package com.project;

import java.io.Serializable;

public class Ciutada implements Serializable {

	private long ciutadaId;

	private long ciutatId;

	private String nom;

	private String cognom;
	
	private int edat;

	public Ciutada() { }

	public Ciutada(long ciutatId, String nom, String cognom, int edat) {
		this.ciutatId = ciutatId;
		this.nom = nom;
		this.cognom = cognom;
		this.edat = edat;
	}

	public long getCiutadaId() {
		return ciutadaId;
	}

	public void setCiutadaId(long ciutadaId) {
		this.ciutadaId = ciutadaId;
	}

	public long getCiutatId() {
		return ciutatId;
	}

	public void setCiutatId(long ciutatId) {
		this.ciutatId = ciutatId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	@Override
    public String toString () {
      	return this.getNom() + " " + this.getCognom() + ", " + this.getEdat() + " - " + this.getCiutatId();
    }
}