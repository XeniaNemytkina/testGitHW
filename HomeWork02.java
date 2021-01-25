package lesson02;
 /* ДЗ 14. 12. Немыткина Ксения */
public class HomeWork02 {
    public static void main(String[] args) {
        fillDiagonal ();
        maxMin();
        changeArr();
        fillArr();
        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в  принятом массиве 0 на 1, 1 на 0;
        System.out.println("Задание 1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 1 ? 0 : 1;
            System.out.print("[" + arr1[i] + "]");
        }
    }
    //2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его
    // значениями 1 4 7 10 13 16 19 22 25;
    public static void fillArr() {
        System.out.println("Задание 2");
        int[] arr2 = new int[8];
        for (int i = 0, j = 1; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) {System.out.println(x + " "); }
    }


    //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий
    // числа меньше 6 на 2;
    public static void changeArr() {
        System.out.println("Задание 3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] = arr3[i] * 2; System.out.println(arr3[i] + " ");
        }

    }
    //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static void maxMin() {
        System.out.println("Задание 4");
        int[] arr4 = {10, 2, 34, 4, 52, 61, 75};
        int min = arr4[0], max = arr4[0], elementMax = 0, elementMin = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) { max = arr4[i]; elementMax = i;
        } if (arr4[i] < min) { min = arr4[i]; elementMin =i; }
            System.out.println("Max element "  + max);
            System.out.println("Min element "  + min);
    }
    }
    //5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные
    // элементы единицами, используя цикл(ы);
    public static void fillDiagonal () {
        System.out.println("Задание 5");
        int[][] arr5 = new int[5][5];
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0, j2 = arr5[i].length; j < arr5[i].length; j++, j2--){
                if (i == j || i == (j2 -1)) arr5[i][j] = 1;
                System.out.print(arr5[i][j] + " ");
            } System.out.println("\r\n"); }
    }

 // Задания со звездочками не потяну, еле с этими справилась =(
}




















