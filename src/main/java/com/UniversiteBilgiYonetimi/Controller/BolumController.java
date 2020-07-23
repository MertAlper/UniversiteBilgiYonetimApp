package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Model.dto.BolumEklemeDTO;
import com.UniversiteBilgiYonetimi.Model.dto.FakulteEklemeDTO;
import com.UniversiteBilgiYonetimi.Model.dto.GeneralResponse;
import com.UniversiteBilgiYonetimi.Service.IBolumService;
import com.UniversiteBilgiYonetimi.Service.IFakulteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bolum")
public class BolumController {

    @Autowired
    private IFakulteService iFakulteService;

    @Autowired
    private IBolumService iBolumService;

    @PostMapping("/add")
    public ResponseEntity<GeneralResponse> addBolum(@RequestBody BolumEklemeDTO bolumEklemeDTO) {

        Fakulte fakulte = iFakulteService.find(bolumEklemeDTO.getFakulteId());

        if(fakulte != null) {

            Bolum bolum = new Bolum();
            bolum.setAdi(bolumEklemeDTO.getBolumAdi());
            bolum.setFakulte(fakulte);

            iBolumService.ekle(bolum);

            GeneralResponse response = new GeneralResponse("Bolum Ekleme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Eklemeye çalıştığınız Fakülte Bilgisi Yanlış");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<GeneralResponse> deleteBolum(@PathVariable  long id){

       Bolum Bolum=iBolumService.find(id).get();

        if(Bolum != null) {

            iBolumService.sil(Bolum);

            GeneralResponse response = new GeneralResponse("Bolum Silme İşlemi Başarılı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.ACCEPTED);
        } else {
            GeneralResponse response = new GeneralResponse("Girdiğiniz id'ye sahip bir bölüm bulunamadı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("get/{id}")
    public  Bolum getBolum(@PathVariable  long id){

       Bolum bolum =  iBolumService.find(id).get();

        return bolum;

    }

    @GetMapping("get/all/{pageNo}/{pageSize}")
    public Page<Bolum> getBolumAll(@PathVariable  int pageNo, @PathVariable  int pageSize){

        Page<Bolum> bolumler= iBolumService.findAll(pageNo, pageSize);

        return bolumler;

    }


    @PutMapping("/update/{id}")
    public ResponseEntity<GeneralResponse> updateBolum(@PathVariable  long id, @RequestBody BolumEklemeDTO bolumGuncellemeDTO ){


       Bolum Bolum = iBolumService.find(id).get();

        if(Bolum != null) {

            Bolum.setAdi(bolumGuncellemeDTO.getBolumAdi());
            Fakulte fakulte = iFakulteService.find(bolumGuncellemeDTO .getFakulteId());
            Bolum.setFakulte(fakulte);
            iBolumService.update(Bolum);


            GeneralResponse response = new GeneralResponse("Bolum Güncelleme İşlemi Başarılı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Girdiğiniz id'ye sahip bir bölüm bulunamadı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.NOT_FOUND);
        }

     }





}
