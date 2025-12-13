package com.sashank.QuizApp.DAO;

import com.sashank.QuizApp.*;
import com.sashank.QuizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO extends JpaRepository<Question,Integer> {

    List<Question>findByCategory(String category);
   @Query(value="SELECT * FROM question q where q.category=:category ORDER BY RANDOM() LIMIT: numq",nativeQuery = true)
    List<com.sashank.QuizApp.model.Question> findQuestionsByCategory(String category, int numq);
}
