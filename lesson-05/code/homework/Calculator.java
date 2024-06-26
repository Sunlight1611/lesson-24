package homework;


import java.util.Scanner;
/*Написать приложение - калькулятор для работы с **целыми числами**:
oper == 1 => +, oper == 2 => -, oper == 3 => *, oper == 4 => /, oper == 5 => % ,
other print "Wrong operation".*/

    public class Calculator {
        public static void main(String[] args) {

            //объявляем переменную, в которую будем записывать то, что введет пользователь
            int num1, num2, action; // однотипные переменные можно задавать в одной строке через ','
            int result;
            //заводим экземпляр класса Scanner в переменной scanner
            Scanner scanner = new Scanner(System.in);
            //говорим пользователю ввести первое число
            System.out.println("Input first number: ");
            num1 = scanner.nextInt();
            //говорим пользователю ввести второе число
            System.out.println("Input second number: ");
            num2 = scanner.nextInt();
            //говорим пользователю ввести число от 1 до 5, обозначающие операции с числами
            System.out.println("Input a number between 1 and 5: ");
            //"заставляем" переменную "слушать" и записывать в себя то, что напечатает пользователь
            action = scanner.nextInt();

            switch (action) {
                case (1):
                    result = num1 + num2;
                    System.out.println("Your result is: " + result);
                    break;
                case (2):
                    result = num1 - num2;
                    System.out.println("Your result is: " + result);
                    break;
                case (3):
                    result = num1 * num2;
                    System.out.println("Your result is: " + result);
                    break;
                case (4):
                    result = num1 / num2; // получение целой части от деления
                    System.out.println("Your result is: " + result);
                    break;
                case (5):
                    result = num1 % num2; // получение остатка от деления
                    System.out.println("Your result is: " + result);
                    break;
                default: System.out.println("You made a mistake in last number. It must be between 1 and 5!");
            }
        }
    }

