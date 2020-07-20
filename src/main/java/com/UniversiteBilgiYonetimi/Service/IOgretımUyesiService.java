package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Ogrenci;
import com.UniversiteBilgiYonetimi.Model.OgretimUyesi;

import java.util.List;
import java.util.Optional;

public interface IOgretımUyesiService {

    void ekle(OgretimUyesi ogretimUyesi);
    void sil(OgretimUyesi ogretimUyesi);
    Optional<OgretimUyesi> find(long id);
    List<OgretimUyesi> findAll();
    void update(OgretimUyesi ogretimUyesi);
}
