package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.*;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface IOgrenciService {


    void ekle(Ogrenci ogrenci);
    void sil(Ogrenci ogrenci);
    Optional<Ogrenci> find(long ogrenciId);
    Page<Ogrenci> findAll(int pageNo, int pageSize);
    void update(Ogrenci ogrenci);



}
