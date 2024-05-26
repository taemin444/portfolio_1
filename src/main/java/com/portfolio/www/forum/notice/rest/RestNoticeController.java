package com.portfolio.www.forum.notice.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.www.dto.BoardDto;

@RestController
public class RestNoticeController {
	@PostMapping("/forum/notice/write.do")
	public int write(@RequestBody BoardDto boardDto) {
		System.out.println(boardDto);
		return 1;
	}
}
