package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface IBolumService  {

    void ekle(Bolum bolum);
    void sil(Bolum bolum);
    Optional<Bolum> find(long bolumId);
    Page<Bolum> findAll(int pageNo, int pageSize);
    void update(Bolum bolum);

}
