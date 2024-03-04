
package sortingalgorithms;

import sort.SortArea;


public class BubbleSort {
    SortArea sortArea;
    public BubbleSort(SortArea sortArea){
        this.sortArea = sortArea;
    }
   
    public void sort() {
        int n = sortArea.getArray().length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortArea.getArray()[j] > sortArea.getArray()[j + 1]) {
                    sortArea.delayAndRepaint();
                    sortArea.swap(j, j + 1);

//                    sortArea.printArray();
                }
            }
        }
//        sortArea.markSortingCompleted();
        sortArea.sortingCompleted();
    }
}
