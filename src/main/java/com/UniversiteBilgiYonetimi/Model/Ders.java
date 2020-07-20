package com.UniversiteBilgiYonetimi.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ders {

    public Ders() {
    }

    public Ders(Ders other) {
        this.id = other.id;
        this.dersAdi = other.dersAdi;
        this.aciklama = other.aciklama;
        this.donem = other.donem;
        this.kredi = other.kredi;
        this.ogrenciler = other.ogrenciler;
        this.ogretimUyeleri = other.ogretimUyeleri;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "DERS_ADI")
    private String dersAdi;

    @Column(name = "ACIKLAMA")
    private String aciklama;

    @Column(name = "DONEM")
    private String donem;

    @Column(name = "KREDI")
    private int kredi;

    @ManyToMany(mappedBy = "dersler")
    private Set<Ogrenci> ogrenciler =new HashSet<>();

    @ManyToMany(mappedBy = "verilenDersler")
    private Set<OgretimUyesi> ogretimUyeleri=new HashSet<>();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
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

    public Set<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(Set<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public Set<OgretimUyesi> getOgretimUyeleri() {
        return ogretimUyeleri;
    }

    public void setOgretimUyeleri(Set<OgretimUyesi> ogretimUyeleri) {
        this.ogretimUyeleri = ogretimUyeleri;
    }
}
