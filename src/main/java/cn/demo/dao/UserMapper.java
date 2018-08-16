package cn.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.demo.entity.User;

@Mapper
public interface UserMapper {

	@Select("select * from user")
	List<User> getUsers();
	
}
