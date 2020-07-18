package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Repository.BolumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BolumService implements IBolumService {

    @Autowired
    private BolumRepository bolumRepository;

    @Override
    public void ekle(Bolum bolum) {
        bolumRepository.save(bolum);
    }
}
