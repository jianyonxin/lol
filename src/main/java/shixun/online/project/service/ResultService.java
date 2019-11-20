package shixun.online.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shixun.online.project.mapper.ResultMapper;
import shixun.online.project.pojo.Result;

@Service
public class ResultService {
	@Autowired
	ResultMapper resultMapper;

	public List<Result> getResult() {

		return resultMapper.selectResult();

	}

}
