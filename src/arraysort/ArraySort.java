/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;

import java.lang.*;
import java.util.Arrays;

/**
 *
 * @author MEGATRON2
 */
public class ArraySort {

    static int[] sortArrayMinFor(int[] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }

            }
            if (i != index) {
                a = arr[i];
                arr[i] = min;
                arr[index] = a;
            }
        }

        return arr;
    }

    static int[] sortArrayMaxFor(int[] arr) {
        int a;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }

            }
            if (i != index) {
                a = arr[i];
                arr[i] = max;
                arr[index] = a;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{34, 23, 35, 43, 52};
        sortArrayMinFor(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        sortArrayMaxFor(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
        int[] arr1 = new int[]{33, 23, 334, 433, 552};
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println(" ");

    }

}
