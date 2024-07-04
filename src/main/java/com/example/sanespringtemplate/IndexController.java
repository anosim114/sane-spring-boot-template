package com.example.sanespringtemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@Slf4j
public class IndexController {

  @GetMapping("")
  public String index(Model model) {
    log.info("index was accessed");

    return "index";
  }
}
