package com.UniversiteBilgiYonetimi.Controller;


import com.UniversiteBilgiYonetimi.Model.Ders;
import com.UniversiteBilgiYonetimi.Model.Notlar;
import com.UniversiteBilgiYonetimi.Model.Ogrenci;
import com.UniversiteBilgiYonetimi.Model.dto.GeneralResponse;
import com.UniversiteBilgiYonetimi.Model.dto.NotDTO;
import com.UniversiteBilgiYonetimi.Service.IDersService;
import com.UniversiteBilgiYonetimi.Service.INotlarService;
import com.UniversiteBilgiYonetimi.Service.IOgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notlar")
public class NotController {

    @Autowired
    INotlarService iNotlarService;
    @Autowired
    IOgrenciService iOgrenciService;
    @Autowired
    IDersService iDersService;

    @PostMapping("/add")
    public ResponseEntity<GeneralResponse> addNot(@RequestBody NotDTO notDTO) {

        Ogrenci ogrenci= iOgrenciService.find(notDTO.getOgrenciId()).get();
        Ders ders= iDersService.find(notDTO.getDersId()).get();



        if(ders!= null && ogrenci!=null) {

            Notlar not =new Notlar();
            not.setDers(ders);
            not.setOgrenci(ogrenci);
            not.setHarfNotu(notDTO.getHarfNotu());
            iNotlarService.ekle(not);


            GeneralResponse response = new GeneralResponse("Not Ekleme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Eklemeye çalıştığınız Not Bilgisi Yanlış");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<GeneralResponse> deleteNot(@PathVariable  long id){

        Notlar not = iNotlarService.find(id).get();
        if (not!=null){

            iNotlarService.sil(not);
            GeneralResponse response = new GeneralResponse("not silme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }
        else{
            GeneralResponse response = new GeneralResponse("Silmeye çalıştığınız not Bilgisi Bulunamadı");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

        }

    }


    @GetMapping("get/{id}")
    public  Notlar getNot(@PathVariable  long id){

        Notlar not =  iNotlarService.find(id).get();

        return not;

    }

    @GetMapping("get/all{pageNo}/{pageSize}")
    public Page<Notlar> getNotAll(@PathVariable  int pageNo, @PathVariable  int pageSize){

        Page<Notlar> notlar= iNotlarService.findAll(pageNo, pageSize);

        return notlar;

    }


    @PutMapping("/update/{id}")
    public ResponseEntity<GeneralResponse> updateNot(@PathVariable long id  ,@RequestBody NotDTO notDTO) {


        Notlar not=iNotlarService.find(id).get();


        if(not!= null) {

            Ogrenci ogrenci= iOgrenciService.find(notDTO.getOgrenciId()).get();
            Ders ders= iDersService.find(notDTO.getDersId()).get();

            not.setOgrenci(ogrenci);
            not.setDers(ders);
            not.setHarfNotu(notDTO.getHarfNotu());
            iNotlarService.update(not);

            GeneralResponse response = new GeneralResponse("Not Güncelleme İşlemi Başarılı");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            GeneralResponse response = new GeneralResponse("Güncellemeye çalıştığınız not bilgisi bulunamadı");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }



}
