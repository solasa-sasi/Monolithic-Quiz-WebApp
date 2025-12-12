package com.sashank.QuizApp.service;

import com.sashank.QuizApp.DAO.QuestionDAO;
import com.sashank.QuizApp.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDAO questiondao;
    public List<Question> getAllQuestions() {
       return questiondao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questiondao.findByCategory(category);
    }
}
