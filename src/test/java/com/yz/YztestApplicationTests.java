package com.yz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YztestApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	public void contextLoads() throws SQLException {

		System.out.println(dataSource);
		System.out.println(dataSource.getConnection());

	}

	@Test
	public void query() throws Exception{
		List<Map<String, Object>> mapList = jdbcTemplate.queryForList("select * from emb_t_dictBusType");
		System.out.println(mapList);
	}

}

