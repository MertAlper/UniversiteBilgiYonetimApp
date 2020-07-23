package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Fakulte;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IFakulteService {

     void ekle(Fakulte fakulte);
     void sil(Fakulte fakulte);
    Fakulte find(long fakulteId);
    Page<Fakulte> findAll(int pageNo, int pageSize);
    void update(Fakulte fakulte);


}
