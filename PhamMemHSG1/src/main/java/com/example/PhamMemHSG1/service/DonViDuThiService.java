package com.example.PhamMemHSG1.service;

import java.util.List;

import com.example.PhamMemHSG1.entity.DonViDuThi;

public interface DonViDuThiService {
	Boolean addDonViDuThi(DonViDuThi donViDuThi);
	//Boolean deleteDonViDuThi(DonViDuThi donViDuThi);
	List<DonViDuThi> getListDonViDuThi(String maDonVi, String tenDonVi, String diaChi, String email, int loaiDonVi);
	DonViDuThi getDonViDuThiByMaDonVi(String maDonVi);
	Boolean deleteDonViDuThi(String maDonVi);
}

