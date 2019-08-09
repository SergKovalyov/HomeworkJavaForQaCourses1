package com.company;
import java.util.Random;
import java.util.Scanner;
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
        System.out.println("Please enter any integer");
        int exSix = question.nextInt();

        while (question.hasNextInt()) {
            int
            //int number6 = question.nextInt();
           /* if (exSix % 2 == 0) {
                System.out.println(exSix + " is Even number");

            } else {
                System.out.println(exSix + " is Odd number");
            }*/
        }
    }
}




