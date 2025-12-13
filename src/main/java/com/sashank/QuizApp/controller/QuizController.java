package com.sashank.QuizApp.controller;

import com.sashank.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizservice;
    @PostMapping("/create")
    public ResponseEntity<String> createquiz(@RequestParam String category,@RequestParam int numq,@RequestParam String title){
        return quizservice.createQuiz(category,numq,title);
    }
}
