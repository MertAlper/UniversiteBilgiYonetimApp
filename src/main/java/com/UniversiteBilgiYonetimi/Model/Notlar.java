package com.UniversiteBilgiYonetimi.Model;

import javax.persistence.*;

@Entity
public class Notlar  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @ManyToOne
     @JoinColumn(name = "DERS_ID")
     private Ders ders;

     @ManyToOne
     @JoinColumn(name = "OGRENCI_ID")
     private Ogrenci ogrenci;

    @Column(name = "HARF_NOTU")
    private String harfNotu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ders getDers() {
        return ders;
    }

    public void setDers(Ders ders) {
        this.ders = ders;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public String getHarfNotu() {
        return harfNotu;
    }

    public void setHarfNotu(String harfNotu) {
        this.harfNotu = harfNotu;
    }
}
