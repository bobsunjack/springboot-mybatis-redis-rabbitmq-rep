package cn.wcj.springboot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.wcj.springboot.mybatis.pojo.po.TbMember;
import cn.wcj.springboot.mybatis.service.IMemberService;

/**
 * 
 * <p>Module:MemberController </p>
 * <p>Description:Member控制层 </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午11:47:02
 */
@RequestMapping("/Member")
@Controller
public class MemberController {

	@Autowired
	private IMemberService memberService   ;
	
	@RequestMapping("/query/{id}")
	public String query(@PathVariable("id")String id,Model model)throws Exception{
		   TbMember member = memberService.findById(id)  ;  //根据ID查询Member
		   model.addAttribute("member", member)  ; //存值
		   return "member" ;
	}
	
}
