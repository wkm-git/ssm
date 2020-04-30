package cn.wkm.ssm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wkm.ssm.bean.User;
import cn.wkm.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springdao.xml")
public class UserServiceTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testSelectByOne() {
	}

	@Test
	public void testSelectListUser() {
		List<User> list = userService.SelectListUser();
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testAddUser() {
	}

	@Test
	public void testDeleteByPrimaryKey() {
	}

	@Test
	public void testUpdateUser() {
	}

}
