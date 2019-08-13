package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        /*System.out.println("Enter your Name please");
        String userName = question.nextLine();
        System.out.println("Hello : " + userName + " we are so glad that you are with us today");
        //1.Приветствовать любого пользователя при вводе его имени через командную строку
        String reverse = new StringBuffer(userName).reverse().toString();
        System.out.println("Hi " + userName + " Here is Your Name in reverse order: " + reverse);
        //2.Отобразить в окне консоли аргументы в обратном порядке

        System.out.println("Please enter any number: ");
        int number = question.nextInt();
        Random rnd = new Random();
        int num = rnd.nextInt(number);
        System.out.println("Random num from 0 to entered number is : " + num);
        for (int i = 0; i <= num; i++) {
            if (i<10){
                System.out.print("Числа до 10 в ряд " + i+" Next number ");}
            else {
                System.out.println("Числа после 10 в столбик " + i);
            }
        }
        // 3. Вывел рандомное число, затем все числа от нуля до этого числа. До 10 без переходом на новую строку, после
        // 10 с переходом

        Scanner passQuestion = new Scanner(System.in);
        System.out.println("Please Enter your Password: ");
        String userPassword = "Globallogic";
        String pass = passQuestion.nextLine();
        if (pass.equals(userPassword)){
            System.out.println("Password is CORRECT");
        }
        else {
            System.out.println("Password is INCORRECT");
        }
        //4. Ввести пароль из командной строки и сравнить его со строкой-образцом.

        System.out.println("Please enter first number:");
        int numberOne = question.nextInt();

        System.out.println("Please enter second number:");
        int numberTwo = question.nextInt();

        System.out.println("Please enter third number:");
        int numberThree = question.nextInt();

        System.out.println("The Sum of Entered Numbers is : " + (numberOne + numberTwo + numberThree));
        System.out.println("The plural of Entered Numbers is : " + (numberOne * numberTwo * numberThree));
        //5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат
        // на консоль.*/
       /* System.out.println("Please enter the numbers of digits that you are planing to enter and press <Enter>");
        int arraySize = question.nextInt();
        int[] sourse = new int[arraySize];
        System.out.println("Please enter any " +arraySize+ " integers using space between them and press <Enter>");

            for (int i = 0 ; i < arraySize ; i++){
            sourse[i]=question.nextInt();
        }//6.Ввести с консоли n целых чисел.
        int plural = 1;
        for (int i = 0; i < sourse.length; i++) {
            plural = plural * sourse[i];
            System.out.println(plural);
        }

            System.out.println("Sum of entered numbers is : " +Arrays.stream(sourse).sum());
            System.out.println("Max digit in Array is  : " +Arrays.stream(sourse).max());// 6.2 максимальное число
            System.out.println("Min digit in Array is : " +Arrays.stream(sourse).min());//6.2 минимальное число

        for (int i = 0; i < sourse.length; i++) {
            int even = sourse[i]%2;
            if (even == 0) {
                System.out.println(sourse[i]+" -It's Even number");

            }
            else {
                System.out.println(sourse[i]+ " -It's Odd Number");


            }
          }
        for (int i = 0; i < sourse.length; i++) {
                if ((sourse[i] % 3 == 0)|| (sourse[i] % 9 == 0)) {
                    System.out.println(sourse[i]+ " - This number can be divided to 3 or 9");
                }
                else {
                    System.out.println(sourse[i]+ " - You can't divide this number to 3 or 9");
                }
          }
        for (int i = 0; i < sourse.length; i++) {
            if ((sourse[i] % 5 == 0)|| (sourse[i] % 7 == 0)) {
                System.out.println(sourse[i]+ " - This number can be divided to 5 or 7");
            }
            else {
                System.out.println(sourse[i]+ " - You can't divide this number to 5 or 7");
            }
        }*/
       //6.3. Числа, которые делятся на 3 или на 9.
        //6.4. Числа, которые делятся на 5 и на 7.


        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter the size of array");
        int n = input.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " Number: ");
            array[i] = input.next();

        }
        System.out.println("User entered three digit's numbers with different digits :");

        for (String s : array) {
            if (s.length() == 3 && s.charAt(0) != s.charAt(1) && s.charAt(2) !=
                    s.charAt(0) && s.charAt(1) != s.charAt(2)) {
                //System.out.println("strArray = " + strArray);
                System.out.println("It's number = " + s);
            }
        }
        //Все трехзначные числа, в десятичной записи которых нет одинаковых
        //цифр.*/
        System.out.println("Enter the size of array");
        int q = input.nextInt();
        String[] array = new String[q];
        for (int i = 0; i < q; i++) {
            System.out.println("Enter " + (i + 1) + " Number: ");
            array[i] = input.next();

        }
        System.out.println("User entered six digit's lucky numbers :");

        for (String s : array) {
            if (s.length() == 6 && s.charAt(0) + s.charAt(1) + s.charAt(2) == s.charAt(3) + s.charAt(4) + s.charAt(5)) {
                System.out.println("It's number = " + s);
                //6.6. «Счастливые» числа.
            }
            System.out.println("HI");
        }
    }
}











