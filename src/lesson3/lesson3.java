package lesson3;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    private static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static Scanner scl = new Scanner(System.in);
    static Scanner scWord = new Scanner(System.in);

    public static void main(String[] args) {
//
// 1. Написать программу, которая загадывает случайное число от 0 до 9,
// и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//      do {
//          gameLogic();
//      } while (restart () == true);
//
//    }
//
//
//    private static void gameLogic() {   // Логика игры
//        int numbs = random.nextInt(3);
//        for (int i = 3; i > 0; i--) {
//            System.out.println("Введите число в пределах от 0 до 9");
//              int x = sc.nextInt();
//            if (numbs == x) {
//                System.out.println("Вы угадали!");
//                break;
//            }
//            else if (i == 0) {
//                System.out.println("попытки закончились");
//            }
//            System.out.println(x > numbs ? "больше загаданного" : "меньше загаданного");
//        }
//    }
//    private static boolean restart () {  // задаем контрольный вопрос и ждем от скана ответ
//        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет?");
//        int y = 0;
//        y = scl.nextInt();
//        return(y == 1);
//    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
//"carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        gameFruit();
//
//    }
//
//    private static void gameFruit() {
//
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
//                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
//                "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        //загадаем слово из массива
//        int indWord = random.nextInt(words.length - 1);
//        String word = words[indWord];
//
//        int lenWord = word.length();
//        System.out.println("Я загадал слово, попробуй отгадать его");
//        System.out.println(word);
//        //инициализируем сканер;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            //спрашиваем ответ
//            System.out.println("Введи свой ответ: (для выхода из игры, просто нажмите Enter)");
//            String answer = scanner.nextLine();
//            //если нам надоес играть то мы выйдем
//            if (answer.equals("")) break;
//            else if (word.equals(answer)) {
//                System.out.println("Вы угадали слово");
//                break;
//            }
//            //подсказка
//            char[] s = answer.toCharArray();
//            for (int i = 0; i < lenWord; i++) {
//                if (i >= s.length) {
//                   break;
//                }
//                    if (word.charAt(i) != s[i]) { s[i] = '#';
//                    }
//            }
//            StringBuilder comment = new StringBuilder(String.valueOf(s));
//            for (int i = comment.length(); i < 15; i++) comment.append("#");
//            System.out.println(comment);
//        }
//        while (true);
//    }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




//        for (int i = 1; i < stringLen; i++) {
//            if (s2.charAt(i) >= 'А' && s2.charAt(i) <= 'Я') {
//                s2.setCharAt(1, '.');
//            }

        // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // // //
// 3. Домашнее задание

//        System.out.println(lastChar());
//    }
//
//    public static StringBuilder lastChar () {
//        String s = "Предложение   один         Теперь    предложение   два   Предложение      три";
//        String s1 = s.replaceAll(" +", " ");
//
//        StringBuilder s2 = new StringBuilder(s1);
//        int last = s2.charAt(s2.length() - 1);
//        for (int i = 1; i < s2.length(); i++)
//        {
//            if (s2.charAt(i) >= 'А' && s2.charAt(i) <= 'Я') {
//                s2.setCharAt(i-1, '.');
//            }
//            if (i == s2.length()-1) {
//                s2.insert(s2.length(), '.');
//            break;                                  // поставил потому что просит ide. Почему просит, сам не понял?
//            }
//            }
//
//            return (s2); //
//        }


}

//




