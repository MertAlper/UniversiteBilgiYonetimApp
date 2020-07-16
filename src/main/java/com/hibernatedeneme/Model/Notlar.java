package com.hibernatedeneme.Model;

import com.hibernatedeneme.dbdeneme.NotId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(NotId.class)
public class Notlar  {

     @Id
     @ManyToOne
     @JoinColumn(name = "dersId")
    private Ders dersId;
     @Id
     @ManyToOne
     @JoinColumn(name = "ogrenciID")
     private Ogrencı ogrenciId;


    private String harfNotu;

    public Ders getDersId() {
        return dersId;
    }

    public void setDersId(Ders dersId) {
        this.dersId = dersId;
    }

    public Ogrencı getOgrenciId() {
        return ogrenciId;
    }

    public void setOgrenciId(Ogrencı ogrenciId) {
        this.ogrenciId = ogrenciId;
    }

    public String getHarfNotu() {
        return harfNotu;
    }

    public void setHarfNotu(String harfNotu) {
        this.harfNotu = harfNotu;
    }
}
