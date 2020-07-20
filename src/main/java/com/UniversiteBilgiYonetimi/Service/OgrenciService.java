package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Ogrenci;
import com.UniversiteBilgiYonetimi.Repository.DersRepository;
import com.UniversiteBilgiYonetimi.Repository.OgrenciRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Ogrenci> findAll() {
        return ogrenciRepository.findAll();
    }

    @Override
    public void update(Ogrenci ogrenci) {
        ogrenciRepository.save(ogrenci);


    }
}
