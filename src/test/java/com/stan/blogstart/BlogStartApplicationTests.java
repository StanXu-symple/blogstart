package com.stan.blogstart;

import com.stan.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BlogStartApplicationTests {
	@Autowired
	private TestMapper testMapper;

	@Test
	void contextLoads() {
		System.out.println("test");
		List<com.stan.dao.Test> tests = testMapper.selectList(null);
		tests.forEach(System.out::println);

	}

}
