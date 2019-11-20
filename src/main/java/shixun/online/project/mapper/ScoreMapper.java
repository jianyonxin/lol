package shixun.online.project.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import shixun.online.project.pojo.Score;

@Mapper
public interface ScoreMapper {
	@Select("select * from score where id=#{id}")
	public Score selectScore( int id);

}
