/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author dalpi
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 240;
        int b = 160;
        System.out.println("GCD of two numbers " + a +" and " + b +" is: " + gcdEucledian(a, b));
        System.out.println("GCD of two numbers " + a +" and " + b +" is: " + gcdPrimeFactors(a, b));

    }
    static int gcdPrimeFactors(int a, int b) {
        while(a != b){
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    static int gcdEucledian(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcdEucledian(b, a%b);
    }
    
}
