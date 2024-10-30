/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BMIberaksi {

    public static void main(String[] args) {
        Scanner inputansaya = new Scanner(System.in);
        System.out.print("\n masukan tinggi badan anda :");
        double tinggi = inputansaya.nextDouble();
        System.out.print("masukan berat badan anda:");
        double berat = inputansaya.nextDouble();
        BMI bmi = new BMI(tinggi, berat);
        bmi.status();
    }
}

