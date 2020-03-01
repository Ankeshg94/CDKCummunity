package com.ankesh.cdkCommunityDev.mappers;

import com.ankesh.cdkCommunityDev.models.Questions;
import com.ankesh.cdkCommunityDev.models.User;
import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
@EnableTransactionManagement
@Transactional
public interface QuestionsMapper {
    @Select("select description from Questions where userId = #{userId}")
    List<String> findAllQuestionsByUser(String userId);

    @Insert("Insert into Questions(description,userId) values(#{desc}, #{u_id})")
    @Options(useGeneratedKeys =true, keyProperty = "qId", keyColumn = "QID")
      int postQuestion(Questions questions);

    @Delete("delete from Questions where QID = #{qid}")
    int deleteQuestion(int qid);

}