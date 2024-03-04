
package sortingalgorithms;

import sort.SortArea;


public class HeapSort {
    
    SortArea sortArea;
    
    public HeapSort(SortArea sortArea){
        this.sortArea = sortArea;
    }
    
    public void sort() {
        int n = sortArea.getArraySize();
        // Xây dựng heap tối ưu (max heap)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }
        // Trích xuất các phần tử từ heap một cách lần lượt
        for (int j = n - 1; j > 0; j--) {
            // Di chuyển phần tử root (lớn nhất) đến cuối mảng
            sortArea.swap(0, j);
            sortArea.delayAndRepaint();

            // Tạo lại heap tối ưu cho phần mảng chưa sắp xếp
            heapify(j, 0);
        }
//        sortArea.markSortingCompleted();
        sortArea.sortingCompleted();
    }

    private void heapify(int n, int i) {
        int largest = i;    // Khởi tạo largest như là root
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        // So sánh left child với root
        if (left < n && sortArea.getArray()[left] > sortArea.getArray()[largest]) {
            largest = left;
        }
        // So sánh right child với root hoặc left child (nếu đã được thay đổi)
        if (right < n && sortArea.getArray()[right] > sortArea.getArray()[largest]) {
            largest = right;
        }
        // Nếu root không còn là largest
        if (largest != i) {
            sortArea.swap(i, largest);
            sortArea.delayAndRepaint();
            // Tạo lại heap tối ưu cho phần mảng đã thay đổi
            heapify(n, largest);
        }
    }
}
