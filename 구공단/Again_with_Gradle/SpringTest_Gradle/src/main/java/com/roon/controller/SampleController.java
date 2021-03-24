package com.roon.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
@Log4j
@RequestMapping("/sample/")
public class SampleController {

    @RequestMapping("")
    public String test(Model model) {
        model.addAttribute("msg", "Hello world");
        return "index";
    }
}
