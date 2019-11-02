package com.example.PhamMemHSG1.serviceImpl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PhamMemHSG1.entity.DonViDuThi;
import com.example.PhamMemHSG1.repository.DonViDuThi2Repository;
import com.example.PhamMemHSG1.service.DonViDuThiService;



@Service
public class DonViDuThiServiceImpl implements DonViDuThiService{
	@Autowired
	DonViDuThi2Repository donViDuThiRepository;
	@Override
	public Boolean addDonViDuThi(DonViDuThi donViDuThi) {
		donViDuThiRepository.save(donViDuThi);
        return true;
	}
	@Override 
	public Boolean deleteDonViDuThi(String maDonVi) {
		donViDuThiRepository.deleteById(this.getDonViDuThiByMaDonVi(maDonVi).getId());
		return true;
	}
	@Override
	public List<DonViDuThi> getListDonViDuThi(String maDonVi, String tenDonVi, String diaChi, String email, int loaiDonVi) {
		return donViDuThiRepository.getListDonViDuThi(maDonVi, tenDonVi, diaChi, email, loaiDonVi);
	}
	@Override 
	public DonViDuThi getDonViDuThiByMaDonVi(String maDonVi) {
		return donViDuThiRepository.getDonViDuThiByMaDonVi(maDonVi);
	}
}
