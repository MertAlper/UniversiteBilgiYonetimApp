package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Model.dto.FakulteEklemeDTO;
import com.UniversiteBilgiYonetimi.Model.dto.GeneralResponse;
import com.UniversiteBilgiYonetimi.Service.IFakulteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fakulte")
public class FakulteController {

    @Autowired
    private IFakulteService iFakulteService;

    @PostMapping("/add")
    public ResponseEntity<GeneralResponse> addFakulte(@RequestBody FakulteEklemeDTO fakulteEklemeDTO) {

        Fakulte fakulte = new Fakulte();
        fakulte.setAdi(fakulteEklemeDTO.getFakulteAdi());
        fakulte.setHocaSayısı(fakulteEklemeDTO.getHocaSayisi());

        iFakulteService.ekle(fakulte);

        GeneralResponse response = new GeneralResponse("Fakulte Ekleme İşlemi Başarılı");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<GeneralResponse> deleteFakulte(@PathVariable  long id){

        Fakulte fakulte=iFakulteService.find(id);


        if(fakulte != null) {

            iFakulteService.sil(fakulte);
            GeneralResponse response = new GeneralResponse("Fakulte silme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);

        } else {
            GeneralResponse response = new GeneralResponse("Girdiğiniz ID'ye sahip bir fakülte bulunamadı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.NOT_FOUND);
        }




    }

    @GetMapping("get/{id}")
    public  Fakulte getFakulte(@PathVariable  long id){

        Fakulte fakulte= iFakulteService.find(id);

        return fakulte;

    }


    @GetMapping("get/all")
    public List<Fakulte> getFakulteAll(){

        List<Fakulte> fakulteler= iFakulteService.findAll();

        return fakulteler;

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<GeneralResponse> updateFakulte(@PathVariable  long id, @RequestBody FakulteEklemeDTO fakulteGuncellemeDTO ){
        Fakulte fakulte= iFakulteService.find(id);


        if(fakulte != null) {
            fakulte.setAdi(fakulteGuncellemeDTO.getFakulteAdi());
            fakulte.setHocaSayısı(fakulteGuncellemeDTO.getHocaSayisi());
            iFakulteService.update(fakulte);


            GeneralResponse response = new GeneralResponse("Fakulte Güncelleme İşlemi Başarılı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Girdiğiniz ID'ye sahip bir fakülte bulunamadı");
            return new ResponseEntity<GeneralResponse>(response, HttpStatus.NOT_FOUND);
        }




    }



}
