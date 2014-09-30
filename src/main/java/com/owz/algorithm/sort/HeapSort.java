/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.owz.algorithm.sort;

import java.util.Collections;
import java.util.List;

/**
 * @author kongtong.ouyang created on 2014/9/30, 12:32
 * @version $Id$
 */
public class HeapSort {

    public static <E extends Comparable<? super E>> void buildMaxHeap(List<E> list) {
        int startIndex = getParentIndex(list.size() - 1);
        for (int i = startIndex; i > 0; i--) {
            maxHeap(list, list.size(), i);
        }
    }

    public static <E extends Comparable<? super E>> void maxHeap(List<E> list, int heapSize, int index) {
        int leftIndex = getChildLeftIndex(index);
        int rightIndex = getChildRightIndex(index);
        int largest = index;
        if (leftIndex < heapSize && list.get(largest).compareTo(list.get(leftIndex)) < 0) {
            largest = leftIndex;
        }
        if (rightIndex < heapSize && list.get(largest).compareTo(list.get(rightIndex)) < 0) {
            largest = rightIndex;
        }

        if (largest != index) {
            Collections.swap(list, index, largest);
            maxHeap(list, heapSize, largest);
        }
    }

    public static <E extends Comparable<? super E>> void headpSort(List<E> list) {
        for (int i = list.size(); i > 0; i--) {
            Collections.swap(list, i, 0);
            maxHeap(list, i, 0);
        }
    }

    public static int getParentIndex(int current) {
        return (current - 1) >> 1;
    }

    public static int getChildLeftIndex(int current) {
        return (current << 1) + 1;
    }

    public static int getChildRightIndex(int current) {
        return (current << 1) + 2;
    }


}
