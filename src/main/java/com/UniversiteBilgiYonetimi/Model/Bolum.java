package com.UniversiteBilgiYonetimi.Model;


import javax.persistence.*;

@Entity
public class Bolum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bolumId;


    private String bolumİsmi;

    @ManyToOne
    @JoinColumn(name = "fakulteId")

    private Fakulte fakulteId;

    public String getBolumİsmi() {
        return bolumİsmi;
    }

    public void setBolumİsmi(String bolumİsmi) {
        this.bolumİsmi = bolumİsmi;
    }

    public Fakulte getFakulteId() {
        return fakulteId;
    }

    public void setFakulteId(Fakulte fakulteId) {
        this.fakulteId = fakulteId;
    }

    public long getBolumId() {
        return bolumId;
    }

    public void setBolumId(long bolumId) {
        this.bolumId = bolumId;
    }
}
