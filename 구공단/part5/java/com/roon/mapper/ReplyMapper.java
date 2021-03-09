package com.roon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.roon.domain.Criteria;
import com.roon.domain.ReplyVO;

public interface ReplyMapper {
	
	//create
	public int insert(ReplyVO vo);
	
	//read
	public ReplyVO read(Long bno);
	
	//delete
	public int delete(Long rno);
	
	//update
	public int update(ReplyVO reply);
	
	public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cri,@Param("bno") Long bno);
}
