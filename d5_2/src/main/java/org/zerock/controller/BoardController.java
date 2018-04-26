package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Setter(onMethod_= {@Autowired})
	private BoardMapper mapper;
	
	@GetMapping("/register")
	public void register() {
		log.info("Get register");
	}
	
	@PostMapping("/register")
	public String registerPost(BoardVO vo, @ModelAttribute("msg") String msg) {
		log.info("vo: " + vo);
		log.info("msg: " + msg);
		mapper.insert(vo);
		return "board/result";
	}
	
	@GetMapping("/read")
	public void read(String bno, Model model) {
		
		log.info("bno: " + bno);
		
		BoardVO vo = mapper.read(new Long(bno));
		
		model.addAttribute("vo", vo);
		
	}
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) throws Exception {
	
		List<BoardVO> list = mapper.list(cri);
		
		model.addAttribute("list", list);
	}
}