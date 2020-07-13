package com.hibernatedeneme.dbdeneme;

import com.hibernatedeneme.Model.Ogrencı;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class NotId implements Serializable{

    private String ders;


    private int ogrenciNo;

    public NotId( ) {

    }

    public NotId(String ders, int ogrenciNo) {
        this.ders = ders;
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotId notId = (NotId) o;
        return ogrenciNo == notId.ogrenciNo &&
                Objects.equals(ders, notId.ders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ders, ogrenciNo);
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
}
