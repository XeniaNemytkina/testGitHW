package online;

import java.io.IOException;

public class StrDemo {
    public static void main(String[] args) {
//        System.out.println("One string\nTwo string");
//        System.out.println("A\tB\tC\nD\tE\tF");
//
//        double radius = 4, heightt = 5;
//        double volume = 3.1416 * radius * radius * heightt;
//        System.out.println("Объем " + volume);

//        int x; x = 10;
//        if (x == 10) {
//            int y = 20;
//            System.out.println("x and y " + x + " " + y);
//            x = y * 2;
//        } int y;
//        y = 10;

//        int iresult, irem;
//        double dresult, drem;
//        iresult = 10 / 3;
//        irem = 10 % 3;
//        dresult = 10.0 / 3.0;
//        drem = 10 % 3;
//        System.out.println("10/3 " + iresult + " " + irem + "\n" + " 10.0/3.0 " + dresult + " " + drem);
/*Демонстрация использования операций сравнения и логических операций */
//        int i, j;
//        boolean b1, b2;
//        i = 10;
//        j = 11;
//        if(i < j) System.out.println("i<j");
//        if(i <= j) System.out.println("i<=j");
//        if(i != j) System.out.println("i!=j");
//        if(i == j) System.out.println("No");
//        if(i > j) System.out.println("No");
//        if(i > j) System.out.println("No");
//
//        b1 = true;
//        b2 = false;
//        if(b1 & b2) System.out.println("No");
//        if(!(b1 & b2)) System.out.println("!(b1 & b2) true");
//        if(b1 | b2) System.out.println("b1 | b2 true");
//        if(b1 ^ b2) System.out.println("b1 ^ b2 true");
        /*Использование укороченных логических операций */
//        int n, d, q;
// n = 10; d = 0;
// if(d != 0 && (n % d) == 0) System.out.println(d + " /" + n);
//        if(d != 0 & (n % d) == 0);
        // Демонстрация приведения типов
//        double x, y;
//        byte b; int i; char ch;
//
//        x = 10.0; y = 3.0;
//        i = (int) (x / y);
//
//        i = 100;
//        b = (byte) i;
//        i = 257;
//        b = (byte) i;
//        System.out.println("b" + b);
//        b =88;
//        ch = (char) b;
//        System.out.println("ch " + ch);
//
//        int a, b, c, d; float f;
//        a = 10; b = 20; c = 30; d = 40;
//        f = (float) a + (b + (c / d));
//        System.out.println("f = " + f);

//        System.out.println("Please take the knopka ");
//        char ch = 0;
//        try {
//            ch = (char) System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(" " + c
       /* int a = 5;
        int b = 6;
        boolean result;

        result = (a < b);
        System.out.println(result);*/
 /*boolean a = true, c = true;
 boolean b = false, d = false;
 boolean result;
 result = a && b;
 result = (5 < 1) && (5 > 3);
 int h = 10, f = 0;
 result = (h > 0) || (f < 5) || (h == f);
 result = !(f <= h);
 result = !result;

 int age = 22;
 String status;
 status = (age >= 18) ? ("Adult") : ("Not an adult");
     System.out.println(status);
     int day = 31;
     String ny;
     ny = (day == 31) ? ("Happy New Year") : ("Sorry, wait..");
        System.out.println(ny);

        *//*********************************//*
        int number1 = 1234;
        int number2 = 4567;
        String result1;
        result1 = (number2 % 2 == 0) ? ("Even") : ("Not even");
        System.out.println(result1);
        result1 = ((number1 + number2) >= 5000) && ((number1 + number2) <= 5500)? ("Yes") : ("No");
        System.out.println(result1);*/

//        int sum = 4000;
//        float discount = 0.0f;
//        float discount0 = ((sum >= 1000) && (sum < 5000)) ? (discount0 = 0.03f) : (discount);
//        float sumDiscount = sum * (1 - discount);
//        System.out.println("Discount have " + (discount * 100) + " %\nSum + discount have " + sumDiscount);
//        float discount1 = ((sum >= 5000) && (sum < 10000)) ? (discount1 = 0.07f) : (discount);
//        float sumDiscount1 = sum * (1 - discount1);
//        System.out.println("Discount have " + (discount * 100) + " %\nSum + discount have " + sumDiscount1);
//        float discount2 = (sum >= 10000)  ? (discount2 = 0.1f) : (discount);
//        float sumDiscount2 = sum * (1 - discount2);
//        System.out.println("Discount have " + (discount * 100) + " %\nSum + discount have " + sumDiscount2);

//        if((sum >= 1000) && (sum < 5000)) discount = 0.03f;
//        if((sum >= 5000) && (sum < 10000)) discount = 0.07f;
//        if(sum >= 10000) discount = 0.1f;
//        float sumDiscount = sum * (1 - discount);
//        System.out.println("Discount have " + (discount * 100) + " %\nSum + discount have " + sumDiscount);
//
//      int hour =9;
//      if((hour > 0) && (hour <=12)) {
//          System.out.println(hour + " до полудня");
//      } else  {
//          System.out.println(hour + " после полудня");}
/*    //Задача 1
        System.out.println("Я помню чудное мгновенье\n\nПерео мной явилась ты\n\nКак мимолетное видение\n\nКак гений чистой красоты!");
        System.out.println("********************");
        //Задача 2
             String s1 = "Java";
             String s2 = " - самый";
             String s3 = " лучший";
             String s4 = " язык";
             String s5 = " программирования";
        System.out.println(s1 + s2 + s3 + s4 + s5 + "!");
        System.out.println("*********************");
        // Задача 3
        int i = 1234;
        float f = 345.543f;
        char ch = 'z';
        boolean b = false;
        System.out.println(i + " " + f + " " + ch + " " + b);
        System.out.println("*********************");
        // Задача 4
        String x = "X";
        System.out.println(x + x +x +x +x);
        System.out.println(" " + x + x + x + " ");
        System.out.println("  " + x + "  ");
        System.out.println(" " + x + x + x + " ");
        System.out.println(x + x +x +x +x);
        System.out.println("*********************");
        // Задача 5
        float pi = 3.14f;
        int r = 10;
        float p = 2 * pi * r;
        System.out.println("Длина окружности с радиусом " + r + " равна " + p);
        System.out.println("*********************");
        // Задача 6
        int e = 5;
        int q = e * e;
        int q1 = e * e * e;
        System.out.println("Число " + e + "\nКвадрат числа " + q + "\nКуб числа " + q1);
        System.out.println("*********************");
        // Задача 7
        e = 7;
        String result;
        result = (e % 2 !=0) ? (e + " Нечетное") : (e + " Четное");
        System.out.println(result);
//        if (e % 2 != 0) {
//            System.out.println(e + " Нечетное");
//        } else {
//            System.out.println(e + " Четное");
//        }
        System.out.println("*********************");
        // Задача 8
        e = 1234;
        int sum = 1 + 2 + 3 + 4;
        sum++; sum++;
        System.out.println(sum);
        System.out.println("*********************");
        // Задача 9
        boolean w = true, n = false;
        if ((sum <= 15)) {
           System.out.println(w);
       } else {
           System.out.println(n);
        }
        System.out.println("*********************");*/
//        // Задача 10
//        int money = 150;
//        int bread = 50;
//        int ostatok = money - bread;
//        if (ostatok > 0 ) {
//        System.out.println("Купил хлеб и осталось " + ostatok + " rub");}
//        else if (ostatok == 0) {
//            System.out.println(" Денег ровно на хлеб");
//        } else {
//            System.out.println("Денег не хватает");}
//
//        // Задача 11
//        int a = 5678;
//        int a1, a2, a3, a4;
//        a1 = a / 1000 - (a % 1000) / 1000;
//        a %= 1000;
//        a2 = a / 100 - (a % 100) / 100;
//        a %= 100;
//        a3 = a / 10 - (a % 10) / 10;
//        a %= 10;
//        a4 = a;
//        int sum = a1+a2+a3+a4; sum++; sum++;
//        System.out.println(sum);
//        System.out.println((a1+a2)==(a3+a4));
//        boolean b = ((a1+a2+a3+a4) <=15);
//
//
//
//         int e = 10;
//         if ((e == 12) || (e == 1) && (e == 2) )  {System.out.println(e + " Winter");}
//         if ((e >= 3) && (e <= 5))  {System.out.println(e + " Spring");}
//         if ((e >=6) && (e <= 8))  {System.out.println(e + " Summer");}
//         if ((e >= 9) && (e <= 11)) {System.out.println(e + " Autumn");}

    int sum = 01;
    String sum_p = " ";
    int a1, a2, a3;
    a1 = sum/100;
    sum%=100;
    a2= sum/10;
    sum%=10;
    a3 =sum;
        if(a1==1)sum_p+=" сто";
        if(a1==2)sum_p+=" двести";
        if(a1==3)sum_p+=" триста";
        if(a1==4)sum_p+=" четыреста";
        if(a1==5)sum_p+=" пятьсот";
        if(a1==6)sum_p+=" шестьсот";
        if(a1==7)sum_p+=" семьсот";
        if(a1==8)sum_p+=" восемьсот";
        if(a1==9)sum_p+=" девятьсот";
    if (a2==1) {
        if(a3==0)sum_p+= " десять";
        if(a3==1)sum_p+= " одинадцать";
        if(a3==2)sum_p+= " двенадцать";
        if(a3==3)sum_p+= " тринадцать";
        if(a3==4)sum_p+= " четырнадцать";
        if(a3==5)sum_p+= " пятнадцать";
        if(a3==6)sum_p+= " шестнадцать";
        if(a3==7)sum_p+= " семьнадцать";
        if(a3==8)sum_p+= " восемьнацать";
        if(a3==9)sum_p+= " девятьнадцать";
    }

        if(a2==2)sum_p+=" двадцать";
        if(a2==3)sum_p+=" тридцать";
        if(a2==4)sum_p+=" сорок";
        if(a2==5)sum_p+=" пятьдесят";
        if(a2==6)sum_p+=" шестьдесят";
        if(a2==7)sum_p+=" семьдесят";
        if(a2==8)sum_p+=" восемьдесят";
        if(a2==9)sum_p+=" девяносто";
    if (a2 !=1) {
        if (a3 == 1) sum_p += " один";
        if (a3 == 2) sum_p += " два";
        if (a3 == 3) sum_p += " три";
        if (a3 == 4) sum_p += " четыре";
        if (a3 == 5) sum_p += " пять";
        if (a3 == 6) sum_p += " шесть";
        if (a3 == 7) sum_p += " семь";
        if (a3 == 8) sum_p += " восемь";
        if (a3 == 9) sum_p += " девять";
    }
    if ((a2!=1) && (a3==1)) sum_p+=" рубль";
    if((a3==2) || (a3 == 3) || (a3==4) && (a2!=1)) sum_p+=" рубля";
    if((a3!=1) && (a3!=2) && (a3!=3)&& (a3!=4) || (a2==1)) sum_p+=" рублей";
        System.out.println("Выдано" + sum_p);








    }
//    int a = 10, b = 20;
//    public static boolean hwTwo (int a, int b) {
//        return 10 < a + b && a + b >= 20;
//    }


}
