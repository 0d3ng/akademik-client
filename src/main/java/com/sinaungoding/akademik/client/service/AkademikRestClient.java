/*
 * client
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/30/19, 8:34 AM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.akademik.client.service;

import com.sinaungoding.akademik.client.entitas.Mahasiswa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class AkademikRestClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(AkademikRestClient.class.getName());

    @Value(value = "${base.url}")
    private String basUrl;
    @Autowired
    private RestTemplate restTemplate;

    public String getMahasiswas() {
        String response = restTemplate.getForObject(basUrl + "/api/mahasiswa", String.class, new Object() {
        });
        LOGGER.info(response);
        return response;
    }

    public Mahasiswa getMahasiswaByNim(String nim) {
        Mahasiswa mahasiswa = restTemplate.getForObject(basUrl + "/api/mahasiswa/{nim}", Mahasiswa.class, nim);
        LOGGER.info(mahasiswa.toString());
        return mahasiswa;
    }
//
//    public List<Mahasiswa> getMahasiswaNama(String nama) {
//        return restTemplate.getForObject(basUrl + "/api/mahasiswaNama", Page.class, nama).getContent();
//    }

}
