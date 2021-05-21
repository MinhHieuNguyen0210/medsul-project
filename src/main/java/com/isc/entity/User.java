package com.isc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int USER_ID;
	private int TINHT_ID;
	private String USER_EMAIL;
	private String USER_HOTEN;
	private String USER_SDT;
	private String USER_PASSWORD;
	private String USER_MAGIOITHIEU;
	private String USER_GIOITINH;
	private String USER_DIACHI;
	private Date USER_NGAYSINH;
	private String USER_AVARTAR;
	private int USER_TINHTRANG;
	public User(int uSER_ID, int tINHT_ID, String uSER_EMAIL, String uSER_HOTEN, String uSER_SDT, String uSER_PASSWORD,
			String uSER_MAGIOITHIEU, String uSER_GIOITINH, String uSER_DIACHI, Date uSER_NGAYSINH, String uSER_AVARTAR,
			int uSER_TINHTRANG) {
		super();
		USER_ID = uSER_ID;
		TINHT_ID = tINHT_ID;
		USER_EMAIL = uSER_EMAIL;
		USER_HOTEN = uSER_HOTEN;
		USER_SDT = uSER_SDT;
		USER_PASSWORD = uSER_PASSWORD;
		USER_MAGIOITHIEU = uSER_MAGIOITHIEU;
		USER_GIOITINH = uSER_GIOITINH;
		USER_DIACHI = uSER_DIACHI;
		USER_NGAYSINH = uSER_NGAYSINH;
		USER_AVARTAR = uSER_AVARTAR;
		USER_TINHTRANG = uSER_TINHTRANG;
	}
	public User() {}
	public int getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}
	public int getTINHT_ID() {
		return TINHT_ID;
	}
	public void setTINHT_ID(int tINHT_ID) {
		TINHT_ID = tINHT_ID;
	}
	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}
	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}
	public String getUSER_HOTEN() {
		return USER_HOTEN;
	}
	public void setUSER_HOTEN(String uSER_HOTEN) {
		USER_HOTEN = uSER_HOTEN;
	}
	public String getUSER_SDT() {
		return USER_SDT;
	}
	public void setUSER_SDT(String uSER_SDT) {
		USER_SDT = uSER_SDT;
	}
	public String getUSER_PASSWORD() {
		return USER_PASSWORD;
	}
	public void setUSER_PASSWORD(String uSER_PASSWORD) {
		USER_PASSWORD = uSER_PASSWORD;
	}
	public String getUSER_MAGIOITHIEU() {
		return USER_MAGIOITHIEU;
	}
	public void setUSER_MAGIOITHIEU(String uSER_MAGIOITHIEU) {
		USER_MAGIOITHIEU = uSER_MAGIOITHIEU;
	}
	public String getUSER_GIOITINH() {
		return USER_GIOITINH;
	}
	public void setUSER_GIOITINH(String uSER_GIOITINH) {
		USER_GIOITINH = uSER_GIOITINH;
	}
	public String getUSER_DIACHI() {
		return USER_DIACHI;
	}
	public void setUSER_DIACHI(String uSER_DIACHI) {
		USER_DIACHI = uSER_DIACHI;
	}
	public Date getUSER_NGAYSINH() {
		return USER_NGAYSINH;
	}
	public void setUSER_NGAYSINH(Date uSER_NGAYSINH) {
		USER_NGAYSINH = uSER_NGAYSINH;
	}
	public String getUSER_AVARTAR() {
		return USER_AVARTAR;
	}
	public void setUSER_AVARTAR(String uSER_AVARTAR) {
		USER_AVARTAR = uSER_AVARTAR;
	}
	public int getUSER_TINHTRANG() {
		return USER_TINHTRANG;
	}
	public void setUSER_TINHTRANG(int uSER_TINHTRANG) {
		USER_TINHTRANG = uSER_TINHTRANG;
	}
	
	
}
