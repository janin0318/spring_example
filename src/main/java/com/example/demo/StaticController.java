package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {
  @GetMapping("/")
  public String index(Model model) {
    String name = "テスト太郎";
    model.addAttribute("name", name);
    return "index";
  }
}
