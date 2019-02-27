package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	//�߰�
	public void register(BoardVO vo);
	//�󼼺���
	public BoardVO get(Long bno);
	//����
	public boolean modify(BoardVO vo);
	//����
	public boolean remove(long bno);
	//��ü����
//	public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);
	//����
//	public int getTotal();
	public int getTotal(Criteria cri);
}
