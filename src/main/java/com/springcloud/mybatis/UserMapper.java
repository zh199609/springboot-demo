package com.springcloud.mybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
	@Select("SELECT * FROM T_USER WHERE PHONE = #{phone}")
	User findUserByPhone(@Param("phone")String phone) ;
	
	
	@Insert("INSERT INTO T_USER(NAME,PASSWORD,PHONE) VALUES(#{name}, #{password}, #{phone})")
	int saveUser(User user);
}
