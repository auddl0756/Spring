package com.roon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roon.domain.BoardVO;
import com.roon.domain.Criteria;
import com.roon.domain.ReplyVO;
import com.roon.mapper.BoardMapper;
import com.roon.mapper.ReplyMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ReplyServiceImpl implements ReplyService {
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;
	
	
	/* board 댓글 수 1 증가도 함께 처리 */
	@Transactional
	@Override
	public int register(ReplyVO vo) {
		log.info("register..."+vo);
		boardMapper.updateReplyCnt(vo.getBno(), 1);
		return mapper.insert(vo);
	}
	
	@Override
	public ReplyVO get(Long rno) {
		log.info("get..." +rno);
		return mapper.read(rno);
	}
	
	@Override
	public int modify(ReplyVO vo) {
		log.info("modify... "+vo);
		return mapper.update(vo);
	}
	
	/* board 댓글 수 감소도 함께 처리 */
	@Transactional
	@Override
	public int remove(Long rno) {
		log.info("remove... "+rno);
		ReplyVO vo= mapper.read(rno);
		boardMapper.updateReplyCnt(vo.getBno(), -1);
		return mapper.delete(rno);
	}
	
	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) {
		log.info("get reply list of a board "+bno);
		return mapper.getListWithPaging(cri, bno);
	}
	
	
	
}
