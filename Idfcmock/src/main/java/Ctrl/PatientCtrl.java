package Ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import Dao.PatientDao;
import Dto.PatientDto;
@Controller
public class PatientCtrl {
	
	@RequestMapping("/insert")
	public ModelAndView create() {
		ModelAndView view=new ModelAndView("insert.jsp");
		PatientDto dto=new PatientDto();
		view.addObject("key", dto);
		return view;
	}
	@ResponseBody
	@RequestMapping("/saved")
	public String insertdata(PatientDto dto1) {
		PatientDao dao=new PatientDao();
		dao.insert(dto1);
		return "saveddata";
	}
	
//****************FETCH*********************************
@RequestMapping("/fetch")
	public ModelAndView fetch() {
		ModelAndView view=new ModelAndView("fetch.jsp");
		PatientDto dto=new PatientDto();
		view.addObject("key1", dto);
		return view;
	}
@ResponseBody
	@RequestMapping("/fetching")
	public ModelAndView fetching(int id) {
		PatientDao dao=new PatientDao();
		PatientDto dto=dao.fetch(id);
		ModelAndView view=new ModelAndView("display.jsp");
		view.addObject("key2", dto);
//		dao.fetch(id);
		return view;
	}
}
