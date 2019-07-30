package com.sinaungoding.akademik.client;

import com.sinaungoding.akademik.client.entitas.Mahasiswa;
import com.sinaungoding.akademik.client.service.AkademikRestClient;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientApplicationTests {

    @Autowired
    private AkademikRestClient akademikRestClient;

    @Test
    public void getMahasiswasTest() {
        String response = akademikRestClient.getMahasiswas();
        assertTrue(response != null && !response.isEmpty());
    }

    @Test
    public void getMahasiswasByNimTest() {
        Mahasiswa response = akademikRestClient.getMahasiswaByNim("075410099");
        assertTrue(response != null);
    }

}
