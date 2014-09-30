/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.algorithm.sort;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 归并排序
 *
 * @author kongtong.ouyang created on 2014/9/30, 15:49
 * @version $Id$
 */
public class MergeSort {

    public static <E extends Comparable<? super E>> void mergeSort(List<E> list) {
        int half = list.size() / 2;
        List data1 = new ArrayList<E>(half);
        List data2 = new ArrayList<E>(list.size() - half);
        System.arraycopy(list, 0, data1, 0, data1.size());
        System.arraycopy(list, 0, data2, 0, data1.size());
    }

    public static void main(String[] args) {

    }
}
