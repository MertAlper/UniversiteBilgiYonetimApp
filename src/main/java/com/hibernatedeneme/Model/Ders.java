package com.hibernatedeneme.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dersId;

    private String dersAdı;

    private String acıklama;

    private String donem;

    private int kredi;

    @ManyToMany(mappedBy = "Dersler")
    private Set<Ogrencı> Ogrenciler=new HashSet<>();

    @ManyToMany(mappedBy = "verilenDersler")
    private Set<OgretimUyesi> ogretimUyeleri=new HashSet<>();


    public long getDersId() {
        return dersId;
    }

    public void setDersId(long dersId) {
        this.dersId = dersId;
    }

    public String getDersAdı() {
        return dersAdı;
    }

    public void setDersAdı(String dersAdı) {
        this.dersAdı = dersAdı;
    }

    public String getAcıklama() {
        return acıklama;
    }

    public void setAcıklama(String acıklama) {
        this.acıklama = acıklama;
    }

    public String getDonem() {
        return donem;
    }

    public void setDonem(String donem) {
        this.donem = donem;
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    public Set<Ogrencı> getOgrenciler() {
        return Ogrenciler;
    }

    public void setOgrenciler(Set<Ogrencı> ogrenciler) {
        Ogrenciler = ogrenciler;
    }

    public Set<OgretimUyesi> getOgretimUyeleri() {
        return ogretimUyeleri;
    }

    public void setOgretimUyeleri(Set<OgretimUyesi> ogretimUyeleri) {
        this.ogretimUyeleri = ogretimUyeleri;
    }
}
