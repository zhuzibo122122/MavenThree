package com.zzb.Service;

import java.util.List;

import com.zzb.entity.User;

public interface UserService {
	//�鿴������Ϣ
	List<User> getalluser();
	
	//����һ����Ϣ
	int adduser(User user);
		
	//ɾ��һ����Ϣ
	int deluser(int id);
		
	//�޸�һ����Ϣ
	int modify(User user);
	
	//����id��ѯ��Ϣ
	User echoUser(Integer id);
}
