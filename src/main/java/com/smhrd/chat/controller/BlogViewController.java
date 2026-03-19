package com.smhrd.chat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class BlogViewController {
    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
