package com.roon.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface Sample2Mapper {
	@Insert("insert into tbl_sample2 (col2) values (#{data})")
	public int insertCol2(String data);
	
//	@Select("select * from tbl_sample2")
//	public String show();
}
