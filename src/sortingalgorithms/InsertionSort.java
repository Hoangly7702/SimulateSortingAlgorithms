
package sortingalgorithms;

import sort.SortArea;


public class InsertionSort {
    SortArea sortArea;
    public InsertionSort(SortArea sortArea){
        this.sortArea = sortArea;
    }
   
        

    public void sort() {
        for (int i = 1; i < sortArea.getArraySize(); i++) {
            int key = sortArea.getArray()[i];
            int j = i - 1;
            while (j >= 0 && sortArea.getArray()[j] > key) {
//                sortArea.getArray()[j + 1] = sortArea.getArray()[j];
                
                sortArea.swap(j + 1,j);
                
                j = j - 1;
            }
            sortArea.delayAndRepaint();
            sortArea.getArray()[j + 1] = key;
            
        }
//        sortArea.markSortingCompleted();
        sortArea.sortingCompleted();
    }
}
