package org.mycompany;

import javax.management.MBeanAttributeInfo;
import javax.sql.DataSource;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jasypt.JasyptPropertiesParser;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

//@Component
public class MyRoute extends RouteBuilder{

	@Autowired
	MyBean mybean;
	
	//@Autowired
	//SqlSession sqlSession;
	
	
	
	@Override
	public void configure() throws Exception {
		
		
		
		
		/*
		 * from("timer://foo?repeatCount=1") .log("========== ${body}")
		 * .bean(MyBean.class, "printValue")
		 * .to("mybatis:selectByCityId?statementType=SelectOne")
		 * .log("========== 2222 ${body}") .to("mock:result");
		 */
		
		
		from("timer://foo?repeatCount=1")
		.log("======started")
		.log("======mydata===== {{mydata}}")
		.log("======mydata2===== {{mydata2}}")
		.bean(MyBean.class, "printValue")
	    .to("mock:result");
		
	}

}
