package com.UniversiteBilgiYonetimi.Model.dto;

import com.UniversiteBilgiYonetimi.Model.Ders;
import com.UniversiteBilgiYonetimi.Model.Ogrenci;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class NotDTO {


    private long dersId;
    private long ogrenciId;
    private String harfNotu;

    public long getDersId() {
        return dersId;
    }

    public void setDersId(long dersId) {
        this.dersId = dersId;
    }

    public long getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(long ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public String getHarfNotu() {
        return harfNotu;
    }

    public void setHarfNotu(String harfNotu) {
        this.harfNotu = harfNotu;
    }
}
