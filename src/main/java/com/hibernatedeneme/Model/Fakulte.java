package com.hibernatedeneme.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fakulte {

    @Id
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
}
