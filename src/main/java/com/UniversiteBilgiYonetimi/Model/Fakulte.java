package com.UniversiteBilgiYonetimi.Model;

import javax.persistence.*;

@Entity
public class Fakulte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "FAKULTE_ISMI")
    private String adi;

    @Column(name = "HOCA_SAYISI")
    private int hocaSayısı;

    public Fakulte(){

    }

    public Fakulte(String adi, int hocaSayısı) {
        this.adi = adi;
        this.hocaSayısı = hocaSayısı;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getHocaSayısı() {
        return hocaSayısı;
    }

    public void setHocaSayısı(int hocaSayısı) {
        this.hocaSayısı = hocaSayısı;

    }
}
