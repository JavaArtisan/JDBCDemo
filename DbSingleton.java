package com.pluralsight.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

	private static volatile DbSingleton instance = null;
	
	private Connection conn = null;
	
	private DbSingleton () {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver()