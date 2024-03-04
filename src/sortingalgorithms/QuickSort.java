
package sortingalgorithms;

import sort.SortArea;

public class QuickSort {    
    SortArea sortArea;    
    public QuickSort(SortArea sortArea){
        this.sortArea = sortArea;
    }
    public void sort() {
        quickSort(0, sortArea.getArraySize() - 1);
        sortArea.sortingCompleted();
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = sortArea.getArray()[high]; // Chọn pivot là phần tử cuối cùng của mảng
        int i = low - 1; // Vị trí của phần tử nhỏ hơn pivot

        for (int j = low; j <= high - 1; j++) {
            if (sortArea.getArray()[j] < pivot) {
                i++;
                sortArea.swap(i, j);
                sortArea.delayAndRepaint();
            }     
        }
        sortArea.swap(i + 1, high); // Hoán đổi pivot vào vị trí đúng của nó
        sortArea.delayAndRepaint();
        return i + 1;
    }
}
