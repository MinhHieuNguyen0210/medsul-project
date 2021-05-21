package com.isc.dto;




import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "datlich")
@SecondaryTable(name = "chitietdat", pkJoinColumns = @PrimaryKeyJoinColumn(name = "DL_ID"))
public class InsertDatLichDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DL_ID")
	private int DL_ID;

	@Column(nullable = true, updatable = true, insertable = true, name = "MGG_ID", table = "datlich")
	private Integer MGG_ID;

	@Column(name = "USER_ID")
	private Integer USER_ID;

	@Column(name = "NB_ID")
	private Integer NB_ID;

	@Column(nullable = true, name = "DD_ID")
	private Integer DD_ID;

	@Column(name = "TINHT_ID")
	private int TINHT_ID;

	@Column(name = "DL_NGAYDAT")
	private Date DL_NGAYDAT;

	public int getDL_ID() {
		return DL_ID;
	}

	public void setDL_ID(int dL_ID) {
		DL_ID = dL_ID;
	}

	public Integer getMGG_ID() {
		return MGG_ID;
	}

	public void setMGG_ID(Integer mGG_ID) {
		MGG_ID = mGG_ID;
	}

	public Integer getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(Integer uSER_ID) {
		USER_ID = uSER_ID;
	}

	public Integer getNB_ID() {
		return NB_ID;
	}

	public void setNB_ID(Integer nB_ID) {
		NB_ID = nB_ID;
	}

	public Integer getDD_ID() {
		return DD_ID;
	}

	public void setDD_ID(Integer dD_ID) {
		DD_ID = dD_ID;
	}

	public int getTINHT_ID() {
		return TINHT_ID;
	}

	public void setTINHT_ID(int tINHT_ID) {
		TINHT_ID = tINHT_ID;
	}

	public Date getDL_NGAYDAT() {
		return DL_NGAYDAT;
	}

	public void setDL_NGAYDAT(Date dL_NGAYDAT) {
		DL_NGAYDAT = dL_NGAYDAT;
	}

	public Double getDL_TONGTIEN() {
		return DL_TONGTIEN;
	}

	public void setDL_TONGTIEN(Double dL_TONGTIEN) {
		DL_TONGTIEN = dL_TONGTIEN;
	}

	public String getDL_SDT() {
		return DL_SDT;
	}

	public void setDL_SDT(String dL_SDT) {
		DL_SDT = dL_SDT;
	}

	public String getDL_HOTEN() {
		return DL_HOTEN;
	}

	public void setDL_HOTEN(String dL_HOTEN) {
		DL_HOTEN = dL_HOTEN;
	}

	public String getDL_EMAIL() {
		return DL_EMAIL;
	}

	public void setDL_EMAIL(String dL_EMAIL) {
		DL_EMAIL = dL_EMAIL;
	}

	public String getDL_GHICHU() {
		return DL_GHICHU;
	}

	public void setDL_GHICHU(String dL_GHICHU) {
		DL_GHICHU = dL_GHICHU;
	}

	public String getDL_DIACHI() {
		return DL_DIACHI;
	}

	public void setDL_DIACHI(String dL_DIACHI) {
		DL_DIACHI = dL_DIACHI;
	}

	public String getDL_TINHTRANG() {
		return DL_TINHTRANG;
	}

	public void setDL_TINHTRANG(String dL_TINHTRANG) {
		DL_TINHTRANG = dL_TINHTRANG;
	}

	public Date getCTD_NGAYBATDAU() {
		return CTD_NGAYBATDAU;
	}

	public void setCTD_NGAYBATDAU(Date cTD_NGAYBATDAU) {
		CTD_NGAYBATDAU = cTD_NGAYBATDAU;
	}

	public Double getCTD_DONGIA() {
		return CTD_DONGIA;
	}

	public void setCTD_DONGIA(Double cTD_DONGIA) {
		CTD_DONGIA = cTD_DONGIA;
	}

	public Double getCTD_GIOBATDAU() {
		return CTD_GIOBATDAU;
	}

	public void setCTD_GIOBATDAU(Double cTD_GIOBATDAU) {
		CTD_GIOBATDAU = cTD_GIOBATDAU;
	}

	@Column(name = "DL_TONGTIEN")
	private Double DL_TONGTIEN;

	@Column(name = "DL_SDT")
	private String DL_SDT;

	@Column(name = "DL_HOTEN")
	private String DL_HOTEN;

	@Column(name = "DL_EMAIL")
	private String DL_EMAIL;

	@Column(name = "DL_GHICHU")
	private String DL_GHICHU;

	@Column(name = "DL_DIACHI")
	private String DL_DIACHI;

	@Column(name = "DL_TINHTRANG")
	private String DL_TINHTRANG;	

	@Column(name = "CTD_NGAYBATDAU", table = "chitietdat")
	private Date CTD_NGAYBATDAU;

	@Column(name = "CTD_DONGIA", table = "chitietdat")
	private Double CTD_DONGIA;

	@Column(name = "CTD_GIOBATDAU", table = "chitietdat")
	private Double CTD_GIOBATDAU;
}
