package org.packt.microservice.core.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.packt.microservice.core.HREmpBootApplication;
import org.packt.microservice.core.config.SpringDataConfig;
import org.packt.microservice.core.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration.WebFluxConfig;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = {WebFluxConfig.class, SpringDataConfig.class, HREmpBootApplication.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringJpaTest {
	
	@Autowired
	private EmployeeService employeeServiceImpl;
	
	
	@Test
	public void saveEmp(){
		assertTrue(employeeServiceImpl.findAllEmps().size() > 0);
		System.out.println(employeeServiceImpl.findAllEmps());
	}

}
