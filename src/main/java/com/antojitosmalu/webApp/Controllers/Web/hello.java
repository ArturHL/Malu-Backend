package com.antojitosmalu.webApp.Controllers.Web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/test")
public class hello {

  @GetMapping("/hello")
  public String getTest(){
    return "Hello World!";
  }
}
