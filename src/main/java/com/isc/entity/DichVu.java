package com.isc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "dichvu")
public class DichVu {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DichVu_Id;
		result = prime * result + Float.floatToIntBits(giaDichVu);
		result = prime * result + ((khongBaoGom == null) ? 0 : khongBaoGom.hashCode());
		result = prime * result + ((loaiDichVu == null) ? 0 : loaiDichVu.hashCode());
		result = prime * result + loaiDichVuID;
		result = prime * result + ((maDichVu == null) ? 0 : maDichVu.hashCode());
		result = prime * result + ((moTaDichVu == null) ? 0 : moTaDichVu.hashCode());
		result = prime * result + ((tenDichVu == null) ? 0 : tenDichVu.hashCode());
		result = prime * result + thoiGianUocTinh;
		result = prime * result + tinhTrangDichVu;
		result = prime * result + ((yeuCauCongViec == null) ? 0 : yeuCauCongViec.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DichVu other = (DichVu) obj;
		if (DichVu_Id != other.DichVu_Id)
			return false;
		if (Float.floatToIntBits(giaDichVu) != Float.floatToIntBits(other.giaDichVu))
			return false;
		if (khongBaoGom == null) {
			if (other.khongBaoGom != null)
				return false;
		} else if (!khongBaoGom.equals(other.khongBaoGom))
			return false;
		if (loaiDichVu == null) {
			if (other.loaiDichVu != null)
				return false;
		} else if (!loaiDichVu.equals(other.loaiDichVu))
			return false;
		if (loaiDichVuID != other.loaiDichVuID)
			return false;
		if (maDichVu == null) {
			if (other.maDichVu != null)
				return false;
		} else if (!maDichVu.equals(other.maDichVu))
			return false;
		if (moTaDichVu == null) {
			if (other.moTaDichVu != null)
				return false;
		} else if (!moTaDichVu.equals(other.moTaDichVu))
			return false;
		if (tenDichVu == null) {
			if (other.tenDichVu != null)
				return false;
		} else if (!tenDichVu.equals(other.tenDichVu))
			return false;
		if (thoiGianUocTinh != other.thoiGianUocTinh)
			return false;
		if (tinhTrangDichVu != other.tinhTrangDichVu)
			return false;
		if (yeuCauCongViec == null) {
			if (other.yeuCauCongViec != null)
				return false;
		} else if (!yeuCauCongViec.equals(other.yeuCauCongViec))
			return false;
		return true;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DV_ID")
	private int DichVu_Id;

	@Column(name = "DV_MA")
	private String maDichVu;

	@Column(name = "DV_TEN")
	private String tenDichVu;

	@Column(name = "DV_MOTA")
	private String moTaDichVu;

	@Column(name = "DV_YEUCAUCV")
	private String yeuCauCongViec;

	@Column(name = "DV_KHONGBAOGOM")
	private String khongBaoGom;

	@Column(name = "DV_THOIGIANUOCTINH")
	private int thoiGianUocTinh;

	@Column(name = "DV_TINHTRANG")
	private int tinhTrangDichVu;

	@Column(name = "DV_GIADICHVU")
	private float giaDichVu;

	@Column(name = "LOAIDV_ID")
	private int loaiDichVuID;

	@ManyToOne()
	@JoinColumn(name = "LOAIDV_ID", insertable = false, updatable = false)
	@JsonIgnore
	private LoaiDichVu loaiDichVu;

	public DichVu() {

	}

	public DichVu(int dichVu_Id, String maDichVu, String tenDichVu, String moTaDichVu, String yeuCauCongViec,
			String khongBaoGom, int thoiGianUocTinh, int tinhTrangDichVu, float giaDichVu, int loaiDichVuID,
			LoaiDichVu loaiDichVu) {

		DichVu_Id = dichVu_Id;
		this.maDichVu = maDichVu;
		this.tenDichVu = tenDichVu;
		this.moTaDichVu = moTaDichVu;
		this.yeuCauCongViec = yeuCauCongViec;
		this.khongBaoGom = khongBaoGom;
		this.thoiGianUocTinh = thoiGianUocTinh;
		this.tinhTrangDichVu = tinhTrangDichVu;
		this.giaDichVu = giaDichVu;
		this.loaiDichVuID = loaiDichVuID;
		this.loaiDichVu = loaiDichVu;

	}

	public int getDichVu_Id() {
		return DichVu_Id;
	}

	public void setDichVu_Id(int dichVu_Id) {
		DichVu_Id = dichVu_Id;
	}

	public String getMaDichVu() {
		return maDichVu;
	}

	public void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public String getMoTaDichVu() {
		return moTaDichVu;
	}

	public void setMoTaDichVu(String moTaDichVu) {
		this.moTaDichVu = moTaDichVu;
	}

	public String getYeuCauCongViec() {
		return yeuCauCongViec;
	}

	public void setYeuCauCongViec(String yeuCauCongViec) {
		this.yeuCauCongViec = yeuCauCongViec;
	}

	public String getKhongBaoGom() {
		return khongBaoGom;
	}

	public void setKhongBaoGom(String khongBaoGom) {
		this.khongBaoGom = khongBaoGom;
	}

	public int getThoiGianUocTinh() {
		return thoiGianUocTinh;
	}

	public void setThoiGianUocTinh(int thoiGianUocTinh) {
		this.thoiGianUocTinh = thoiGianUocTinh;
	}

	public int getTinhTrangDichVu() {
		return tinhTrangDichVu;
	}

	public void setTinhTrangDichVu(int tinhTrangDichVu) {
		this.tinhTrangDichVu = tinhTrangDichVu;
	}

	public float getGiaDichVu() {
		return giaDichVu;
	}

	public void setGiaDichVu(float giaDichVu) {
		this.giaDichVu = giaDichVu;
	}

	public int getLoaiDichVuID() {
		return loaiDichVuID;
	}

	public void setLoaiDichVuID(int loaiDichVuID) {
		this.loaiDichVuID = loaiDichVuID;
	}

	public LoaiDichVu getLoaiDichVu() {
		return loaiDichVu;
	}

	public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
		this.loaiDichVu = loaiDichVu;
	}

}
