package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Model.dto.BolumEklemeDTO;
import com.UniversiteBilgiYonetimi.Model.dto.GeneralResponse;
import com.UniversiteBilgiYonetimi.Service.IBolumService;
import com.UniversiteBilgiYonetimi.Service.IFakulteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
