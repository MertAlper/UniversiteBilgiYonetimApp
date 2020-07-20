package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.*;

import java.util.List;
import java.util.Optional;

public interface IDersService {

    void ekle(Ders ders);
    void sil(Ders ders);
    Optional<Ders> find(long dersId);
    List<Ders> findAll();
    void update(Ders ders);




}
