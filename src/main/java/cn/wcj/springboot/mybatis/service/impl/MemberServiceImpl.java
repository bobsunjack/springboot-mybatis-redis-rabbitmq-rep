package cn.wcj.springboot.mybatis.service.impl;

import java.util.List;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wcj.springboot.mybatis.mapper.TbMemberMapper;
import cn.wcj.springboot.mybatis.pojo.po.TbMember;
import cn.wcj.springboot.mybatis.pojo.po.TbMemberExample;
import cn.wcj.springboot.mybatis.pojo.po.TbMemberExample.Criteria;
import cn.wcj.springboot.mybatis.service.IMemberService;
/**
 * 
 * <p>Module:MemberServiceImpl </p>
 * <p>Description:Member接口的具体实现带上@Service注解，SpringBoot自动识别 </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午8:43:27
 */
@Service
public class MemberServiceImpl implements IMemberService {

	@Autowired
	private TbMemberMapper tbMemberMapper  ;
	
	@Override
	public List<TbMember> findAll() throws Exception {
		return tbMemberMapper.selectByExample(null);
	}

	@Transactional
	@Override
	public Integer doRemove(String id) throws Exception {
		TbMemberExample example=new TbMemberExample();
		Criteria criteria = example.createCriteria();
		criteria.andMidEqualTo(id)   ;
		int count = tbMemberMapper.deleteByExample(example);
		return count;
	}

	@Cacheable(value = "membercache",keyGenerator = "customKeyGenerator")
	@Override
	public TbMember findById(String id) throws Exception {
		TbMemberExample example=new TbMemberExample() ;
		System.out.println("#########查询数据库###############");
		Criteria criteria = example.createCriteria();
		criteria.andMidEqualTo(id)   ;
		TbMember tbMember = tbMemberMapper.selectByExample(example).get(0)  ;
		return tbMember ;
	}
	
	


}
