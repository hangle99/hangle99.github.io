
package com.example.PhamMemHSG1.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PhamMemHSG1.entity.DonViDuThi;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface DonViDuThi2Repository extends JpaRepository<DonViDuThi, Integer>{
	@Query(value = "SELECT * FROM donviduthi WHERE ten_dang_nhap =?1", nativeQuery = true)
	DonViDuThi getDonViDuThiByTenDangNhap(String tenDangNhap);
	@Query(value = "SELECT * FROM donviduthi WHERE ma_don_vi LIKE %?1% and ten_don_vi LIKE %?2% and dia_chi LIKE %?3% and email LIKE %?4% and (?5 = 0 or loai_don_vi = ?5)", nativeQuery = true)
	List<DonViDuThi> getListDonViDuThi(String maDonVi, String tenDonVi, String diaChi, String email, int loaiDonVi);
	@Query(value = "SELECT * FROM donviduthi WHERE ma_don_vi =?1", nativeQuery = true)
	DonViDuThi getDonViDuThiByMaDonVi(String maDonVi);
	

}
