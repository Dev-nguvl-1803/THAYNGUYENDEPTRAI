/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class GiaoVien {
    private String ten;
    private Integer tuoi;
    private String lop;
    private String gioitinh;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public GiaoVien(String ten, Integer tuoi, String lop, String gioitinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return ten + "," + tuoi + "," + lop + "," + gioitinh;
    }
    
}
