package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Model.dto.FakulteEklemeDTO;
import com.UniversiteBilgiYonetimi.Model.dto.GeneralResponse;
import com.UniversiteBilgiYonetimi.Service.IFakulteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
