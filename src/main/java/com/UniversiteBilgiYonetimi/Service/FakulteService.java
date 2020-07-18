package com.UniversiteBilgiYonetimi.Service;

import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Repository.FakulteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FakulteService implements IfakulteService{

    private FakulteRepository fakulteRepository;


    public  void ekle(Fakulte fakulte){

        fakulteRepository.save(fakulte);
    }

    public void sil(Fakulte fakulte){

        fakulteRepository.delete(fakulte);
    }

    public Fakulte find(long fakulteId){

        return fakulteRepository.findFakulte(fakulteId);
    }


    public List<Fakulte> findAll(){

        return fakulteRepository.findAll();
    }

}
