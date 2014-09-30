/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.algorithm.sort;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

/**
 * 归并排序
 *
 * @author kongtong.ouyang created on 2014/9/30, 15:49
 * @version $Id$
 */
public class MergeSort {

    public static <E extends Comparable<? super E>> List<E> mergeSort(List<E> list) {
        if (list.size() <= 1) {
            return list;
        }
        int half = list.size() / 2;
        List<E> data1 = new ArrayList<E>(half);
        List<E> data2 = new ArrayList<E>(list.size() - half);
        System.arraycopy(list, 0, data1, 0, data1.size());
        System.arraycopy(list, 0, data2, 0, data1.size());
        data1 = mergeSort(data1);
        data2 = mergeSort(data2);
        return mergeSubSort(data1, data2);
    }

    public static <E extends Comparable<? super E>> List<E> mergeSubSort(List<E> data1, List<E> data2) {
        int i = 0, j = 0, k = 0;
        List<E> result = new ArrayList<E>(data1.size() + data2.size());
        while (i < data1.size() && j < data2.size()) {
            if (data1.get(i).compareTo(data2.get(j)) < 0) {
                result.set(k++, data1.get(i++));
            } else {
                result.set(k++, data2.get(j++));
            }
        }

        while (i < data1.size()) {
            result.set(k++, data1.get(i++));
        }
        while (j < data2.size()) {
            result.set(k++, data2.get(j++));
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
