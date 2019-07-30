package com.sinaungoding.akademik.client;

import com.sinaungoding.akademik.client.entitas.Mahasiswa;
import com.sinaungoding.akademik.client.service.AkademikRestClient;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientApplicationTests {

    @Autowired
    private AkademikRestClient akademikRestClient;

    @Ignore
    @Test
    public void getMahasiswasTest() {
        String response = akademikRestClient.getMahasiswas();
        assertTrue(response != null && !response.isEmpty());
    }

    @Ignore
    @Test
    public void getMahasiswasByNimTest() {
        Mahasiswa response = akademikRestClient.getMahasiswaByNim("075410099");
        assertTrue(response != null);
    }

    @Ignore
    @Test
    public void getMahasiswasByNamaTest() {
        String response = akademikRestClient.getMahasiswaNama("noprianto");
        assertTrue(response != null && !response.isEmpty());
    }

    @Test
    public void insertMahasiswasTest() {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("075410105");
        mahasiswa.setIpk(2.50F);
        mahasiswa.setJurusan("Teknologi Informasi");
        mahasiswa.setNama("Fullan Bin Fudail");
        assertTrue(akademikRestClient.insert(mahasiswa));
    }

}
