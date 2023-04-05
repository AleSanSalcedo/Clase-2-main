package ar.com.unpaz.service;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    JButton button1, button2, button3;

    public Menu() {
        setTitle("Men�");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear botones para cada opci�n del men�
        button1 = new JButton("Opci�n 1");
        button2 = new JButton("Opci�n 2");
        button3 = new JButton("Opci�n 3");

        // Agregar un ActionListener a cada bot�n
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Crear un panel para el men�
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Agregar el panel al marco principal
        getContentPane().add(panel);
        
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        // Establecer el tama�o del marco y mostrarlo en la pantalla
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Determinar cu�l bot�n fue presionado y ejecutar la acci�n correspondiente
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(this, "Ha seleccionado la opci�n 1");
        } else if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(this, "Ha seleccionado la opci�n 2");
        } else if (e.getSource() == button3) {
            JOptionPane.showMessageDialog(this, "Ha seleccionado la opci�n 3");
        }
    }
}
