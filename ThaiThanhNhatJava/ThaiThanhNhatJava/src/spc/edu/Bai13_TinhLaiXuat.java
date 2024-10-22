/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai13_TinhLaiXuat {
     public static void main(String[] arg){
        System.out.println("Tinh lai suat");
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("Nhap tien gui: ");
        double tienGui = nhap.nextDouble();
        System.out.println("Nhap so nam: ");
        double sonam = nhap.nextDouble();
        System.out.println("Nhap lai xuat: ");
        double laiXuat = nhap.nextDouble();
        double tienLai;
        for (int i =1; i <= sonam; i++){
            tienLai = tienGui * laiXuat;
            tienGui += tienLai;
            System.out.println("Tien lai: "+ tienLai);
        }
    }  
}
