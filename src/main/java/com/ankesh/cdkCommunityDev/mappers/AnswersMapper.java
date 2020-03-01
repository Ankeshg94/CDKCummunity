package com.ankesh.cdkCommunityDev.mappers;

import com.ankesh.cdkCommunityDev.models.Answers;
import org.apache.ibatis.annotations.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Generated;

@Mapper
@EnableTransactionManagement
@Transactional
public interface AnswersMapper {
    @Insert("insert into Answers values(#{aId}, #{desc},#{userId},#{qId})")
    int insertQuestion(Answers answer);

    @Select("select max(AId) from Answers")
    String getRows();

    @Delete("Delete from Answers where QuestionId=#{qId}")
    int deleteAnswer(int qId);
}
