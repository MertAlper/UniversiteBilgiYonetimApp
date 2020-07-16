package com.UniversiteBilgiYonetimi.Model;

import javax.persistence.*;

@Entity
public class Fakulte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fakulteId;

    private String fakulteİsmi;
    private int hocaSayısı;

    public Fakulte(String fakulteİsmi, int hocaSayısı) {
        this.fakulteİsmi = fakulteİsmi;
        this.hocaSayısı = hocaSayısı;
    }

    public String getFakulteİsmi() {
        return fakulteİsmi;
    }

    public void setFakulteİsmi(String fakulteİsmi) {
        this.fakulteİsmi = fakulteİsmi;
    }

    public int getHocaSayısı() {
        return hocaSayısı;
    }

    public void setHocaSayısı(int hocaSayısı) {
        this.hocaSayısı = hocaSayısı;

    }

    public long getFakulteId() {
        return fakulteId;
    }

    public void setFakulteId(long fakulteId) {
        this.fakulteId = fakulteId;
    }
}
