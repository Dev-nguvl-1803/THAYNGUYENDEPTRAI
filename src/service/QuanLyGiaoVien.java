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
        list.add(new GiaoVien("Tran Minh Quan", 25, "SD1832", "Ngo"));
        list.add(new GiaoVien("Bob Impact", 25, "SD1809", "Nam"));
    }
}
