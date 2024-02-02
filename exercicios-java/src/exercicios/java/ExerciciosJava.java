/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios.java;

/**
 *
 * @author 924535
 */
public class ExerciciosJava {

    public static void main(String[] args) {
        //Ex001
        System.out.println("Hello World");

        //Ex002
        //Comentario em uma linha só
        /*Comentario em
      Diversas linhas*/
        
        //Ex003
        String carName = "Volvo";

        //Ex004
        int maxSpeed = 120;

        //Ex005
        int x = 5;
        int y = 10;
        System.out.println(x + y);

        //Ex006
        int z = x + y;
        System.out.println(z);

        //Ex007
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

        //Ex008
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";

        //Ex009
        //Tipos de dados primitivos
        
        //Ex010
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);

        //Ex011
        System.out.println(10 * 5);

        //Ex012
        System.out.println(10 / 5);

        //Ex013
        int v = 10;
        ++v;
        System.out.println(v);

        //Ex014
        int n = 10;
        n += 5;
        System.out.println(n);

        //Ex015
        String greeting = "Hello";
        System.out.println(greeting);

        //Ex016
        String txt = "Hello";
        System.out.println(txt.toUpperCase());

        //Ex017
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + lastName);

        //Ex018
        System.out.println(firstName.concat(lastName));

        //Ex019
        String txt1 = "Hello Everybody";
        System.out.println(txt1.indexOf("e"));

        //Ex020
        Math.max(x, y);

        //Ex021
        int h = 16;
        Math.sqrt(h);

        //Ex022
        Math.random();

        //Ex023
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        //Ex024
        int f = 10;
        int g = 9;
        System.out.println(f > g);

        //Ex025
        int o = 50;
        int i = 10;
        if (o > i) {
            System.out.println("Hello World");
        }

        //Ex026
        int u = 50;
        if (u == o) {
            System.out.println("Hello World");
        }

        //Ex027
        if (u == o) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //Ex028
        if (u == o) {
            System.out.println("1");
        } else if (u > o) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        //Ex029
        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);

        //Ex030
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
        }

        //Ex031
        int day1 = 4;
        switch (day1) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekend");
        }

        //Ex032
        int d = 1;
        while (d < 6) {
            System.out.println(d);
            d++;
        }

        //Ex033
        int r = 1;
        do {
            System.out.println(r);
            r++;
        } while (r < 6);

        //Ex034
        for (int numb = 0; numb < 5; numb++) {
            System.out.println("Sim");
        }

        //Ex035
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String carros : cars) {
            System.out.println(carros);
        }
        
        //Ex036
        for (int num1 = 0; num1 < 10; num1++) {
            if (num1 ==5) {
                break;
            }
            System.out.println(num1);
        }
        
        //Ex037
        for (int num2 = 0; num2 < 10; num2++) {
            if (num2 == 4) {
                continue;
            }
           System.out.println(num2);
        }
        
        //Ex038
        String[] carros1 = {"Volvo", "BMW", "Ford"};
        
        //Ex039
        System.out.println(carros1[1]);
        
        //Ex040
        carros1[0] = "Opel";
        System.out.println(carros1[0]);
        
        //Ex041
        System.out.println(carros1.length);
        
        //Ex042
        for (String qtd : carros1){
            System.out.println(qtd);
        }
        
        //Ex043
        int [] [] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        
        //Ex044
        //myMethod();
        
        //Ex045
        //myMethod();
        //myMethod();
        
        //Ex046
        //String fname
        //fname
        
        //Ex047
        //return = 5 + x;
        
        //Ex048
        //public class MyClass
        
        //Ex049
        //MyClass objeto = new MyClass();
        
        //Ex050
        //System.out.println(objeto.x);
        
        //Ex051
        //objeto.myMethod();
        
        //Ex052
        /*public class MyClass {
        int x;
        
        public MyClass() {
        x = 5;
       }
       public static void main(String[]args) {
       MyClass myObj = new MyClass();
       System.out.println(myObj.x);
       }*/
        
       //Ex053
       //private class MyClass
        
       //Ex054
       //import.java.util.Scanner;
       
       //Ex055
       // class Car extends Vehicle
    }
}
