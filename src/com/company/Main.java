package com.company;

import java.util.*;

public class Main {

    //Сортировка выбором (Selection sort)

    public static void selectionSort(int[] arr){
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }

    //Сортировка пузырьком (Bubble sort)

    public static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                }
            }
        }
    }

    static void prtl(int[] arr){
        System.out.println("-------");
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void prtl(String[] arr){
        System.out.println("-------");
        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {3,4,5,1,2};
        int[] arr2 = {3,4,5,1,2};
        int[] arr3 = {3,4,5,1,2};
        boolean[] barr = {true,false};
        double db[]={4.24,5.56};
        int[][] iarr = {{5,6},{0,3}};
        int[] iarr2 [] = {{5,6},{0,3}};
        int[] iarr3= new int[10];

        int[][] a1=new int[3][];// не равномерный массив
        a1[0] = new int[1]; // []
        a1[1] = new int[2]; // [][]
        a1[2] = new int[3]; // [][][]

        System.out.println("Начальный массив");
        prtl(arr);
        System.out.println("Обычная, стандартная сортировка");
        Arrays.sort(arr);
        prtl(arr);
        System.out.println("Сортировка выборкой");
        selectionSort(arr2);
        prtl(arr2);
        System.out.println("Пузырьковая");
        bubbleSort(arr3);
        prtl(arr3);

        //Строки
        String s1="I have ";
        String s2="apple";
        String s= s1+s2;
        int i=s.length();

        String s4 = s.substring(2,s.length()-2); //"have app" обрезка
        System.out.println(s4);

        String isbn = "8-800-555-3555";
        String[] isp=isbn.split(".");
        prtl(isp);// 8 800 555 3555


        // массив символов
        char[] ch = s.toCharArray();

    }
}
