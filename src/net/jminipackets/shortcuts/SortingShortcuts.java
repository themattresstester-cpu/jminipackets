package net.jminipackets.shortcuts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingShortcuts {
    public static int[] bubbleSort(int[] arr) {
        int[] result = arr.clone();
        int n = result.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }
    public static int[] quickSort(int[] arr) {
        int[] result = arr.clone();
        quickSortHelper(result, 0, result.length - 1);
        return result;
    }
    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static int[] selectionSort(int[] arr) {
        int[] result = arr.clone();
        int n = result.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = result[minIndex];
            result[minIndex] = result[i];
            result[i] = temp;
        }
        return result;
    }
    public static int[] insertionSort(int[] arr) {
        int[] result = arr.clone();
        int n = result.length;
        for (int i = 1; i < n; i++) {
            int key = result[i];
            int j = i - 1;
            while (j >= 0 && result[j] > key) {
                result[j + 1] = result[j];
                j--;
            }
            result[j + 1] = key;
        }
        return result;
    }
    public static int[] bucketSort(int[] arr) {
        if (arr.length == 0) return arr.clone();

        int[] result = arr.clone();

        int max = result[0];
        for (int num : result) {
            if (num > max) max = num;
        }

        int bucketCount = max / 10 + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        for (int num : result) {
            int bucketIndex = num / 10;
            buckets.get(bucketIndex).add(num);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                result[index++] = num;
            }
        }
        return result;
    }
}
