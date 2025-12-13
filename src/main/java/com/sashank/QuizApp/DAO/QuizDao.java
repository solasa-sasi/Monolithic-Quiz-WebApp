package com.sashank.QuizApp.DAO;

import com.sashank.QuizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository <Quiz,Integer>{

}
