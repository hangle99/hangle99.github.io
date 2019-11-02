package com.example.PhamMemHSG1.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.example.PhamMemHSG1.entity.DonViDuThi;
import com.example.PhamMemHSG1.service.DonViDuThiService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders="*")
@RequestMapping(value = "/donviduthi")

public class DonViDuThiController {
	@Autowired
	DonViDuThiService donViDuThiService;
	
	@PostMapping("/addDonViDuThi")
	@ResponseBody
	public Boolean addDonViDuThi(@RequestBody DonViDuThi donViDuThi) {
		System.out.println(donViDuThi);
		return donViDuThiService.addDonViDuThi(donViDuThi);
	}
//	@DeleteMapping("/deleteDonViDuThi")
//    @ResponseBody
//    public Boolean deleteDonViDuThi(@RequestBody DonViDuThi donViDuThi) {
//    	donViDuThiService.deleteDonViDuThi(donViDuThi);
//    	return true;
//    }
	@PostMapping("/deleteDonViDuThi")
    @ResponseBody
    public Boolean deleteDonViDuThi(@RequestBody String maDonVi) {
    	donViDuThiService.deleteDonViDuThi(maDonVi);
     	System.out.println(maDonVi);
    	return true;
    }
    @PutMapping("/editDonViDuThi")
    @ResponseBody
    public Boolean editDonViDuThi(@RequestBody DonViDuThi donViDuThi) {
    	return donViDuThiService.addDonViDuThi(donViDuThi);
    }
    @GetMapping("/getDonViDuThi")
	@ResponseBody
	public List<DonViDuThi> getListDonViDuThi(
			@RequestParam (value = "maDonVi", defaultValue = "", required = false ) String maDonVi,
			@RequestParam (value = "tenDonVi", defaultValue = "", required = false ) String tenDonVi,
			@RequestParam (value = "diaChi", defaultValue = "", required = false ) String diaChi,
			@RequestParam (value = "email", defaultValue = "", required = false ) String email,
			@RequestParam (value = "loaiDonVi", defaultValue = "0", required = false ) int loaiDonVi
			){
		return donViDuThiService.getListDonViDuThi(maDonVi, tenDonVi, diaChi, email, loaiDonVi);		
		}
    @GetMapping("/getDonViDuThiByMaDonVi")
    @ResponseBody
    public DonViDuThi getDonViDuThiByMaDonVi(@RequestParam (value = "maDonVi" ) String maDonVi) {
    	return donViDuThiService.getDonViDuThiByMaDonVi(maDonVi);
    }
}

