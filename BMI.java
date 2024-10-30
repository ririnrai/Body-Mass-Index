/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

public class BMI {

    double tinggi;
    double berat;

    public BMI(double tinggi, double berat) {
        this.tinggi = tinggi / 100;
        this.berat = berat;
    }

    public void status() {
        double bmi = berat / (tinggi * tinggi);
        if (bmi < 18.5) {
            System.out.println("Status  : kurus");
        } else if (bmi < 25) {
            System.out.println("Status  : normal");
        } else if (bmi < 30) {
            System.out.println("Status  : gemuk");
        } else {
            System.out.println("Status  : obesitas");
        }
        System.out.printf("Bmi anda : %.1f%n",bmi);
    }
}
