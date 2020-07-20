package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Model.Ders;
import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Model.dto.BolumEklemeDTO;
import com.UniversiteBilgiYonetimi.Model.dto.DersDTO;
import com.UniversiteBilgiYonetimi.Model.dto.GeneralResponse;
import com.UniversiteBilgiYonetimi.Service.IBolumService;
import com.UniversiteBilgiYonetimi.Service.IDersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ders")
public class DersController {

    @Autowired
    private IDersService iDersService;

    @PostMapping("/add")
    public ResponseEntity<GeneralResponse> addDers(@RequestBody DersDTO dersDTO) {

        Ders ders =new Ders();
        ders.setAciklama(dersDTO.getAciklama());
        ders.setDersAdi(dersDTO.getDersAdi());
        ders.setDonem(dersDTO.getDonem());
        ders.setKredi(dersDTO.getKredi());
        iDersService.ekle(ders);

        GeneralResponse response = new GeneralResponse("Bolum Ekleme İşlemi Başarılı");
        return new ResponseEntity<>(response, HttpStatus.CREATED);

        }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<GeneralResponse> deleteDers(@PathVariable  long id){

       Ders ders=iDersService.find(id).get();

        if(ders != null) {

            iDersService.sil(ders);
            GeneralResponse response = new GeneralResponse("Ders silme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        } else {
            GeneralResponse response = new GeneralResponse("Girdiğiniz id'ye sahip bir ders bulunamadı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("get/{id}")
    public  Ders getDers(@PathVariable  long id){

      Ders ders =  iDersService.find(id).get();

        return ders;

    }

    @GetMapping("get/all")
    public List<Ders> getDersAll(){

        List<Ders> dersler= iDersService.findAll();

        return dersler;

    }


    @PutMapping("/update/{id}")
    public ResponseEntity<GeneralResponse> updateDers(@PathVariable  long id, @RequestBody DersDTO dersDTO ){


       Ders ders = iDersService.find(id).get();

        if(ders != null) {
            ders.setAciklama(dersDTO.getAciklama());
            ders.setDersAdi(dersDTO.getDersAdi());
            ders.setDonem(dersDTO.getDonem());
            ders.setKredi(dersDTO.getKredi());
            iDersService.update(ders);

            GeneralResponse response = new GeneralResponse("Ders Güncelleme İşlemi Başarılı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Girdiğiniz id'ye sahip bir ders bulunamadı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.NOT_FOUND);
        }

    }


















}



