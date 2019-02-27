package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
//	public void insert(BoardVO board);
	public Integer insertSelectKey(BoardVO board);
	public List<BoardVO> getList();
	public int getTotal();
	public BoardVO get(Long bno);
	public BoardVO read(Long bno);
	public int delete(Long bno);
	public int update(BoardVO board);
	public boolean modify(BoardVO vo);
	public boolean remove(long bno);
	public List<BoardVO> getListWithPaging(Criteria cri);
	public int getTotalCount(Criteria cri);
//	public int getCountByBno(Long bno);
	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount")int amount);
}
