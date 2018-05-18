package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import pojo.Working;
import service.WorkingService;

@Controller
public class WorkingdbController {
	@Autowired
	private WorkingService wks;
	public WorkingService getWks() {return wks;}
	public void setWks(WorkingService wks) {this.wks = wks;}
	
	@RequestMapping("/WorkingAll")
	public String WorkingAll(Model model){
		List<Working> wok =wks.selectByExample(null);
		model.addAttribute("working", wok);
		return "list";
	}
	@RequestMapping("/workdell")
	@ResponseBody
	public Object workdell(int id){
		int iRet = wks.deleteByPrimaryKey(id);
		if(iRet > 0){
			return JSON.toJSONString("succ");
		}else{
			return JSON.toJSONString("err");
		}
	}
	@RequestMapping("/newmodel")
	public String newmodel(Model model){
		Working working = new Working();
		model.addAttribute("working", working);
		return "edit";
	}
	@RequestMapping("/addworking")
	public String addworking(Working working ){
		wks.insertSelective(working);
		return "redirect:/WorkingAll";
	}
}
