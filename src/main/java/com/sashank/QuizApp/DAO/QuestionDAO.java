package com.sashank.QuizApp.DAO;

import com.sashank.QuizApp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDAO extends JpaRepository<Question,Integer> {

//    public void getAllQuestions() {
//
//
//    }
}
