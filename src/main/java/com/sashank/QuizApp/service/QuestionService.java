package com.sashank.QuizApp.service;

import com.sashank.QuizApp.DAO.QuestionDAO;
import com.sashank.QuizApp.*;
import com.sashank.QuizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDAO questiondao;
    public ResponseEntity<List<Question>> getAllQuestions() {
        try{
//       return questiondao.findAll();
            return new ResponseEntity<>(questiondao.findAll(), HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        try{
//        return questiondao.findByCategory(category);
        return new ResponseEntity<>(questiondao.findByCategory(category),HttpStatus.OK);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
        questiondao.save(question);
        return new ResponseEntity<>("success",HttpStatus.CREATED);

    }

}


//public Question addQuestion(Question question) {
//    // Save returns the saved entity with generated ID
//    return questiondao.save(question);
//}