package com.hibernatedeneme.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class OgretimUyesi {

    @Id
    private String eMail;
    private String isimSoyisim;
    private String alan;
    private String ünvan;
    private String şifre;
    private String telefonNo;

    @ManyToOne
    @JoinColumn(name = "bolum",referencedColumnName ="bolumİsmi" )
    private Bolum bolum;


    @ManyToMany
    @JoinTable(
            name = "Dersleri_veren_hocalar",
            joinColumns = { @JoinColumn(name = "eMail") },
            inverseJoinColumns = { @JoinColumn(name = "dersAdı") }
    )
    private Set<Ders> verilenDersler= new HashSet<>();


    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
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

    public Bolum getBolum() {
        return bolum;
    }

    public void setBolum(Bolum bolum) {
        this.bolum = bolum;
    }

    public Set<Ders> getVerilenDersler() {
        return verilenDersler;
    }

    public void setVerilenDersler(Set<Ders> verilenDersler) {
        this.verilenDersler = verilenDersler;
    }
}
