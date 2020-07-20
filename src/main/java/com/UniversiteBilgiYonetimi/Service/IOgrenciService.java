package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.*;

import java.util.List;
import java.util.Optional;

public interface IOgrenciService {


    void ekle(Ogrenci ogrenci);
    void sil(Ogrenci ogrenci);
    Optional<Ogrenci> find(long ogrenciId);
    List<Ogrenci> findAll();
    void update(Ogrenci ogrenci);



}
