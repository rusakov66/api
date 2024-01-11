package com.home.api.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired UserController userController;
    @GetMapping("/api")
    public String showApiPage() {
        return "api"; // Возвращаем имя HTML-шаблона без расширения
    }

    @GetMapping("/process")
    @ResponseBody
    public String processApiRequest(@RequestParam("apiRequest") String apiRequest) {
        // Здесь вы можете обработать API запрос и вернуть результат в виде текста
        // Например:
        String response = "Response for API Request: " + apiRequest + userController.getAllUsers();;
        userController.getAllUsers();
        System.out.println("1111111111111111111111111111111111111111111111111");
        return response;
    }

    @GetMapping("/process2")
    @ResponseBody
    public String processApiRequest2(@RequestParam("apiRequest2") String apiRequest) {
        // Здесь вы можете обработать API запрос и вернуть результат в виде текста
        // Например:
        String response = "Response for API Request: " + apiRequest + userController.getAllUsers();;
        userController.getAllUsers();
        System.out.println("2222222222222222222222222222222222222222222");
        return response;
    }

    @PostMapping("/database-request")
    @ResponseBody
    public String processDatabaseRequest(@RequestParam("dbRequest") String dbRequest) {
        // Здесь обработайте dbRequest и выполните операции с базой данных
        // Например:
        String response = "Response for Database Request: " + dbRequest;
        return response;
    }

}
