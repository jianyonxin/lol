package shixun.online.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shixun.online.project.mapper.ScoreMapper;
import shixun.online.project.pojo.Score;

@Service
public class ScoreService {
	@Autowired
	ScoreMapper scoreMapper;
	
	public Score getScore( int id) {
		return scoreMapper.selectScore(id);
		
		
	}

}
