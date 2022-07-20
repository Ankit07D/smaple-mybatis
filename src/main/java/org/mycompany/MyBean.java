package org.mycompany;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.camel.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class MyBean {
	
	@Autowired
	DataSource datasource;

	public void printValue(Exchange exchange) throws SQLException {
		System.out.println("=========> : " + datasource.getConnection().getMetaData().getUserName());
	}
}
