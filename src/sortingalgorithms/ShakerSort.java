package sortingalgorithms;

import sort.SortArea;

public class ShakerSort {
    SortArea sortArea;
    public ShakerSort(SortArea sortArea) {
        this.sortArea = sortArea;
    }

    public void sort() {
        int n = sortArea.getArray().length;
        int i, k, left, right;
        k = 0;
        left = 0;
        right = n - 1;
        while (left < right) {
            for (i = right; i > left; i--) {
                if (sortArea.getArray()[i] < sortArea.getArray()[i - 1]) {
                    sortArea.swap(i, i - 1); // Hoan vi a[i], a[i - 1]
                    k = i; // Dung bien k danh dau de bo qua doan da co thu tu.
                }
                sortArea.delayAndRepaint();
            }
            left = k;
            for (i = left; i < right; i++) {
                if (sortArea.getArray()[i] > sortArea.getArray()[i + 1]) {
                    sortArea.swap(i, i + 1);
                    k = i;
                }
                sortArea.delayAndRepaint();
            }
            right = k;
        }
        sortArea.sortingCompleted();
    }
}
