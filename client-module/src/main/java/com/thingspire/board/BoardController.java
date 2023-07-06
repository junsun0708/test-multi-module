package com.thingspire.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board/t1")
public class BoardController {

  @GetMapping("test")
  public String test() {
    return "board test";
  }
}
