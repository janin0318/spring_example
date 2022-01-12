package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogs")
public class BlogController {

  @GetMapping
  public String index() {
    return "blog/index";
  }

  @GetMapping("/create")
  public String newBlog() {
    return "blog/create";
  }

  @GetMapping("/{blogId}}")
  public String show(@PathVariable int blogId) {
    return "blog/show";
  }

  @GetMapping("{blogId}/edit")
  public String edit(@PathVariable int blogId) {
    return "blog/edit";
  }

  @PostMapping
  public String create() {
    return "redirect:/blogs";
  }

  @PatchMapping("/update/{blogId}")
  public String update(@PathVariable int blogId) {
    return "redirect:/blogs/show";
  }

  @DeleteMapping("/delete/{blogId}")
  public String delete(@PathVariable int blogId) {
    return "redirect:/blogs";
  }
}
