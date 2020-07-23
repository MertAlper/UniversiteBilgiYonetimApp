package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Model.Ders;
import com.UniversiteBilgiYonetimi.Model.OgretimUyesi;
import com.UniversiteBilgiYonetimi.Model.dto.GeneralResponse;
import com.UniversiteBilgiYonetimi.Model.dto.OgretimUyesiDTO;
import com.UniversiteBilgiYonetimi.Service.IBolumService;
import com.UniversiteBilgiYonetimi.Service.IDersService;
import com.UniversiteBilgiYonetimi.Service.IOgretımUyesiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/ogretimuyesi")
public class OgretimUyesiController {
    @Autowired
    private IOgretımUyesiService iOgretımUyesiService;
    @Autowired
    private  IBolumService iBolumService;
    @Autowired
    private IDersService iDersService;

    @PostMapping("/add")
    public ResponseEntity<GeneralResponse> addOgretimUyesi(@RequestBody OgretimUyesiDTO hocaDTO) {

        Optional<Bolum> bolum = iBolumService.find(hocaDTO.getBolum());

        if(bolum.get()!= null) {

            OgretimUyesi hoca = new OgretimUyesi();
            hoca.setAd(hocaDTO.getAd());
            hoca.setSoyad(hocaDTO.getSoyad());
            hoca.setBolum(bolum.get());
            hoca.setUnvan(hocaDTO.getUnvan());
            hoca.setEmail(hocaDTO.getEmail());
            hoca.setAlan(hocaDTO.getAlan());
            hoca.setTelefonNo(hocaDTO.getTelefonNo());
            hoca.setŞifre(hocaDTO.getŞifre());

           iOgretımUyesiService.ekle(hoca);

            GeneralResponse response = new GeneralResponse("Öğretim Üyesi Ekleme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Eklemeye çalıştığınız Öğretim Üyesi Bilgisi Yanlış");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<GeneralResponse> deleteOgretimUyesi(@PathVariable  long id){

        OgretimUyesi hoca= iOgretımUyesiService.find(id).get();
        if (hoca!=null){

            iOgretımUyesiService.sil(hoca);
            GeneralResponse response = new GeneralResponse("Öğretim Üyesi silme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }
        else{
            GeneralResponse response = new GeneralResponse("Simeye çalıştığınız Öğretim Üyesi Bilgisi Bulunamadı");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("get/{id}")
    public  OgretimUyesi getOgretimUyesi(@PathVariable  long id){

        Optional<OgretimUyesi> hoca =  iOgretımUyesiService.find(id);

        return hoca.get();

    }

    @GetMapping("get/all{pageNo}/{pageSize}")
    public Page<OgretimUyesi> getAll(@PathVariable  int pageNo, @PathVariable  int pageSize){

        Page<OgretimUyesi> hocalar= iOgretımUyesiService.findAll(pageNo, pageSize);

        return hocalar;

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<GeneralResponse> updateOgrenci(@PathVariable long id  ,@RequestBody OgretimUyesiDTO hocaDTO ) {

        OgretimUyesi hoca = iOgretımUyesiService.find(id).get();

        if(hoca!= null) {


            hoca.setAd(hocaDTO.getAd());
            hoca.setSoyad(hocaDTO.getSoyad());
            hoca.setBolum(iBolumService.find(hocaDTO.getBolum()).get());
            hoca.setUnvan(hocaDTO.getUnvan());
            hoca.setEmail(hocaDTO.getEmail());
            hoca.setAlan(hocaDTO.getAlan());
            hoca.setTelefonNo(hocaDTO.getTelefonNo());
            hoca.setŞifre(hocaDTO.getŞifre());

            iOgretımUyesiService.update(hoca);

            GeneralResponse response = new GeneralResponse("Öğretim Üyesi Güncelleme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Güncellemeye çalıştığınız Öğertim Üyesi bilgisi bulunamadı");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update/ders/{ogrenciId}/{dersId}")
    public ResponseEntity<GeneralResponse> addOgretimUyesi_Ders(@PathVariable long dersId, @PathVariable long hocaId){

        OgretimUyesi ogretimUyesi = iOgretımUyesiService.find(hocaId).get();
        Ders ders= iDersService.find(dersId).get();
        ogretimUyesi.getVerilenDersler().add(ders);

        iOgretımUyesiService.update(ogretimUyesi);


        GeneralResponse response = new GeneralResponse("Ogrenci Güncelleme İşlemi Başarılı");
        return new ResponseEntity<>(response, HttpStatus.CREATED);



    }


}
