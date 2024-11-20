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
        list.add(new GiaoVien("", Integer.SIZE, "", ""));
        list.add(new GiaoVien("", Integer.SIZE, "", ""));
        list.add(new GiaoVien("", Integer.SIZE, "", ""));
        list.add(new GiaoVien("", Integer.SIZE, "", ""));
        list.add(new GiaoVien("", Integer.SIZE, "", ""));
    }
    
    public String them(GiaoVien giaoVien){
        list.add(giaoVien);
        return "Them thanh cong";
    }
}
