package com.hibernatedeneme.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class OgretimUyesi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ogretimUyesiId;



    private String eMail;
    private String ad;
    private String soyad;
    private String alan;
    private String ünvan;
    private String şifre;
    private String telefonNo;

    @ManyToOne
    @JoinColumn(name = "bolumId",referencedColumnName ="bolumId" )
    private Bolum bolumId;


    @ManyToMany
    @JoinTable(
            name = "Dersleri_veren_hocalar",
            joinColumns = { @JoinColumn(name = "ogretımUyesiId") },
            inverseJoinColumns = { @JoinColumn(name = "dersId") }
    )
    private Set<Ders> verilenDersler= new HashSet<>();


    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public String getÜnvan() {
        return ünvan;
    }

    public void setÜnvan(String ünvan) {
        this.ünvan = ünvan;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public Bolum getBolumId() {
        return bolumId;
    }

    public void setBolumId(Bolum bolumId) {
        this.bolumId = bolumId;
    }

    public Set<Ders> getVerilenDersler() {
        return verilenDersler;
    }

    public void setVerilenDersler(Set<Ders> verilenDersler) {
        this.verilenDersler = verilenDersler;
    }

    public long getOgretimUyesiId() {
        return ogretimUyesiId;
    }

    public void setOgretimUyesiId(long ogretimUyesiId) {
        this.ogretimUyesiId = ogretimUyesiId;
    }
}
