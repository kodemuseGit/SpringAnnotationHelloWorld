package com.solution.spring;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.solution.spring.config.AppDaoConfig;
import com.solution.spring.dao.LoginDao;
import com.solution.spring.entity.LoginEntity;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppDaoConfig.class })
public class LoginTest {

	@Autowired
	private LoginDao loginDao;

	@Test
	public void doLogin() {
		LoginEntity login = new LoginEntity();
		login.setId(2L);
		login.setName("Naveen");
		login.setStartDate(new Date(System.currentTimeMillis()));
		loginDao.persist(login);
	}

}
