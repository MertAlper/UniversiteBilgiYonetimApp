package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.OgretimUyesi;
import com.UniversiteBilgiYonetimi.Repository.OgretımUyesiRepository;
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
public class OgretımUyesiService  implements  IOgretımUyesiService{
    @Autowired
    OgretımUyesiRepository repository;


    @Override
    public void ekle(OgretimUyesi ogretimUyesi) {
        repository.save(ogretimUyesi);

    }

    @Override
    public void sil(OgretimUyesi ogretimUyesi) {
        repository.delete(ogretimUyesi);

    }

    @Override
    public Optional<OgretimUyesi> find(long id) {

        return repository.findById(id);
    }

    @Override
    public Page<OgretimUyesi> findAll(int pageNo, int pageSize) {
        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return repository.findAll(pageable);
    }

    @Override
    public void update(OgretimUyesi ogretimUyesi) {
        repository.save(ogretimUyesi);

    }
}
