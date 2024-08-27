package com.rismy.foe_room_reservation.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public  class hello {
    @RequestMapping("/")
    public String hello(){
    return "hello guys";
}}
