package com.example.springresthelloworld.header;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/dog")
public class DogController {
    /**
     * @RequestHeader anatatsiyasini demak bizga headerdan kelgan malumotlarni korsatish
     * yani uni ushlab olib methodga berib yuborish uchun ishlatilarkan @RequestHeader
     * anatatsiyasini yozganimizdan keyin biz HTTP method(yani POST GET ) orqali murojat qilganimizda
     * headerda malumot kelishi shart ekan aks holda bizda hatolik sodir bolarkan yoki
     * @RequestHeader(value="Content-type",defaultValue="UZ") manashunaqa default qiymatni
     * verib ketishimz kerak bolarkaan.
     */
    @GetMapping("/all")
    public String getAll(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.printf("HEADER %S = %S%n", key, value);
        });
        return "success";
    }
}
