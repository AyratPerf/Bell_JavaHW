package Calculator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                //Создаём сканер
        float answer;                                                       //Переменная для записи ответа
        float firstNum;                                                     //Переменная для записи первого числа
        float secondNum;                                                    //Переменная для записи второго числа
        String[] stopWord = {"stop","Stop","STOP", "sTOP","ыещз","Ыещз","ЫЕЩЗ", "ыЕЩЗ"};     //Массив из стоп-слов для выхода из калькулятора
        String action;                                                      //Строка для ввода стоп слова
        String operation;                                                   //Строка для записи операции
        String[] ops = {"+","-","*","/"};                                   //Массив из возможных операций
        System.out.println("Welcome to mini-calculator!");                  //Приветствие
        do {                                                                //Цикл для запуска калькулятора
            System.out.println("Please, enter first number:");              //Просим ввести первое число
            firstNum = sc.nextInt();                                        //Сканером считываем первое число
            System.out.println("Enter the operation to be performed.\n" +   //Просим ввести операцию
                    "Our application supports '+' '-' '*' '/'");            //Показываем поддерживаемые операции
            operation = sc.next();                                          //Сканером считываем второе число
            while (!Arrays.asList(ops).contains(operation)) {               //Цикл для исключения ввода неподдерживаемых операций
                //выводим предупреждение, если введена неподдерживаемая операция и просим ввести операцию снова
                System.out.println("""                                      
                        WARNING!!!
                        Unfortunately, this is a beta version of the calculator.
                        Please, use only those operations that our application supports.
                        Enter the operation to be performed.
                        Our application supports '+' '-' '*' '/'
                        """);
                operation = sc.next();                                      //Перезаписываем операцию
            }
            System.out.println("Enter second number:");                     //Просим ввести второе число
            secondNum = sc.nextInt();                                       //Сканером считываем второе число
            if(secondNum == 0 && operation.equals("/")) {                   //Проверяем, не пытается ли юзер разделить на 0
                System.out.println("ERROR!!!\n" +                           //Выводим ошибку, если делим на 0
                        "Can't divide by 0. Try again.");
            } else {                                                        //Если не делим на 0, то всё ок
                switch (operation) {                                        //В зависимости от введённой операции, выбираем наше дальнейшее действие
                    case "+" -> {                                           //Действие при сложении
                        answer = firstNum + secondNum;                      //Высчитываем ответ
                        System.out.println("The answer is: " + answer);     //Выводим ответ для пользователя
                    }
                    case "-" -> {                                           //Странно на самом деле
                        answer = firstNum - secondNum;                      //Если ты до сих пор
                        System.out.println("The answer is: " + answer);     //Читаешь эти комментарии
                    }
                    case "*" -> {                                           //Вроде и так всё понятно
                        answer = firstNum * secondNum;                      //Хоть и написано не в стиле ООП
                        System.out.println("The answer is: " + answer);     //Я эти комменты вообще от скуки решил написать
                    }
                    case "/" -> {                                           //Не, ну в начале надо было кое-что объяснить
                        answer = firstNum / secondNum;                      //Но тут-то уже норм вроде
                        System.out.println("The answer is: " + answer);     // ¯\_(ツ)_/¯
                    }
                }
            }
            System.out.println("Enter 'Stop' for exit or anything for new operation:");     //Просим ввести стоп-слово, если нужно выйти
            action = sc.next();                                             //Считываем сканером стоп-слово
        } while (!Arrays.asList(stopWord).contains(action));                //Если введено слово из массива стоп-слов, то цикл завершится
        sc.close();                                                         //Меня учили закрывать сканер, только я без понятия, насколько это актуально перед закрытием приложения
    }
}
