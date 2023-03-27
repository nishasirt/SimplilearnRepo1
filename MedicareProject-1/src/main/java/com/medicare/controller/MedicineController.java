package com.medicare.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.medicare.dao.CategoryDao;
import com.medicare.dao.MedicineDao;
import com.medicare.pojo.Category;
import com.medicare.pojo.Medicine;


@Controller
public class MedicineController {
	  
	@Autowired
	MedicineDao dao;
	@Autowired 
	CategoryDao dao1;
	Logger log = Logger.getAnonymousLogger();
	private final String FOLDER_PATH = "C:\\Users\\HP\\Desktop\\simplileaen\\Capstone\\Medicare\\img";

	@RequestMapping("/addmedicine")
	public ModelAndView insert(HttpServletRequest req, HttpServletResponse res, @RequestParam("mname") String mname,
			@RequestParam("des") String des, @RequestParam("price") String price,
			@RequestParam("file") MultipartFile file) {
		log.info("entered into insert");
		ModelAndView mv = new ModelAndView();

		Medicine m = new Medicine();
		String sl="\\";
		String fileinfo = FOLDER_PATH + sl+file.getOriginalFilename();
		m.setMname(req.getParameter("mname"));
		m.setPrice(Double.parseDouble(price));
		m.setDescription(des);
		m.setStatus(req.getParameter("status"));
		String si[] = req.getParameter("cat").split(",");

		System.out.print("" + si[0] + "  " + si[1]);
		Category c = new Category();
		c.setCid(Integer.parseInt(si[0]));
		c.setCname(req.getParameter(si[1]));
		m.setCategory(c);

		m.setImgapath(fileinfo);

		Medicine mm = dao.addMed(m);

		if (mm != null) {
			
			mv.setViewName("addmedicine.jsp");
		}
		return mv;
	}
	
	
	@RequestMapping("/getallview")
	public ModelAndView getallView(HttpServletRequest req,HttpServletResponse res){
		log.info("entered into getall");
		ModelAndView mv=new ModelAndView();
		List<Medicine> list=dao.getAllMedicine();
		List<Category> list2=dao1.getAllCate();
		
		mv.addObject("list",list);
		mv.addObject("catlist",list2);
		mv.setViewName("userdash.jsp");
		return mv;
	}

@RequestMapping("/getall")
public ModelAndView getall(HttpServletRequest req,HttpServletResponse res){
	log.info("entered into getall");
	ModelAndView mv=new ModelAndView();
	List<Medicine> list=dao.getAllMedicine();
	List<Category> list2=dao1.getAllCate();
	
	mv.addObject("list",list);
	mv.addObject("catlist",list2);
	mv.setViewName("admindashboard.jsp");
	return mv;
}

@RequestMapping("/getallbyid")
public ModelAndView getMedicine(HttpServletRequest req,HttpServletResponse res){
	log.info("entered into getall");
	int id= Integer.parseInt(req.getParameter("mid")) ;
	ModelAndView mv=new ModelAndView();
	Medicine m=dao.getMedicine(id);
	
	mv.addObject("medicine",m);
	mv.setViewName("medicinedetail.jsp");
	return mv;
}

@RequestMapping("/getallbyname")
public ModelAndView getMedicineByName(HttpServletRequest req,HttpServletResponse res){
	log.info("entered into getall");
	ModelAndView mv=new ModelAndView();
	String name=req.getParameter("smname");
	List<Medicine>  list=dao.getAllMedicineByName(name);
	
	mv.addObject("list",list);
	mv.setViewName("userdash.jsp");
	return mv;
}

@RequestMapping("/getshoeSort")
public ModelAndView getShoeSort(HttpServletRequest req,HttpServletResponse res) {
	
	ModelAndView mv=new ModelAndView();
	List<Medicine> list;
	if(req.getParameter("pp").equalsIgnoreCase("Low to high"))
	{
		 list=dao.getAllAsc();
	}
	else {
		
		list=dao.getAllDesc();
	}
	mv.addObject("list",list);
	mv.setViewName("userdash.jsp");
	return mv;
	
}

@RequestMapping("/deletemedicine")
public ModelAndView deleteMedic(HttpServletRequest req,HttpServletResponse res){
	int id=Integer.parseInt(req.getParameter("mid"));
	ModelAndView mv=new ModelAndView();
List<Medicine> list=	 dao.deleteMed(id);

mv.addObject("list",list);
mv.setViewName("admindashboard.jsp");
	return mv;
	
	
}


}
