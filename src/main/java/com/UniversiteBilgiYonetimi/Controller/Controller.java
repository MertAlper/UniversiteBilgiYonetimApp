package com.UniversiteBilgiYonetimi.Controller;

import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Repository.FakulteRepository;
import com.UniversiteBilgiYonetimi.Service.FakulteService;
import com.UniversiteBilgiYonetimi.Service.IfakulteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fakulte")
public class Controller {

    @Autowired
    IfakulteService service;

    @Autowired

     FakulteRepository repo;


    @RequestMapping(value="/fakulteId/{fakulteId}",method = RequestMethod.GET)
    public   Fakulte getFakulte(@PathVariable long fakulteId){

        return   service.find(fakulteId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Fakulte> getFakulteAll(){

        return   service.findAll();
    }



}
