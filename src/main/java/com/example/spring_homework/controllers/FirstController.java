package com.example.spring_homework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String helloWorld() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String info() {
        return "Имя ученика: Сергей, название проекта: SpringHomeWork, дата создания проекта: 23.01.2023, описание: проект по введению в Maven и сборку проектов";
    }
}