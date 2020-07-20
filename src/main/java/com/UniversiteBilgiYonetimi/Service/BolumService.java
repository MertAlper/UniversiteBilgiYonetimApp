package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Repository.BolumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BolumService implements IBolumService {

    @Autowired
    private BolumRepository bolumRepository;

    @Override
    public void ekle(Bolum bolum) {

        bolumRepository.save(bolum);
    }


    public void sil(Bolum bolum){

        bolumRepository.delete(bolum);
    }

    public Optional<Bolum> find(long bolumId){

        return bolumRepository.findById(bolumId);
    }


    public List<Bolum> findAll(){

        return bolumRepository.findAll();
    }

    public void update (Bolum bolum){


        bolumRepository.save(bolum);
    }
}
