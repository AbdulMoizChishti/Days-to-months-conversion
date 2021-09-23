/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daystomonth;


/**
 *
 * @author Abdul Moiz Chishti
 */
import java.util.Scanner;
public class Daystomonth {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Input Number of Days:");
        int day =obj.nextInt();
        int limitm=30;
        int month= day/limitm;
        int remdays= day%limitm;
        System.out.println(day+" days are "+month+" months"+ " and "+remdays+" days");
    }
}