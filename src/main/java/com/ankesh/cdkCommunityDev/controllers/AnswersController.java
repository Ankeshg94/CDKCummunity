package com.ankesh.cdkCommunityDev.controllers;

import com.ankesh.cdkCommunityDev.mappers.AnswersMapper;
import com.ankesh.cdkCommunityDev.models.Answers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value =  {"/Answer","/api"})
public class AnswersController {
@Autowired
  private AnswersMapper answersMapper;

@PostMapping("/addAnswer")
    public  String addAnswer(@RequestBody Answers answer) {
    String rows =answersMapper.getRows();
    if(rows==null)
        rows="A-99";
    int id = Integer.parseInt(rows.substring(2))+1;
    answer.setaId("A-"+id);
    int returnCode = answersMapper.insertQuestion(answer);
    if (returnCode == 1) {

        return "Answer posted successfully";
    } else {
        return "Something happend....we are on it";
    }
}
    public void findAllAnswerByQuestionId(){}

    public void findAllAnswerByUserId(){}

    public void deleteAnswer(){}

    public void updateAnswer(){}

}
