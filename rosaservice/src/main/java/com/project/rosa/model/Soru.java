package com.project.rosa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Soru {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	String soru;
	String cevap;
	String kisi;
	Date soruTarihi;
	Date cevapTarihi;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoru() {
		return soru;
	}
	public void setSoru(String soru) {
		this.soru = soru;
	}
	public String getCevap() {
		return cevap;
	}
	public void setCevap(String cevap) {
		this.cevap = cevap;
	}
	public String getKisi() {
		return kisi;
	}
	public void setKisi(String kisi) {
		this.kisi = kisi;
	}
	public Date getSoruTarihi() {
		return soruTarihi;
	}
	public void setSoruTarihi(Date soruTarihi) {
		this.soruTarihi = soruTarihi;
	}
	public Date getCevapTarihi() {
		return cevapTarihi;
	}
	public void setCevapTarihi(Date cevapTarihi) {
		this.cevapTarihi = cevapTarihi;
	}	}