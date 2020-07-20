package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Ders;
import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Repository.BolumRepository;
import com.UniversiteBilgiYonetimi.Repository.DersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DersService implements IDersService {

    @Autowired
    private DersRepository dersRepository;

    @Override
    public void ekle(Ders ders) {
        dersRepository.save(ders);

    }

    @Override
    public void sil(Ders ders) {
        dersRepository.delete(ders);

    }

    @Override
    public Optional<Ders> find(long dersId) {
        return dersRepository.findById(dersId);
    }

    @Override
    public List<Ders> findAll() {
        return dersRepository.findAll();
    }

    @Override
    public void update(Ders ders) {
        dersRepository.save(ders);
    }
}
