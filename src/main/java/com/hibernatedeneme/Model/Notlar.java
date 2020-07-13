package com.hibernatedeneme.Model;

import com.hibernatedeneme.dbdeneme.NotId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(NotId.class)
public class Notlar  {

     @Id
    private String ders;
     @Id
    private int ogrenciNo;

    private String dersNotu;






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

    public String getDersNotu() {
        return dersNotu;
    }

    public void setDersNotu(String dersNotu) {
        this.dersNotu = dersNotu;
    }
}
