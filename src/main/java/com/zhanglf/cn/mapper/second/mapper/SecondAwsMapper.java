package com.zhanglf.cn.mapper.second.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.zhanglf.cn.domain.AwsBo;

@Mapper
public interface SecondAwsMapper {

	@Insert("insert into secondaws(url,addtime,adduser) values(#{url},#{addtime},#{addUser})")
	public void insertAws(AwsBo aws);
}
