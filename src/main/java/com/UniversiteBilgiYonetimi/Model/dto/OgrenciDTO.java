package com.UniversiteBilgiYonetimi.Model.dto;

import com.UniversiteBilgiYonetimi.Model.Bolum;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class OgrenciDTO {


    private int ogrenciNo ;
    private long bolumId;
    private int sinif;
    private String ad;
    private String soyad;
    private String email ;
    private int telefonNo;
    private String dogumTarihi;
    private String şifre;


    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public long getBolumId() {
        return bolumId;
    }

    public void setBolumId(long bolumId) {
        this.bolumId = bolumId;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(int telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }
}
