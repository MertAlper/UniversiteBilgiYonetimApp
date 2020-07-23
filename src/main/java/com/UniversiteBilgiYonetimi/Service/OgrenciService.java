package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Ogrenci;
import com.UniversiteBilgiYonetimi.Repository.DersRepository;
import com.UniversiteBilgiYonetimi.Repository.OgrenciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.UniversiteBilgiYonetimi.*;

import javax.transaction.Transactional;

@Service
@Transactional
public class OgrenciService  implements  IOgrenciService{

    @Autowired
    private OgrenciRepository ogrenciRepository;

    @Override
    public void ekle(Ogrenci ogrenci) {
        ogrenciRepository.save(ogrenci);

    }

    @Override
    public void sil(Ogrenci ogrenci) {
        ogrenciRepository.delete(ogrenci);

    }

    @Override
    public Optional<Ogrenci> find(long dersId) {
        return ogrenciRepository.findById(dersId);
    }

    @Override
    public Page<Ogrenci> findAll(int pageNo, int pageSize) {

        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return ogrenciRepository.findAll(pageable);
    }

    @Override
    public void update(Ogrenci ogrenci) {
        ogrenciRepository.save(ogrenci);

    }
}
