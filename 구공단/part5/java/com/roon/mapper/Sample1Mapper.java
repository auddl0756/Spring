package com.roon.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface Sample1Mapper {
	@Insert("insert into tbl_sample1 (col1) values (#{data}) ")
	public int insertCol1(String data);
	
//	@Select("select * from tbl_sample1")
//	public String show();
}
