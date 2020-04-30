package cn.wkm.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import cn.wkm.ssm.bean.User;

public interface UserMapper {
	
	//查询单个数据
	User selectByOne(Integer id);
	
	//查询全部
	@Select("select * from t_user")
	List<User> SelectListUser();
	
	//添加
	int addUser(User user);
	
	//删除
	@Delete("delete from t_user where id = #{id}")
	int deleteByPrimaryKey(int id);
	
	//修改
	int updateUser(User user);
}
