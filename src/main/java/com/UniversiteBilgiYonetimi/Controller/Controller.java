package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Service.FakulteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    FakulteService service;

    @GetMapping("/fakulte/{fakulteId}")
    public Fakulte getFakulte( @PathVariable long fakulteId){
        return  service.find(fakulteId);
    }



}
