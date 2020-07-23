package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Notlar;
import com.UniversiteBilgiYonetimi.Repository.NotlarRepository;
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
public class NotlarService implements INotlarService {

    @Autowired
    private NotlarRepository notlarRepository;


    @Override
    public void ekle(Notlar not) {
        notlarRepository.save(not);

    }

    @Override
    public void sil(Notlar not) {
             notlarRepository.delete(not);
    }

    @Override
    public Optional<Notlar> find(long id) {
        return notlarRepository.findById(id) ;
    }

    @Override
    public Page<Notlar> findAll(int pageNo, int pageSize) {
        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return notlarRepository.findAll(pageable);
    }

    @Override
    public void update(Notlar not) {
        notlarRepository.save(not);

    }
}
