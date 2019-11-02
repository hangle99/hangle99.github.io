package com.example.PhamMemHSG1.entity;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity

@Table(name="donviduthi")
@IdClass(KhoaChinhDonViDuThi.class)
public class DonViDuThi implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private int id;
	@Id
	@GeneratedValue(generator = "my_generator")
	@GenericGenerator(name = "my_generator", strategy = "com.example.PhamMemHSG1.entity.MyGenerator")
	@Column(name = "TenDangNhap")
    private String tenDangNhap;
//	@EmbeddedId
//	private KhoaChinhDonViDuThi khoaChinhDonViDuThi;
	@Column(name = "MatKhau")
    private String matKhau;
	@Column(name = "MaDonVi")
    private String maDonVi;
	@Column(name = "TenDonVi")
    private String tenDonVi;
	@Column(name = "DiaChi")
    private String diaChi;
	@Column(name = "Email")
    private String email;
	@Column(name = "loaiDonVi")
    private int loaiDonVi;
	
	public DonViDuThi() {
	}
	public DonViDuThi(String tenDangNhap, String matKhau, String maDonVi, String tenDonVi, String diaChi,
			String email, int loaiDonVi) {
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.maDonVi = maDonVi;
		this.tenDonVi = tenDonVi;
		this.diaChi = diaChi;
		this.email = email;
		this.loaiDonVi = loaiDonVi;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	
//	public DonViDuThi(KhoaChinhDonViDuThi khoaChinhDonViDuThi, String matKhau, String maDonVi, String tenDonVi,
//		String diaChi, String email, int loaiDonVi) {
//	super();
//	this.khoaChinhDonViDuThi = khoaChinhDonViDuThi;
//	this.matKhau = matKhau;
//	this.maDonVi = maDonVi;
//	this.tenDonVi = tenDonVi;
//	this.diaChi = diaChi;
//	this.email = email;
//	this.loaiDonVi = loaiDonVi;
//}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public String getMaDonVi() {
		return maDonVi;
	}
	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}
	public String getTenDonVi() {
		return tenDonVi;
	}
	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLoaiDonVi() {
		return loaiDonVi;
	}
	public void setLoaiDonVi(int loaiDonVi) {
		this.loaiDonVi = loaiDonVi;
	}
	
}
