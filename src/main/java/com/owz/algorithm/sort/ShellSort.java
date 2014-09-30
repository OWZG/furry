/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.algorithm.sort;

import java.util.Collections;
import java.util.List;

/**
 * 希尔排序
 *
 * @author kongtong.ouyang created on 2014/9/30, 11:40
 * @version $Id$
 */
public class ShellSort {


    public static <E extends Comparable<? super E>> void shellSort(List<E> list) {
        int h = 1;
        while (h < list.size() / 3) {
            h = h * 3 + 1;
        }

        for (; h >= 1; h /= 3) {
            for (int i = h; i < list.size(); i++) {
                for (int j = i; j >= h && list.get(j).compareTo(list.get(j - h)) < 0; j -= h) {
                    Collections.swap(list, j, j - h);
                }
            }
        }
    }

}
