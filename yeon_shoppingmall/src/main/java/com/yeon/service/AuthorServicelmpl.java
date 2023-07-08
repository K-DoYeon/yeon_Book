package com.yeon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeon.mapper.AuthorMapper;
import com.yeon.model.AuthorVO;

@Service
public class AuthorServicelmpl implements AuthorService{
	
	@Autowired
	AuthorMapper authorMapper;
	
	@Override
	public void authorEnroll(AuthorVO author) throws Exception{
		authorMapper.authorEnroll(author);
	}
}
