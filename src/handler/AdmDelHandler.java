package handler;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import db.AlbumDBBean;
import db.CmtDBBean;
import db.TagDBBean;
import db.TripDBBean;
import db.UserDBBean;

@Controller
public class AdmDelHandler {
	@Resource
	private UserDBBean userDao;
	@Resource
	private TripDBBean tripDao;
	@Resource
	private AlbumDBBean albumDao;
	@Resource
	private CmtDBBean cmtDao;
	@Resource
	private TagDBBean tagDao;
	
	@RequestMapping("/adminUserDel")
	public ModelAndView userDelProcess(HttpServletRequest request, HttpServletResponse response) throws HandlerException {
		int num;
		ArrayList<Integer>results=new ArrayList<Integer>();
		int result=0;
		try {
			num=Integer.parseInt(request.getParameter("num"));
			for(int i=0;i<num;i++) {
				String user_id=request.getParameter("key"+i+"").trim();
				result=userDao.deleteMember(user_id);
				results.add(result);
			}
			if(results.contains(0)) {
				result=0;	
			}
			
			request.setAttribute("result", result);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("adm/userDel");
	}
	@RequestMapping("/adminTripDel")
	public ModelAndView tripDelProcess(HttpServletRequest request, HttpServletResponse response) throws HandlerException {
		int num;
		ArrayList<Integer>results=new ArrayList<Integer>();
		int result=0;
		try {
			num=Integer.parseInt(request.getParameter("num"));
			for(int i=0;i<num;i++) {
				String tb_no=request.getParameter("key"+i+"").trim();
				result=tripDao.deleteTrip(Integer.parseInt(tb_no));
				results.add(result);
			}
			if(results.contains(0)) {
				result=0;	
			}
			
			request.setAttribute("result", result);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		return new ModelAndView("adm/tripDel");
	}
	@RequestMapping("/adminCommentDel")
	public ModelAndView cmtDelProcess(HttpServletRequest request, HttpServletResponse response) throws HandlerException {
		int num;
		ArrayList<Integer>results=new ArrayList<Integer>();
		int result=0;
		try {
			num=Integer.parseInt(request.getParameter("num"));
			for(int i=0;i<num;i++) {
				String c_id=request.getParameter("key"+i+"").trim();
				result=cmtDao.delComment(Integer.parseInt(c_id));
				results.add(result);
			}
			if(results.contains(0)) {
				result=0;	
			}
			
			request.setAttribute("result", result);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		return new ModelAndView("adm/commentDel");
	}
	@RequestMapping("/adminTagDel")
	public ModelAndView tagDelProcess(HttpServletRequest request, HttpServletResponse response) throws HandlerException {
		int num;
		ArrayList<Integer>results=new ArrayList<Integer>();
		int result=0;
		try {
			num=Integer.parseInt(request.getParameter("num"));
			for(int i=0;i<num;i++) {
				String tag_id=request.getParameter("key"+i+"").trim();
				result=tagDao.deleteTag(tag_id);
				results.add(result);
			}
			if(results.contains(0)) {
				result=0;	
			}
			
			request.setAttribute("result", result);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		return new ModelAndView("adm/tagDel");
	}
	@RequestMapping("/adminAlbumDel")
	public ModelAndView albumDelProcess(HttpServletRequest request, HttpServletResponse response) throws HandlerException {
		return new ModelAndView("adm/albumDel");
	}

}