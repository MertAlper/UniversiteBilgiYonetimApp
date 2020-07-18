package com.UniversiteBilgiYonetimi.Model;


import javax.persistence.*;

@Entity
public class Bolum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ADI")
    private String adi;

    @ManyToOne
    @JoinColumn(name = "FAKULTE_ID")
    private Fakulte fakulte;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Fakulte getFakulte() {
        return fakulte;
    }

    public void setFakulte(Fakulte fakulte) {
        this.fakulte = fakulte;
    }
}
