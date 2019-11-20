package shixun.online.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import shixun.online.project.pojo.CombatTeam;

@Mapper
public interface CombatTeamMapper {
	@Select("select * from combat_team where id=6 or id=7 or id=4 or id=5")
	public List<CombatTeam> selectCombatTeam();
	@Select("select * from combat_team where id=2 or id=3")
	public List<CombatTeam> selectCombatTeam1();
	@Select("select * from combat_team where id=1")
	public CombatTeam selectCombatTeam2();

}
