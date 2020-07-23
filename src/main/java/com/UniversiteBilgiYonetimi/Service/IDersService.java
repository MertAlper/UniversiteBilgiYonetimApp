package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.*;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface IDersService {

    void ekle(Ders ders);
    void sil(Ders ders);
    Optional<Ders> find(long dersId);
    Page<Ders> findAll(int pageNo, int pageSize);
    void update(Ders ders);




}
