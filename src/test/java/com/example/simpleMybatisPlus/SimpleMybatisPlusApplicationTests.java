package com.example.simpleMybatisPlus;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SimpleMybatisPlusApplicationTests {

	@Resource
	private MyMapper myMapper;

	@Test
	void contextLoads() {
	}

	@Test
	void testPage(){
		IPage<Student> page = new Page<>();
		page.setSize(3);
		for(int i = 1; i<=3;i++){
			page.setCurrent(i);
			myMapper.selectPage(page, null);
//			page.getRecords().forEach(student -> System.out.println(student));
			System.out.println("--------------------student");
		}

	}
}
