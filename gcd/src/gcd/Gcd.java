/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Integer> primForA = primeFactors(a);
        List<Integer> primForB = primeFactors(b);
        
        List<Integer> commonPrim = getCommon(primForA, primForB);
       
        
        int tmp = commonPrim.get(0);
        for(int i = 0; i < commonPrim.size()-1; i++)
        {
            tmp *= commonPrim.get(i+1);
        }
        return tmp;
    }
    
    static  List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
    
    static List<Integer> getCommon(List<Integer> primForA, List<Integer> primForB) {
        List<Integer> bigger;
        List<Integer> smaller;
        List<Integer> common = new ArrayList<Integer>();
        if(primForA.size() < primForB.size()){
            bigger = primForB;
            smaller = primForA;
        }
        else{
            bigger = primForA;
            smaller = primForB;
        }
        for (int i = 0; i < smaller.size(); i++) {
            if(bigger.get(i) == smaller.get(i)){
                common.add(bigger.get(i));
            }
        }
         if(common.size() == 0){
            List<Integer> bla = Arrays.asList(1);
            return bla;
        }
        return common;
    }
    
    static int gcdEucledian(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcdEucledian(b, a%b);
    }
    
}
