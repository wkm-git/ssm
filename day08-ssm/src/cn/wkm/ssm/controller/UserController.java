package cn.wkm.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.wkm.ssm.bean.User;
import cn.wkm.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model m) {
		List<User> list = userService.SelectListUser();
		m.addAttribute("list", list);
		return "user";
	}
	
	@RequestMapping("/upadte")
	public String upadte(Integer userId) {
		//删除成功后重定向到开始 页面
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer userId) {
		userService.deleteByPrimaryKey(userId);
		//删除成功后重定向到开始 页面
		return "redirect:/user/list.do";
	}
}
