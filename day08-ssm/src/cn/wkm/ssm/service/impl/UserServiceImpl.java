package cn.wkm.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wkm.ssm.bean.User;
import cn.wkm.ssm.mapper.UserMapper;
import cn.wkm.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	/**
	 * 
	 * 问题:UserMapper映射接口的代理对象如何创建
	 * -----------
	 * 使用Spring之前
	 * 1、读取mybatis-confg.xml创建SqlSessionFactory MyBatis的工厂对象
	 * 
	 * 2、使用工厂创建 SqlSession会话对象
	 * 	SqlSession sqlsession = factory.openSession();
	 * 3，使用SqlSession创建映射接口的代理对象
	 *    UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
	 * 
	 * 
	 * 使用Spring创建
	 * 因为Mybatis和Spring框架进行集成，所有相关的集成代码都在mybatis和spring集成的桥梁包中
	 *   mybatis-spring-1.3.1.jar中
	 *   
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectByOne(Integer id) {
		return userMapper.selectByOne(id);
	}

	@Override
	public List<User> SelectListUser() {
		return userMapper.SelectListUser();
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateUser(user);
	}

}
