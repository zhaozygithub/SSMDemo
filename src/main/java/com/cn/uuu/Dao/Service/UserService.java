package com.cn.uuu.Dao.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.uuu.Dao.UserTMapper;
import com.cn.uuu.Dao.po.UserT;

@Service("UserService")
public class UserService {
	@Autowired
	private UserTMapper userTMapper;

	public UserT getUserbyID(String id) {
		return userTMapper.selectByPrimaryKey(Integer.parseInt(id));
	}

	public UserT getUserbyID(Integer id) {
		// TODO Auto-generated method stub
		return userTMapper.selectByPrimaryKey(id);
	}
}
