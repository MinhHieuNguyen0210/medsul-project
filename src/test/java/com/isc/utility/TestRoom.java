package com.isc.utility;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.isc.entity.Admin;
import com.isc.entity.DichVu;
import com.isc.entity.DieuDuong;
import com.isc.entity.LoaiDichVu;
import com.isc.entity.TinhThanh;
import com.isc.entity.User;
import com.isc.repository.AdminRepository;
import com.isc.repository.DichVuRepository;
import com.isc.repository.DieuDuongReponsitory;
import com.isc.repository.TinhThanhRepository;
import com.isc.repository.UserReposity;

@SpringBootTest
public class TestRoom {
	@Autowired
	AdminRepository adminRepository;

	@Autowired
	DieuDuongReponsitory dieuDuongResponsitory;

	@Autowired
	DichVuRepository dichVuRepo;

	@Autowired
	UserReposity userRepo;
	
	@Autowired
	TinhThanhRepository tinhThanhRepo;
	@Test
	public void testFindUserNameOfAdmin() {
		Date date = new Date(0, 0, 0);
		Admin member = adminRepository.GetAdminByUsername("tien");
		// Admin memberTest = new Admin("DucVien", "123", "Quang Ngai", "032515161",
		// date);
		Assert.assertEquals("tien", member.getADMIN_USERNAME());
	}

	@Test
	public void testHoTenFindByMaDieuDuong() {
		LocalDate localDate = LocalDate.now();
		DieuDuong dieuDuong = new DieuDuong();
		dieuDuong.setHoTen("Trần Thanh Quy");
		DieuDuong dieuDuongTest = dieuDuongResponsitory.GetDieuDuongByMaDieuDuong("DD0001");
		Assert.assertEquals(dieuDuong.getHoTen(), dieuDuongTest.getHoTen());

	}

	@Test
	public void testGetAdminByUserName() {
		Admin admin = adminRepository.GetAdminByUsername("hieu");
		Assert.assertNotNull(admin);
	}

	@Test
	public void testFindDichVu() {
		LoaiDichVu loaiDichVu = new LoaiDichVu();
		loaiDichVu.setLoaiDichVu_Id(4);
		loaiDichVu.setMaLoaiDichVu("PHCN");
		loaiDichVu.setTenLoaiDichVu("Phục Hồi Chức Năng");
		loaiDichVu.setTinhTrangLoaiDichVu(1);
		DichVu dichVu = new DichVu(1, "PHCN STB", "Phục Hồi Chức Năng Sau Tai Biến",
				"Tai biến – đột quỵ có thể gặp ở bất kỳ lứa tuổi nào, tỷ lệ cao nhất ở người lớn tuổi nhưng đang có xu hướng trẻ hóa. Hậu quả thường gặp nhất sau tai biến là bệnh nhân mất khả năng vận động, liệt nửa người không tự chăm sóc được bản thân và sinh hoạt khó khăn.",
				"Chăm sóc toàn diện cho bệnh nhân tại nhà và bệnh viện thay cho người nhà bệnh nhân bằng các điều dưỡng viên được đào tạo bài bản, chính quy",
				"- Thay băng cắt chỉ cho vết thương.", 3, 1, 399000, 4, loaiDichVu);
		DichVu dichVuTest = dichVuRepo.getDVByDichVuID(1);
		
		Assert.assertEquals(dichVu, dichVuTest);
		// Override Equals() func at LoaiDichVu & DichVu to compare 2 object
	}

	@Test
	public void testGetUserNotNull() {
		Optional<User> user = userRepo.findById(33);
		Assert.assertNotNull(user);
	}
	@Test
	public void testGetTinhThanhByMaTinhThanh() {
		TinhThanh tinhThanh = tinhThanhRepo.GetTinhThanhByTenTinhThanh("Hồ Chí Minh");
		Assert.assertNotNull(tinhThanh);
	}
}
