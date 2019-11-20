package shixun.online.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import shixun.online.project.pojo.Result;

@Mapper
public interface ResultMapper {
	@Select("select * from result")
	public List<Result> selectResult();

}
