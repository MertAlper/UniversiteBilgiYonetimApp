package com.UniversiteBilgiYonetimi.Model.dto;

import java.io.Serializable;

public class BolumEklemeDTO implements Serializable {

    private String bolumAdi;
    private Long fakulteId;

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public Long getFakulteId() {
        return fakulteId;
    }

    public void setFakulteId(Long fakulteId) {
        this.fakulteId = fakulteId;
    }
}
