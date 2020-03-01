package com.ankesh.cdkCommunityDev.controllers;

import com.ankesh.cdkCommunityDev.mappers.AnswersMapper;
import com.ankesh.cdkCommunityDev.mappers.QuestionsMapper;
import com.ankesh.cdkCommunityDev.models.Questions;
import com.ankesh.cdkCommunityDev.models.User;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@EnableTransactionManagement
@RestController
@RequestMapping("/Questions")
public class QuestionsController {
    @Autowired
  private QuestionsMapper questionsMapper;
    @Autowired
    private AnswersMapper answersMapper;

@RequestMapping("/All")
  public void getAll(){

   }
@GetMapping("/byUser/{userId}")
  public List<String> AllQuestionsByUser(@PathVariable String userId){
      System.out.println("I came in here");
    return questionsMapper.findAllQuestionsByUser(userId);
  }

@RequestMapping()
  public void findUserByQuestion(){

   }

   @PostMapping("/AddQuestion")
public String  postQuestion(@RequestBody Questions question){

    int rtrn= questionsMapper.postQuestion(question);

    if(rtrn==1)
        return "Data inserted successfully.";
    else
        return "Data insertion error. Kindly check logs.";

}

@DeleteMapping("/deleteQuestion/{qid}")
public String deleteQuestion(@PathVariable int qid){

    int returnCode = questionsMapper.deleteQuestion(qid);
    if(returnCode==1)
        return "Data deleted successfully.";
    else
        return "Data deletion error. Kindly check logs.";

}

@Transactional(propagation = Propagation.REQUIRED)
@PostMapping("/UpdateQuestion")
    public String updateQuestion(@RequestBody Questions question) {
        answersMapper.deleteAnswer(question.getqId());

        int rCode = questionsMapper.deleteQuestion(question.getqId());
        if (rCode == 0) {
           throw new RuntimeException("Question updation error. Kindly check logs.");
        }
        rCode = questionsMapper.postQuestion(question);
        if (rCode == 0) {
            throw new RuntimeException("Question updation error. Kindly check logs.");
        }

        return "Question updated successfully.";

}

}
