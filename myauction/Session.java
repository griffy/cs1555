package myauction;

import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class Session {
	private Connection db;
	private String username;
	private String password;
	private int selectedAuctionId;

	public Session() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			db = DriverManager.getConnection("jdbc:oracle:thin:@db10.cs.pitt.edu:1521:dbclass", "jdg39", "3555593");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSelectedAuctionId(int selectedAuctionId) {
		this.selectedAuctionId = selectedAuctionId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getSelectedAuctionId() {
		return selectedAuctionId;
	}

	public Connection getDb() {
		return db;
	}

	public void close() {
		try {
			db.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}