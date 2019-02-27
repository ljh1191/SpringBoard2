package org.zerock.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

@Service
public class BaordServiceImpl implements BoardService{
	
	private static final Logger logger =  LoggerFactory.getLogger(BaordServiceImpl.class);
	
	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		// TODO Auto-generated method stub
		logger.info("추가..");
//		mapper.insert(board);
		mapper.insertSelectKey(board);
		System.out.println("logger..");
	}

	@Override
	public BoardVO get(Long bno) {
		// TODO Auto-generated method stub
		BoardVO board = mapper.get(bno);
		return board;
	}

	@Override
	public boolean modify(BoardVO vo) {
		// TODO Auto-generated method stub
		boolean flag = mapper.modify(vo);
		return flag;
	}

	@Override
	public boolean remove(long bno) {
		// TODO Auto-generated method stub
		boolean flag = mapper.remove(bno);
		return flag;
	}

//	@Override
//	public List<BoardVO> getList() {
//		// TODO Auto-generated method stub
//		List<BoardVO> list = mapper.getList();
//		return list;
//	}
//
//	@Override
//	public int getTotal() {
//		// TODO Auto-generated method stub
//		int total = mapper.getTotal();
//		return total;
//	}
	//검색포함 전체보기
	@Override
	public List<BoardVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		logger.info("get List with crieria : "+cri);
		return mapper.getListWithPaging(cri);
	}
	//검색포함 게시물수
	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		logger.info("get total count");
		return mapper.getTotalCount(cri);
	}

}
