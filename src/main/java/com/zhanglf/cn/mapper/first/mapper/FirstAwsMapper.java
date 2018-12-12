package com.zhanglf.cn.mapper.first.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhanglf.cn.domain.AwsBo;

@Mapper
public interface FirstAwsMapper {

	@Select("select * from firstaws where id=#{id}")
	public AwsBo getAwsById(@Param("id")int id);
	
}
