package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Ogrenci;
import com.UniversiteBilgiYonetimi.Model.OgretimUyesi;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface IOgretımUyesiService {

    void ekle(OgretimUyesi ogretimUyesi);
    void sil(OgretimUyesi ogretimUyesi);
    Optional<OgretimUyesi> find(long id);
    Page<OgretimUyesi> findAll(int pageNo, int pageSize);
    void update(OgretimUyesi ogretimUyesi);
}
