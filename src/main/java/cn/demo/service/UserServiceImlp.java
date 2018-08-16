package cn.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.demo.dao.UserMapper;
import cn.demo.entity.User;

@Service
public class UserServiceImlp implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> getUsers() {
		return userMapper.getUsers();
	}
}
