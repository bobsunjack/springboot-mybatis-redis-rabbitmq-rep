package cn.wcj.springboot.mybatis.service;

import java.util.List;

import cn.wcj.springboot.mybatis.pojo.po.TbMember;

/**
 * 
 * <p>Module:IMemberService </p>
 * <p>Description:Member模块api </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午8:25:36
 */
public interface IMemberService {

	List<TbMember> findAll()throws Exception ;
	
	Integer doRemove(String id)throws Exception ;
	
	TbMember findById(String id)throws Exception ;
}
