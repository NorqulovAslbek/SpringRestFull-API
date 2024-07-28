package com.example.springresthelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    /**
     * @GetMapping("/hello")  -> anatatsiyasi asosan Get HTTP zaproslari uchun ishlatiladi u orqali bila asosan malumotlarni
     * serverdan get qilib olishimiz mumkun. Bu anatatsiya kelib chiqishi ozi @RequestMapping(value="/hello",method=RequestMethod.GET)
     * methodidan kelib chiqqan. Hozirda dastuchilar qisqartirib @GetMapping yozib qoyishadi.
     *
     **/
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello() {
        return "Salom mazgi. Qalaysiz bormisiz.";
    }

    @GetMapping("/buy")
    public String sayBuy() {
        return "Bo'ldimi. Yaxshi boring.";
    }
}
