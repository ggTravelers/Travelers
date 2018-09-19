package handler;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import db.TagDBBean;

@Controller
public class AdmTagHandler {
	@Resource
	private TagDBBean tagDao;
	
	@RequestMapping("/adminTagMng")
	public ModelAndView admTagMngProcess(HttpServletRequest request, HttpServletResponse response) throws HandlerException {
		return new ModelAndView("adm/tagMng");
	}
	@RequestMapping("/adminTagAdd")
	public ModelAndView admTagAddProcess(HttpServletRequest request, HttpServletResponse response) throws HandlerException {
		return new ModelAndView("adm/tagAdd");
	}
	@RequestMapping("/adminTagMod")
	public ModelAndView admTagModProcess(HttpServletRequest request, HttpServletResponse response) throws HandlerException {
		return new ModelAndView("adm/tagMod");
	}
}