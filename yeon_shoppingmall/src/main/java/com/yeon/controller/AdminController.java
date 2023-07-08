package com.yeon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yeon.model.AuthorVO;
import com.yeon.service.AuthorService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AuthorService authorService;
	
	/* 관리자 메인 페이지 이동 */
	@RequestMapping(value="main", method = RequestMethod.GET)
	public void adminMainGET() throws Exception{
		logger.info("관리자 페이지 이름");
	}
	
	/* 상품 등록 페이지 접속 */
	@RequestMapping(value="goodsManage", method=RequestMethod.GET)
	public void goodsManageGET() throws Exception{
		logger.info("상품 등록 페이지 접속");
	}
	/* 상품 등록 페이지 접속 */
	@RequestMapping(value="goodsEnroll", method=RequestMethod.GET)
	public void goodsEnrollGET() throws Exception{
		logger.info("상품 등록 페이지 접속");
	}
	/* 작가 등록 페이지 접속 */
	@RequestMapping(value="authorEnroll", method=RequestMethod.GET)
	public void authorEnrollGET() throws Exception{
		logger.info("작가 등록 페이지 접속");
	}
	/* 작가 관리 페이지 접속 */
	@RequestMapping(value="authorManage", method=RequestMethod.GET)
	public void authorManageGET() throws Exception{
		logger.info("작가 관리 페이지 접속");
	}
	
	/* 작가 등록 */
	@RequestMapping(value="authorEnroll.do", method=RequestMethod.POST)
	public String authorEnrollPOST(AuthorVO author, RedirectAttributes rttr) throws Exception{
		logger.info("authorEnroll :" + author);
		authorService.authorEnroll(author); //작가 등록 쿼리 수행
		//경고창 메시지, 일회성으로 사용하기 위해서는 addFlashAttribute메서드 사용
		rttr.addFlashAttribute("enroll_result", author.getAuthorName());
		return "redirect:/admin/authorManage";
	}
}