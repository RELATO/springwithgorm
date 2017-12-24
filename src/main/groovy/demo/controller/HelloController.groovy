package demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Hello {
  @RequestMapping("/hello")
  String hello() {
    "Hello JournalDev World."
  }
}