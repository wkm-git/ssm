package cn.wkm.ssm.service;

import java.util.List;

import cn.wkm.ssm.bean.User;

public interface UserService {

	// 查询单个数据
	User selectByOne(Integer id);

	// 查询全部
	List<User> SelectListUser();

	// 添加
	int addUser(User user);

	// 删除
	int deleteByPrimaryKey(int id);

	// 修改
	int updateUser(User user);
}
