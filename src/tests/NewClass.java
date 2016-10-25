/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import myutils.MyUtils;

/**
 *
 * @author Roger G. Coscojuela
 */
public class NewClass {

    public static void main(String[] args) {
        NewClass prg = new NewClass();
        prg.inici();
    }

    public void inici() {
        TestFactorial(1);
        TestFactorial(2);
        TestFactorial(3);
        TestFactorial(4);
        TestFactorial(5);
        TestFactorial(6);
        TestFactorial(7);
        TestFactorial(8);
        TestFactorial(9);
        TestFactorial(10);
        TestFactorial(11);
        TestFactorial(12);
        TestFactorial(13);
        TestFactorial(14);
        TestFactorial(15);
        TestFactorial(16);
        TestFactorial(17);
        TestFactorial(18);
        TestFactorial(19);
        TestFactorial(20);
        TestFactorial(21);
        TestFactorial(22);
        TestFactorial(23);
        TestFactorial(24);
        TestFactorial(125);
          TestFactorial(135);

    }

    public void TestFactorial(long numero) {
        long factorial;
        factorial = MyUtils.factorial(numero);
        System.out.println("El factorial de " + numero + " es " + factorial);
    }

}
