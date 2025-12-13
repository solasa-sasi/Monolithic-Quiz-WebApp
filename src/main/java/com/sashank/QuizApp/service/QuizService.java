package com.sashank.QuizApp.service;

import com.sashank.QuizApp.DAO.QuestionDAO;
import com.sashank.QuizApp.DAO.QuizDao;
import com.sashank.QuizApp.model.Question;
import com.sashank.QuizApp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    QuizDao quizdao;
    @Autowired
    QuestionDAO questionDao;

    public ResponseEntity<String> createQuiz(String category, int numq, String title) {
        List<Question> questions=questionDao.findQuestionsByCategory(category,numq);
        Quiz quiz=new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizdao.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);


    }
}
