package com.yeon.mapper;

import java.util.List;

import com.yeon.model.AuthorVO;
import com.yeon.model.Criteria;

public interface AuthorMapper {
	
	/* 작가 등록 */
	public void authorEnroll(AuthorVO author);
	
	/* 작가 목록 */
	public List<AuthorVO> authorGetList(Criteria cri);
}
