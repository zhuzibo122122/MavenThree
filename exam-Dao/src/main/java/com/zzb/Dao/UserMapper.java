package com.zzb.Dao;

import java.util.List;

import com.zzb.entity.User;

public interface UserMapper {
	//�鿴������Ϣ
	List<User> getalluser();
	
	//����һ����Ϣ
	int adduser(User user);
	
	//ɾ��һ����Ϣ
	int deluser(int id);
	
	//����id��ѯ��Ϣ
	User echoUser(Integer id);
	
	//�޸�һ����Ϣ
	int modify(User user);
}
