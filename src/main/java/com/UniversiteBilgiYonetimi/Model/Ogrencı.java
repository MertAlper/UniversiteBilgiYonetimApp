package com.UniversiteBilgiYonetimi.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ogrencı {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "OGRENCI_NO")
    private int ogrenciNo ;

    @ManyToOne
    @JoinColumn(name = "BOLUM_ID")
    private Bolum bolum;

    @Column(name = "SINIF")
    private int sinif;

    @Column(name = "AD")
    private String ad;

    @Column(name = "SOYAD")
    private String soyad;

    @Column(name = "EMAIL")
    private String email ;

    @Column(name = "TELEFON_NO")
    private int telefonNo;

    @Column(name = "DOGUM_TARIHI")
    private Date dogumTarihi;

    @Column(name = "SIFRE")
    private String şifre;

    @ManyToMany
    @JoinTable(
            name = "DERS_OGRENCI",
            joinColumns = { @JoinColumn(name = "OGRENCI_ID") },
            inverseJoinColumns = { @JoinColumn(name = "DERS_ID") }
    )
    private Set<Ders> dersler= new HashSet<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Bolum getBolum() {
        return bolum;
    }

    public void setBolum(Bolum bolum) {
        this.bolum = bolum;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
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

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public Set<Ders> getDersler() {
        return dersler;
    }

    public void setDersler(Set<Ders> dersler) {
        this.dersler = dersler;
    }
}
