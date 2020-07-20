package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Bolum;

import java.util.List;
import java.util.Optional;

public interface IBolumService  {

    void ekle(Bolum bolum);
    void sil(Bolum bolum);
    Optional<Bolum> find(long bolumId);
    List<Bolum> findAll();
    void update(Bolum bolum);

}
