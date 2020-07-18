package com.UniversiteBilgiYonetimi.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class OgretimUyesi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "AD")
    private String ad;

    @Column(name = "SOYAD")
    private String soyad;

    @Column(name = "ALAN")
    private String alan;

    @Column(name = "UNVAN")
    private String unvan;

    @Column(name = "SIFRE")
    private String şifre;

    @Column(name = "TELEFON_NO")
    private String telefonNo;

    @ManyToOne
    @JoinColumn(name = "BOLUM_ID")
    private Bolum bolumId;


    @ManyToMany
    @JoinTable(
            name = "Dersleri_veren_hocalar",
            joinColumns = { @JoinColumn(name = "OGRETIM_UYESI_ID") },
            inverseJoinColumns = { @JoinColumn(name = "DERS_ID") }
    )
    private Set<Ders> verilenDersler= new HashSet<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
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
}
