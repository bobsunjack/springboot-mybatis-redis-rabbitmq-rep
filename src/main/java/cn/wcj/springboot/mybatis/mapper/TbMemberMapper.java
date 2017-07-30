package cn.wcj.springboot.mybatis.mapper;

import cn.wcj.springboot.mybatis.pojo.po.TbMember;
import cn.wcj.springboot.mybatis.pojo.po.TbMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMemberMapper {
    int countByExample(TbMemberExample example);

    int deleteByExample(TbMemberExample example);

    int insert(TbMember record);

    int insertSelective(TbMember record);

    List<TbMember> selectByExample(TbMemberExample example);

    int updateByExampleSelective(@Param("record") TbMember record, @Param("example") TbMemberExample example);

    int updateByExample(@Param("record") TbMember record, @Param("example") TbMemberExample example);
}