package com.example.demo.service;

import com.example.demo.mapper.BlogRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

  private final BlogRepository blogRepository;

  public String findAll() {
    return blogRepository.findAll();
  }
}
