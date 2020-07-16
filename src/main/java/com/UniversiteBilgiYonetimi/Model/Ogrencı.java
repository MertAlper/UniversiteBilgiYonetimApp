package com.UniversiteBilgiYonetimi.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ogrencı {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ogrenciId;




    private int ogrenciNo ;

    @ManyToOne
    @JoinColumn(name = "bolumId",referencedColumnName ="bolumId" )
    private Bolum  bolumId;

    private int sınıf;
    private String ad;
    private String soyad;
    private String Email ;
    private int telefonNo;
    private Date doğumTarihi;
    private String şifre;

    @ManyToMany
    @JoinTable(
            name = "Dersleri_alan_ogrenciler",
            joinColumns = { @JoinColumn(name = "bolumId") },
            inverseJoinColumns = { @JoinColumn(name = "dersId") }
    )
    private Set<Ders> Dersler= new HashSet<>();


    public Bolum getBolumId() {
        return bolumId;
    }

    public void setBolumId(Bolum bolumId) {
        this.bolumId = bolumId;
    }

    public long getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(long ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }



    public int getSınıf() {
        return sınıf;
    }

    public void setSınıf(int sınıf) {
        this.sınıf = sınıf;
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
