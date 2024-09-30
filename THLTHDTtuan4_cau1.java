/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thlthdttuan4_cau1;
import java.util.Scanner;



/**
 *
 * @author admin
 */
public class THLTHDTtuan4_cau1 {

    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
       System.out.print("nhap n = ");
       int n= scanner.nextInt();
       int i;
       int Tong=0;
       for(i=1;i<=n;i++)
           Tong= Tong+i;
       System.out.println("tong tu 1 den " +n+" la "+Tong);
       
    }
}
