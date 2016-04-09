package yong.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yong.parameta.model.*;



@Controller
public class ParametaController {
	//이걸로 dao, dto를 해주고
	@Autowired
	private parametaDAO parametaDAO;
	
	//제너레이터로 get,set을 해주자
	
	
	@RequestMapping("/parameta1.do")
	public ModelAndView getParameta(){
		ModelAndView mav=new ModelAndView();
		//mav.addObject("msg", "Spring FrameWork MVC");
		mav.setViewName("parameta1");
		return mav;
	}
	
	@RequestMapping("/paramera2.do")
	public ModelAndView setParameta(parametaDTO dto){
		ModelAndView mav=new ModelAndView();
		int result=parametaDAO.add(dto);
		String msg=result>0?"success":"fail";
		mav.addObject("mag",msg);
		mav.setViewName("hello");
		return mav;
	}


}

