package com.UniversiteBilgiYonetimi.main;

import com.UniversiteBilgiYonetimi.Model.Fakulte;
import com.UniversiteBilgiYonetimi.Repository.FakulteRepository;
import com.UniversiteBilgiYonetimi.Service.IFakulteService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URISyntaxException;

@SpringBootTest
public class FakulteTest {

    @Autowired
    IFakulteService iFakulteService;
    @Autowired
    FakulteRepository fakulteRepository;

    @Test
    public void getFakulteTest()  {
        Fakulte fakulte=iFakulteService.find(2);
        //Verify request succeed
        Assert.assertEquals(fakulte.getId(),2);
    }

    @Test
    public  void addFakulteTest() {
        Fakulte fakulte =new Fakulte();
        fakulte.setHocaSayısı(10);
        fakulte.setAdi("Mimarlık Fakültesi");
        iFakulteService.ekle(fakulte);


        Assert.assertEquals(true,iFakulteService.find(fakulte.getId())!=null );


    }


    @Test
    public void deleteFakulteTest(){
        Fakulte fakulte =new Fakulte();
        fakulte.setHocaSayısı(10);
        fakulte.setAdi("Eğitim Fakültesi");
        iFakulteService.ekle(fakulte);


        iFakulteService.sil(fakulte);

        Assert.assertTrue(iFakulteService.find(fakulte.getId())==null);



    }


}
