package com.hibernatedeneme.dbdeneme;

import com.hibernatedeneme.Model.Ogrencı;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

public class NotId implements Serializable{

    private long dersId;


    private long ogrenciId;

    public NotId( ) {

    }

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
}
