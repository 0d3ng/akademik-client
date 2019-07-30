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
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class AkademikRestClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(AkademikRestClient.class.getName());

    @Value(value = "${base.url}")
    private String basUrl;
    @Autowired
    private RestTemplate restTemplate;

    public String getMahasiswas() {
        String response = restTemplate.getForObject(basUrl + "/api/mahasiswa", String.class);
        LOGGER.info(response);
        return response;
    }

    public Mahasiswa getMahasiswaByNim(String nim) {
        Mahasiswa mahasiswa = restTemplate.getForObject(basUrl + "/api/mahasiswa/{nim}", Mahasiswa.class, nim);
        LOGGER.info(mahasiswa.toString());
        return mahasiswa;
    }

    public String getMahasiswaNama(String nama) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(basUrl + "/api/mahasiswaNama")
                .queryParam("nama", nama);
        LOGGER.info(builder.toUriString());
        String response = restTemplate.getForObject(builder.toUriString(), String.class);
        LOGGER.info(response);
        return response;
    }

    public boolean insert(Mahasiswa mahasiswa) {
        HttpEntity<Mahasiswa> mahasiswaHttpEntity = new HttpEntity<>(mahasiswa);
        ResponseEntity<String> response = restTemplate.exchange(basUrl + "/api/mahasiswa", HttpMethod.POST, mahasiswaHttpEntity, String.class);
        LOGGER.info("" + response.getStatusCode().value());
        return (HttpStatus.CREATED.value() == response.getStatusCodeValue());
    }

}
