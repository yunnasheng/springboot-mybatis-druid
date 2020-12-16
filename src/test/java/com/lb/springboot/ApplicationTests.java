package com.lb.springboot;

import com.alibaba.fastjson.JSON;
import com.lb.springboot.entity.LtDict;
import com.lb.springboot.mapper.DictMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private DictMapper dictMapper;

	@Test
	public void insertTest(){
		for (int i = 1; i < 5; i++) {
			LtDict dict = new LtDict();
			dict.setCode(String.valueOf(new Random().nextInt()));
			dict.setName("TEST-"+i);
			dict.setStatus("1");
			dictMapper.insert(dict);
		}
	}

	@Test
	public void selectTest(){
		List<LtDict> dictList = dictMapper.selectAll();
		System.err.println(JSON.toJSONString(dictList,true));
	}

}
