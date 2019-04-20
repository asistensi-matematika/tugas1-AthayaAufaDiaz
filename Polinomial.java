/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Polinomial {
     public static void main(String args[]){
        System.out.println("Input");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        if (a==0){System.out.println("Nilai a tidak boleh sama dengan 0" );
        }
        if(a!=0){
            System.out.println(a + "x^2 +" + b + "x+" + c + " mempunyai: ");}
        double D = (b*b) - (4 * a * c);
        System.out.println("1. Diskriminan\t\t\t: " + D );
        
        if(D>=0){
            double x1;
            double x2;
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("2. Akar dari polinomial\t\t: " + x1 + " dan " + x2);
        }else{
            D*=-1;
            double x1;
            double x2;
            x1 = (-b)/(2*a);
            x2 = Math.sqrt(D)/(2*a);
            if(x2<0){
                x2*=-1;
            }
            System.out.println("2. Akar dari polinomial\t\t: " + x1 + "+" + x2+"i" + " dan " + x1 + "-" + x2+"i");
            D*=-1;
        }        
        double absis;
        double ordinat;
        absis = (-b)/(2*a);
        ordinat = (-D)/(4*a);
        System.out.println("3. Titik Stasioner\t\t: (" + absis + "," + ordinat +")");
        
        if(a>0){System.out.println("4. Kecekungan kurva\t\t: atas" );}
        else{System.out.println("4. Kecekungan kurva\t\t: bawah" );}
        if(a>0){System.out.println("5. Nilai minimum lokal\t\t: " + ordinat );}
        else{System.out.println("5. Nilai maksimum lokal\t\t: " + ordinat );}
        }
}