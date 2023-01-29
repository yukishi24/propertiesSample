package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.config.YamlProperties;

@Controller
public class homeController {

  @Autowired
  private YamlProperties properties;

  @GetMapping("/")
  public String getHome() {
    return "home";
  }

  @PostMapping("/result")
  public String postRequestResult(Model model) {
    model.addAttribute("sample", properties.getSample());
    model.addAttribute("name",properties.getName());
    return "result";
  }
}
