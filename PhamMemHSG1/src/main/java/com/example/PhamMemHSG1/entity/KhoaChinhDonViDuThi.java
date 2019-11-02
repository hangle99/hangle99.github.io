package com.example.PhamMemHSG1.entity;
import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

//@Embeddable
public class KhoaChinhDonViDuThi implements Serializable { 
//	@GeneratedValue(strategy=GenerationType.AUTO)
//    @Column(name = "id")
    protected int id;
	
//	@GeneratedValue(generator = "my_generator")
//	@GenericGenerator(name = "my_generator", strategy = "com.example.PhamMemHSG1.entity.MyGenerator")
//	@Column(name = "TenDangNhap")
    protected String tenDangNhap;
	
	public KhoaChinhDonViDuThi() {
		super();
	}

	public KhoaChinhDonViDuThi(int id, String tenDangNhap) {
		super();
		this.id = id;
		this.tenDangNhap = tenDangNhap;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getTenDangNhap() {
//		return tenDangNhap;
//	}
//
//	public void setTenDangNhap(String tenDangNhap) {
//		this.tenDangNhap = tenDangNhap;
//	}
	
}
