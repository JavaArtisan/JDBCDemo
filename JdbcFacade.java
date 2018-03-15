package com.pluralsight.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

	DbSingleton instance = null;
	
	public JdbcFacade() {
		instance = DbSingleton.getInstance();
	}
	
	public int createTable() {
		int count = 0;
		tr