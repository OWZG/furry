/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.algorithm.sort;

import java.util.Collections;
import java.util.List;

/**
 * @author kongtong.ouyang created on 2014/9/30, 12:13
 * @version $Id$
 */
public class InsertionSort {

    public static <E extends Comparable<? super E>> void insertionSort(List<E> list) {

        for (int i = 1; i < list.size(); i++) {
            for (int j = i; j >= 1 && list.get(j).compareTo(list.get(j - 1)) < 0; j--) {
                Collections.swap(list, j, j - 1);
            }
        }
    }
}
