package sort;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SortArea extends JPanel {

    private final int timeDelay = 500;
    
    private final int jpanelWidth;
    private final int jpanelHeight;
    private SortForm sf;
    private int arraySize;
    private int[] array;
    public boolean sortingCompleted = false;
    private Color[] initialColors;

    public SortArea(JPanel panel, int array_size) {
        panel.setVisible(false);
        this.setBounds(panel.getBounds());
        this.setBackground(panel.getBackground());
        this.setBorder(panel.getBorder());

        jpanelWidth = this.getBounds().width;
        jpanelHeight = this.getBounds().height;
        arraySize = array_size;

        randomArray(arraySize);
    }

    public void randomArray(int n) {
        sortingCompleted = false;
        array = new int[n];
        initialColors = new Color[n];

        for (int i = 0; i < n; i++) {
            Random rand = new Random();
            int ranNum = rand.nextInt(99) + 1;
            array[i] = ranNum;
            initialColors[i] = getRandomColor();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }

    public void updateArraySize(int newSize) {
        arraySize = newSize;
        randomArray(arraySize);
        repaint();
    }

    public void setArray(int[] newArray) {
        array = newArray;
        repaint();
    }

    private Color getRandomColor() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        return new Color(r, g, b);
    }

    public void drawArray(Graphics g) {
        int barWidth = jpanelWidth / arraySize;
        int maxHeight = jpanelHeight - 30;

        for (int i = 0; i < arraySize; i++) {
            int barHeight = (int) ((double) array[i] * (maxHeight) / getMaxValue());
            int x = i * barWidth;
            int y = jpanelHeight - barHeight - 1;

            g.setColor(initialColors[i]);
            g.fillRect(x, y, barWidth, barHeight);
            // Vẽ chỉ số
            // Thiết lập màu cho chỉ số
            g.setColor(Color.BLACK); 
            // Thiết lập font và kích thước của chỉ số
            g.setFont(new Font("Times New Roman", Font.BOLD, 16)); 

            // Tính toán vị trí đúng cho chỉ số
            FontMetrics fm = g.getFontMetrics();
            int stringWidth = fm.stringWidth(Integer.toString(array[i]));
            int a = x + (barWidth - stringWidth) / 2; // Tính toán vị trí ngang
            //int b = y + barHeight / 2 + fm.getAscent() / 2; // Tính toán vị trí dọc
            g.drawString(Integer.toString(array[i]), a, y - 5);
        }
    }

    public void printArray() {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
    }

    private int getMaxValue() {
        int max = array[0];
        for (int i = 0; i < arraySize; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

//    public void markSortingCompleted() {
//        sortingCompleted = true;
//        repaint();
//    }
    public void swapColor(int i, int j) {
        Color temp = initialColors[i];
        initialColors[i] = initialColors[j];
        initialColors[j] = temp;
    }

    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        swapColor(i, j);
    }

    public void sortingCompleted() {
        sortingCompleted = true;
        JOptionPane.showMessageDialog(this, "Đã thực hiện sắp xếp xong!!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
        
    }

    
    
    public void resetpanel() {
        Graphics g = getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(1, 1, jpanelWidth - 2, jpanelHeight - 2);

    }

    public void delayAndRepaint() {
        try {
            Thread.sleep(timeDelay);
            repaint();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawArray(g);

    }

    public int[] getArray() {
        return this.array;
    }

    public int getArraySize() {
        return this.arraySize;
    }
}
