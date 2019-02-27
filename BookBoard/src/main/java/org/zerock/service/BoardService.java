package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	//추가
	public void register(BoardVO vo);
	//상세보기
	public BoardVO get(Long bno);
	//수정
	public boolean modify(BoardVO vo);
	//삭제
	public boolean remove(long bno);
	//전체보기
//	public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);
	//개수
//	public int getTotal();
	public int getTotal(Criteria cri);
}
