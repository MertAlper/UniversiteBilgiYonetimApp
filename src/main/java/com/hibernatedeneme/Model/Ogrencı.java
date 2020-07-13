package com.hibernatedeneme.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ogrencı {

    @Id
    private int ogrenciNo ;

    @ManyToOne
    @JoinColumn(name = "bolum",referencedColumnName ="bolumİsmi" )
    private Bolum  bolum;

    private int sınıf;
    private String isimSoyisim;
    private String Email ;
    private int telefonNo;
    private Date doğumTarihi;
    private String şifre;


    @ManyToMany
    @JoinTable(
            name = "Dersleri_alan_ogrenciler",
            joinColumns = { @JoinColumn(name = "ogrenciNo") },
            inverseJoinColumns = { @JoinColumn(name = "dersAdı") }
    )
    private Set<Ders> Dersler= new HashSet<>();






    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Bolum getBolum() {
        return bolum;
    }

    public void setBolum(Bolum bolum) {
        this.bolum = bolum;
    }

    public int getSınıf() {
        return sınıf;
    }

    public void setSınıf(int sınıf) {
        this.sınıf = sınıf;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(int telefonNo) {
        this.telefonNo = telefonNo;
    }

    public Date getDoğumTarihi() {
        return doğumTarihi;
    }

    public void setDoğumTarihi(Date doğumTarihi) {
        this.doğumTarihi = doğumTarihi;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public Set<Ders> getDersler() {
        return Dersler;
    }

    public void setDersler(Set<Ders> dersler) {
        Dersler = dersler;
    }
}
