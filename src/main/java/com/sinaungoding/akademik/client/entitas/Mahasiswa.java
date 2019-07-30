/*
 * client
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 7/30/19, 8:30 AM
 * Blog    : sinaungoding.com
 * Email   : noprianto@sinaungoding.com,lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.sinaungoding.akademik.client.entitas;

import lombok.Data;

@Data
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private float ipk;
}
