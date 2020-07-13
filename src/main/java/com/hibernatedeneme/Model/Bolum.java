package com.hibernatedeneme.Model;


import javax.persistence.*;

@Entity
public class Bolum {
    @Id
    private String bolumİsmi;

    @ManyToOne
    @JoinColumn(name = "fakulteİsmi")

    private Fakulte fakulteİsmi;

    public String getBolumİsmi() {
        return bolumİsmi;
    }

    public void setBolumİsmi(String bolumİsmi) {
        this.bolumİsmi = bolumİsmi;
    }

    public Fakulte getFakulteİsmi() {
        return fakulteİsmi;
    }

    public void setFakulteİsmi(Fakulte fakulteİsmi) {
        this.fakulteİsmi = fakulteİsmi;
    }
}
