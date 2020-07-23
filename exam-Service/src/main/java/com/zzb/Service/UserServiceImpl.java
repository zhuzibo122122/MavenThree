package com.zzb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzb.Dao.UserMapper;
import com.zzb.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	//查看所有信息方法
	public List<User> getalluser() {
		// TODO Auto-generated method stub
		return userMapper.getalluser();
	}

	@Override
	public int adduser(User user) {
		// TODO Auto-generated method stub
		return userMapper.adduser(user);
	}

	@Override
	public int deluser(int id) {
		// TODO Auto-generated method stub
		return userMapper.deluser(id);
	}

	@Override
	public int modify(User user) {
		// TODO Auto-generated method stub
		return userMapper.modify(user);
	}

	@Override
	public User echoUser(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.echoUser(id);
	}

}
