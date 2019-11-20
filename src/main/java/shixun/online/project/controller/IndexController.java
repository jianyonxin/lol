package shixun.online.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import shixun.online.project.pojo.CombatTeam;
import shixun.online.project.pojo.Score;
import shixun.online.project.service.CombatTeamService;
import shixun.online.project.service.ResultService;
import shixun.online.project.service.ScoreService;

@Controller
public class IndexController {
	@Autowired
	CombatTeamService combatTeamService;
	@Autowired
	ResultService resultService;
	@Autowired
	ScoreService scoreService;
	@RequestMapping("")
	public String index() {
		return "index";
	}
	@RequestMapping("eightstrong")
	public String eightStrong(Model model) {
	List<CombatTeam> cmbatTeam=combatTeamService.getCombatTeam();
	model.addAttribute("cmbatTeam", cmbatTeam);
		return "eight-strong";
	}
	@RequestMapping("fourstrong")
	public String fourStrong(Model model) {
	List<CombatTeam> cmbatTeam1=combatTeamService.getCombatTeam1();
	model.addAttribute("cmbatTeam1", cmbatTeam1);
		return "four-strong";
	}
	@RequestMapping("finals")
	public String Finals(Model model) {
	CombatTeam cmbatTeam2=combatTeamService.getCombatTeam2();
	model.addAttribute("cmbatTeam2", cmbatTeam2);
		return "finals";
	}
	
	@RequestMapping("scroe")
	public String scroe(int id,Model model) {
		System.out.println(id);
		Score score=scoreService.getScore(id);
		model.addAttribute("score", score);
		return "score";
	}
	@RequestMapping("jsontext")
	@ResponseBody
	public List<CombatTeam> jsonText(Model model) {
		
		List<CombatTeam> combat=combatTeamService.getCombatTeam();
		//CombatTeam	combat=combatTeamService.getCombatTeam2();

		return combat;
	}
	@RequestMapping("jsontexts")
	public String jsonTexts(Model model) {
		

		return "jsontexts";
	}
	@RequestMapping("jsontext1")
	@ResponseBody
	public JSONObject  jsonTexts1(Score datas) {
		
		System.out.println(datas.getId());
//		JSONArray js = JSONArray.parseArray(data);
//		for (Object o : js){
//			JSONObject j = (JSONObject)o;
//			System.out.println(j.get("name"));
//		}	
		return null;
		
	}
}
