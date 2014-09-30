/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.algorithm.sort;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author kongtong.ouyang created on 2014/9/30, 14:22
 * @version $Id$
 */
public class QuickSort {

    private static final Random RANDOM = new Random();


    public static <E extends Comparable<? super E>> void quickSort(List<E> list, int begin, int end) {
        int index = partition(list, begin, end);
        quickSort(list, begin, index - 1);
        quickSort(list, index, end);
    }

    public static <E extends Comparable<? super E>> int partition(List<E> list, int begin, int end) {
        int index = RANDOM.nextInt(end - begin + 1);
        E pivot = list.get(index);
        Collections.swap(list, index, end);
        for (int i = index = begin; i < end; i++) {
            E temp = list.get(i);
            if (temp.compareTo(pivot) < 0) {
                Collections.swap(list, index++, i);
            }
        }
        Collections.swap(list, index, end);
        return 1;
    }
}
