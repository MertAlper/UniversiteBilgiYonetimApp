package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Notlar;


import java.util.List;
import java.util.Optional;

public interface INotlarService {

    void ekle(Notlar not);
    void sil(Notlar not);
    Optional<Notlar> find(long not);
    List<Notlar> findAll();
    void update(Notlar not);
}
