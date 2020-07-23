package com.zzb.Dao;

import java.util.List;

import com.zzb.entity.User;

public interface UserMapper {
	//查看所有信息
	List<User> getalluser();
	
	//增加一条信息
	int adduser(User user);
	
	//删除一条信息
	int deluser(int id);
	
	//根据id查询信息
	User echoUser(Integer id);
	
	//修改一条信息
	int modify(User user);
}
