
package sortingalgorithms;

import sort.SortArea;


public class SelectionSort {
    SortArea sortArea;
    public SelectionSort(SortArea sortArea){
        this.sortArea = sortArea;
    }


    public void sort() {
        int n = sortArea.getArray().length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sortArea.getArray()[j] < sortArea.getArray()[minIndex]) {
                    minIndex = j;
                }
            }
            sortArea.delayAndRepaint();
            sortArea.swap(minIndex, i);
            
            
        }
        sortArea.sortingCompleted();
    }
}
