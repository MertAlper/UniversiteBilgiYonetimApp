package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Notlar;
import org.springframework.data.domain.Page;


import java.util.List;
import java.util.Optional;

public interface INotlarService {

    void ekle(Notlar not);
    void sil(Notlar not);
    Optional<Notlar> find(long not);
    Page<Notlar> findAll(int pageNo, int pageSize);
    void update(Notlar not);
}
