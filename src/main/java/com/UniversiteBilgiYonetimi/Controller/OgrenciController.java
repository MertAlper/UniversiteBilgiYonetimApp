package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Model.Ders;
import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Model.Ogrenci;
import com.UniversiteBilgiYonetimi.Model.dto.BolumEklemeDTO;
import com.UniversiteBilgiYonetimi.Model.dto.DersDTO;
import com.UniversiteBilgiYonetimi.Model.dto.GeneralResponse;
import com.UniversiteBilgiYonetimi.Model.dto.OgrenciDTO;
import com.UniversiteBilgiYonetimi.Service.IBolumService;
import com.UniversiteBilgiYonetimi.Service.IOgrenciService;
import com.UniversiteBilgiYonetimi.Service.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciController {

    @Autowired
    private IOgrenciService iOgrenciService;

    @Autowired
    private IBolumService iBolumService;

    @PostMapping("/add")
    public ResponseEntity<GeneralResponse> addOgrenci(@RequestBody OgrenciDTO ogrenciDTO) {

        Bolum bolum = iBolumService.find(ogrenciDTO.getBolumId()).get();

        if(bolum!= null) {

            Ogrenci ogrenci =new Ogrenci();
            ogrenci.setAd(ogrenciDTO.getAd());
            ogrenci.setSoyad(ogrenciDTO.getSoyad());
            ogrenci.setBolum(bolum);
            ogrenci.setDogumTarihi(ogrenciDTO.getDogumTarihi());
            ogrenci.setOgrenciNo(ogrenciDTO.getOgrenciNo());
            ogrenci.setEmail(ogrenciDTO.getEmail());
            ogrenci.setSinif(ogrenciDTO.getSinif());
            ogrenci.setTelefonNo(ogrenciDTO.getTelefonNo());
            ogrenci.setŞifre(ogrenciDTO.getŞifre());

            iOgrenciService.ekle(ogrenci);

            GeneralResponse response = new GeneralResponse("Ogrenci Ekleme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Eklemeye çalıştığınız Öğrenci Bilgisi Yanlış");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<GeneralResponse> deleteOgrenci(@PathVariable  long id){

        Ogrenci ogrenci= iOgrenciService.find(id).get();
        if (ogrenci!=null){

            iOgrenciService.sil(ogrenci);
            GeneralResponse response = new GeneralResponse("Öğrenci silme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }
        else{
            GeneralResponse response = new GeneralResponse("Simeye çalıştığınız Öğrenci Bilgisi Bulunamadı");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

        }

    }


    @GetMapping("get/{id}")
    public Ogrenci getOgrenci(@PathVariable  long id){

        Ogrenci ogrenci =  iOgrenciService.find(id).get();

        return ogrenci;

    }

    @GetMapping("get/all")
    public List<Ogrenci> getOgrenciAll(){

        List<Ogrenci> ogrenciler= iOgrenciService.findAll();

        return ogrenciler;

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<GeneralResponse> updateOgrenci(@PathVariable long id  ,@RequestBody OgrenciDTO ogrenciDTO) {

        Ogrenci ogrenci = iOgrenciService.find(id).get();

        if(ogrenci!= null) {


            ogrenci.setAd(ogrenciDTO.getAd());
            ogrenci.setSoyad(ogrenciDTO.getSoyad());
            ogrenci.setBolum(iBolumService.find(ogrenciDTO.getBolumId()).get());
            ogrenci.setDogumTarihi(ogrenciDTO.getDogumTarihi());
            ogrenci.setEmail(ogrenciDTO.getEmail());
            ogrenci.setSinif(ogrenciDTO.getSinif());
            ogrenci.setTelefonNo(ogrenciDTO.getTelefonNo());
            ogrenci.setŞifre(ogrenciDTO.getŞifre());

            iOgrenciService.update(ogrenci);

            GeneralResponse response = new GeneralResponse("Ogrenci Güncelleme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Güncellemeye çalıştığınız Öğrenci bilgisi bulunamadı");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }





}
