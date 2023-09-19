package com.example;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Value;

@Context
public class Config {

  @Value("${onestock-event.topic}")
  private String topicOrderResilience;

}
