package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Repository.BolumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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


    public Page<Bolum> findAll(int pageNo, int pageSize){

        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return bolumRepository.findAll(pageable);
    }

    public void update (Bolum bolum){


        bolumRepository.save(bolum);
    }
}
