package shixun.online.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shixun.online.project.mapper.CombatTeamMapper;
import shixun.online.project.pojo.CombatTeam;

@Service
public class CombatTeamService {

	@Autowired
	CombatTeamMapper combatTeamMapper;
	public List<CombatTeam> getCombatTeam(){
		return combatTeamMapper.selectCombatTeam();
	}
	public List<CombatTeam> getCombatTeam1(){
		return combatTeamMapper.selectCombatTeam1();
	}
	public CombatTeam getCombatTeam2(){
		return combatTeamMapper.selectCombatTeam2();
	}
} 
