package com.esentri.tillklaiber.helloworldfrompivotalcloudfoundry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @Value("${hello.world.variable:No Env-Variable set!}")
  private String message;

  @GetMapping
  public String greeting(){
    return message;

  }
}
