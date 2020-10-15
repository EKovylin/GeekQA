package lesson2;

import java.util.EnumSet;

public class lesson2 {

    public static void main(String[] args) {
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        int[] arrInv = {0, 1, 1, 0, 0, 1};
//        for (int i = 0; i <= arrInv.length-1; i++) {
//            if (arrInv[i] == 0) {
//                arrInv[i] = 1;
//            } else {
//                arrInv[i] = 0;
//            }
//            System.out.print(arrInv[i] + " ");
//        }

// 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

//        int[] arr = new int[8];
//        for (int i = 0; i <= arr.length-1; i++) {
//            arr[i] = i;
//            System.out.println("arr[" + i + "] = " + arr[i]*3);
//        }

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

//        int[] arrMin = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//        for (int i = 0; i <= arrMin.length-1; i++) {
//            if (arrMin[i] < 6) {
//                arrMin[i] *= 2;
//            }
//            System.out.print(arrMin[i] + " ");
//        }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

//        int[][] arrSqd = new int[10][10];
//        for (int i = 0; i < arrSqd.length; i++) {
//            for (int j = 0, j2 = arrSqd[i].length; j < arrSqd[i].length; j++, j2--) {
//                if (i == j || i == (j2 - 1)) {
//                    arrSqd[i][j] = 1;
//                }
//                System.out.print(arrSqd[i][j] + " ");
//            }
//            System.out.print("\r\n");
//        }

//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

//        int[] arrMinMAx = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//        int min = arrMinMAx[0], max = arrMinMAx[0];
//            for (int i = 0; i < arrMinMAx.length; i++) {
//                if (arrMinMAx[i] > max) {
//                    max = arrMinMAx[i];
//            }
//                if (arrMinMAx[i] < min) {
//                    min = arrMinMAx[i];
//                }
//        }
//        System.out.println("Максимльное значением " + max);
//           System.out.println("Минимальное значение " + min);

//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.


        /* Эти задания пока впроцессе. Если честно примерно понимаю как должно работать, но написать это в код не хватет знаний.
 *

*/
//            int numMaxMin[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
//
//
//               for (int i = 0; i < numMaxMin.length; i++) {
//                   int sum1, sum2;
//                    sum1 = numMaxMin[i] + numMaxMin[i+1];
//
//               for (int j = numMaxMin.length; j < i ; j--) {
//                       sum2 = numMaxMin[j] + numMaxMin[j+1];
//                       if (sum1 == sum2) {
//                           System.out.println("Максимльное значением " + i);
//                       }
//               }     return;
//                   }

    }
       }









