/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.GiaoVien;

/**
 *
 * @author ADMIN
 */
public class QuanLyGiaoVien {
    ArrayList<GiaoVien> list = new ArrayList<>();

    public QuanLyGiaoVien() {
        list.add(new GiaoVien("Cao Phan Minh Hanh Tuk", 59, "SD1804", "Khong Biet"));
        list.add(new GiaoVien("Nguyen Tien Thanh", 35, "SD1803", "Nữ"));
        list.add(new GiaoVien("Nguyen Tuan Tai", 20, "SD1801", "Nam"));
        list.add(new GiaoVien("Tran Hai Nam", 25, "SD1842", "Osu"));
        list.add(new GiaoVien("Vu Thanh Hai Phong", 25, "SD1812", "Pong"));
        list.add(new GiaoVien("Tran Minh Quan", 25, "SD1832", "Ngo"));
        list.add(new GiaoVien("XD", 25, "SD183122", "Ngu"));
        list.add(new GiaoVien("XD1", 25, "SD1831232", "Ngu1321"));
    }

    public String LoadData(){
        return list;
    }
  
    public String xoa(int row){
        list.remove(row);
        return "Xoa thanh it";
    }
    public String sua(int index, GiaoVien giaoVien) {
        list.set(index, giaoVien);
        return "Sua thanh cong";
    }

    public String them(GiaoVien giaoVien){
        list.add(giaoVien);
        return "Them thanh cong";
    }
  
    public ArrayList<GiaoVien> getList() {
        return list;
    }
}
