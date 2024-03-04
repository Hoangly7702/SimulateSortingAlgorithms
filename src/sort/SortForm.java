package sort;

import java.util.logging.Level;
import java.util.logging.Logger;
import sortingalgorithms.QuickSort;
import sortingalgorithms.InsertionSort;
import sortingalgorithms.SelectionSort;
import sortingalgorithms.ShakerSort;
import sortingalgorithms.BubbleSort;
import sortingalgorithms.HeapSort;
import javax.swing.JOptionPane;

public class SortForm extends javax.swing.JFrame {

    private SelectionSort selectionSort;
    private InsertionSort insertionSort;
    private QuickSort quickSort;
    private HeapSort heapSort;
    private BubbleSort bubbleSort;
    private ShakerSort shakeSort;

    private SortArea sortArea;
//    int num;

    public SortForm() {
        initComponents();
        setLocationRelativeTo(null);

//        sa = new SortArea(panel,num);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelborder = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Number_label = new javax.swing.JLabel();
        Number = new javax.swing.JTextField();
        Random = new javax.swing.JButton();
        listAlgorithm = new javax.swing.JComboBox<>();
        algorithm = new javax.swing.JLabel();
        Simulation = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mô phỏng thuật toán sắp xếp");

        panelborder.setBackground(new java.awt.Color(255, 255, 255));
        panelborder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        panelborder.setForeground(new java.awt.Color(153, 153, 153));
        panelborder.setPreferredSize(new java.awt.Dimension(420, 300));

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelborderLayout = new javax.swing.GroupLayout(panelborder);
        panelborder.setLayout(panelborderLayout);
        panelborderLayout.setHorizontalGroup(
            panelborderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelborderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelborderLayout.setVerticalGroup(
            panelborderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelborderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Title.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Title.setText("MÔ PHỎNG CÁC THUẬT TOÁN SẮP XẾP");

        Number_label.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Number_label.setText("Nhập số lượng phần tử");

        Number.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberActionPerformed(evt);
            }
        });

        Random.setBackground(new java.awt.Color(153, 153, 255));
        Random.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Random.setForeground(new java.awt.Color(255, 255, 255));
        Random.setText("Random");
        Random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandomActionPerformed(evt);
            }
        });

        listAlgorithm.setBackground(new java.awt.Color(204, 204, 255));
        listAlgorithm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        listAlgorithm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Sort", "Insertion Sort", "Bubble Sort", "Quick Sort", "Heap Sort", "Shaker Sort" }));
        listAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAlgorithmActionPerformed(evt);
            }
        });

        algorithm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        algorithm.setText("Chọn thuật toán");

        Simulation.setBackground(new java.awt.Color(153, 153, 255));
        Simulation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Simulation.setForeground(new java.awt.Color(255, 255, 255));
        Simulation.setText("MÔ PHỎNG");
        Simulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulationActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(153, 153, 255));
        reset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Thời gian mô phỏng:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("giây");

        time.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        time.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Simulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Number_label)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Random))
                    .addComponent(listAlgorithm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(algorithm)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(panelborder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Number_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Random, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(algorithm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Simulation)
                        .addGap(18, 18, 18)
                        .addComponent(reset)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(time))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelborder, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int timer;
    private void RandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandomActionPerformed
        timer = 0;
        time.setText(""+timer);
                
        String temp = Number.getText();

        if (temp.isEmpty() || temp.matches(".*[^0-9].*")) {
            JOptionPane.showMessageDialog(null, 
                    "Số lượng phần tử phải là số nguyên dương lớn hơn 1 và nhỏ hơn 21", 
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int number = Integer.parseInt(temp);
            if (number >= 2 && number <= 20) {
                if (sortArea != null) {
                    sortArea.updateArraySize(number);
//            sortArea.repaint();
                } else {
                    sortArea = new SortArea(panelborder, number);
                    this.add(sortArea);

                }
                Random.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Số lượng phần tử phải là số nguyên dương lớn hơn 1 và nhỏ hơn 21", 
                        "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_RandomActionPerformed

    private void listAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAlgorithmActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_listAlgorithmActionPerformed

    private void SimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulationActionPerformed
        String selectedAlgorithm = listAlgorithm.getSelectedItem().toString();
        
        
        if (Random.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Vui lòng tạo Random mảng giá trị ");
        } else {
            if (selectedAlgorithm.equals("Selection Sort")) {
                Thread sortThread = new Thread(() -> {
//                sortArea.SelectionSort();
                    selectionSort = new SelectionSort(sortArea);
                    selectionSort.sort();
                });
                sortThread.start();
            }
            if (selectedAlgorithm.equals("Insertion Sort")) {
                Thread sortThread = new Thread(() -> {
//                sortArea.InsertionSort();
                    insertionSort = new InsertionSort(sortArea);
                    insertionSort.sort();
                });
                sortThread.start();
            }
            if (selectedAlgorithm.equals("Bubble Sort")) {
                Thread sortThread = new Thread(() -> {
//                sortArea.BubbleSort();
                    bubbleSort = new BubbleSort(sortArea);
                    bubbleSort.sort();
                });
                sortThread.start();
            }
            if (selectedAlgorithm.equals("Quick Sort")) {
                Thread sortThread = new Thread(() -> {
//                sortArea.QuickSort();
                    quickSort = new QuickSort(sortArea);
                    quickSort.sort();
                });
                sortThread.start();
            }
            if (selectedAlgorithm.equals("Heap Sort")) {
                Thread sortThread = new Thread(() -> {
//                sortArea.HeapSort();
                    heapSort = new HeapSort(sortArea);
                    heapSort.sort();
                });
                sortThread.start();
            }
            if (selectedAlgorithm.equals("Shaker Sort")) {
                Thread sortThread = new Thread(() -> {
//                sortArea.ShakerSort();
                    shakeSort = new ShakerSort(sortArea);
                    shakeSort.sort();
                });
                sortThread.start();
            }      
            timeRunning();
        }
    }//GEN-LAST:event_SimulationActionPerformed
    
    private Thread timerThread;
    public boolean isTimerRunning = true;
    public void timeRunning() {
//        isTimerRunning = true;
        timerThread = new Thread(() -> {
            while (isTimerRunning && !sortArea.sortingCompleted) {
                try {
                    Thread.sleep(1000);
                    timer++;
                    time.setText("" + timer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        timerThread.start();

    }

    private void NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        sortArea.resetpanel();
        Random.setEnabled(true);
        time.setText("0");
        Number.setText("");

    }//GEN-LAST:event_resetActionPerformed
    public void sortingCompleted() {
        JOptionPane.showMessageDialog(this, "Đã thực hiện sắp xếp xong!!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Number;
    private javax.swing.JLabel Number_label;
    private javax.swing.JButton Random;
    private javax.swing.JButton Simulation;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel algorithm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> listAlgorithm;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelborder;
    private javax.swing.JButton reset;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
