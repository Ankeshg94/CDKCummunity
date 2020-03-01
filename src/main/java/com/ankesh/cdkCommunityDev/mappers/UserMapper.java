package com.ankesh.cdkCommunityDev.mappers;


import com.ankesh.cdkCommunityDev.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;


@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
}
