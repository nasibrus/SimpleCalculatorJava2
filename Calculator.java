/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.*;


/**
 *
 * @author Ruslan Nasibov (@nasibrus)
 */


public class Calculator {

    public static void main(String[] args) {
        Calculator();
    }

    public static double Calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert value to A");
        double a = sc.nextDouble();
        System.out.println("Please insert value to B");
        double b = sc.nextDouble();
        System.out.println("*Please choose operation* \n"
                + "   *operation + (addition) is 1    *\n"
                + "   *operation - (Subtraction) is 2 *\n"
                + "   *operation * (Multiply) is 3    *\n"
                + "   *operation / (Divide) is 4      *\n"
                + "   *operation % (Module) is 5      *\n");
        int operation = sc.nextInt();

        double result = 0;
        //Optimized Version without using if
        switch (operation) {
            case 1:
                result = MathUtil.add(a, b);
                break;
            case 2:
                result = MathUtil.sub(a, b);
                break;
            case 3:
                result = MathUtil.mult(a, b);
                break;
            case 4:
                result = MathUtil.div(a, b);
                break;
            case 5:
                result = MathUtil.mod(a, b);
            default:
                System.out.println("Broken down");
                break;
        }
        return result;
    }

}
