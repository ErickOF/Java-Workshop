package gui;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JButton btnHello;
    public MainWindow() {
        this.setTitle("Ventana");
        this.setSize(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.btnHello = new JButton("Hello");
        this.getContentPane().add(btnHello);
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }
}
