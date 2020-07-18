package com.UniversiteBilgiYonetimi.Model.dto;

import java.io.Serializable;

public class FakulteEklemeDTO implements Serializable {

    private String fakulteAdi;
    private int hocaSayisi;

    public String getFakulteAdi() {
        return fakulteAdi;
    }

    public void setFakulteAdi(String fakulteAdi) {
        this.fakulteAdi = fakulteAdi;
    }

    public int getHocaSayisi() {
        return hocaSayisi;
    }

    public void setHocaSayisi(int hocaSayisi) {
        this.hocaSayisi = hocaSayisi;
    }
}
