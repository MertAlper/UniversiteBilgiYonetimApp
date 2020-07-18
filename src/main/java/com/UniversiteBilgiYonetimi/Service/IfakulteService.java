package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Fakulte;

import java.util.List;

public interface IfakulteService {

     void ekle(Fakulte fakulte);
     void sil(Fakulte fakulte);
    Fakulte find(long fakulteId);
    List<Fakulte> findAll();

}
