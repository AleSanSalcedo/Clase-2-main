package ar.com.unpaz.service;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    JButton button1, button2, button3;

    public Menu() {
        setTitle("Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear botones para cada opción del menú
        button1 = new JButton("Opción 1");
        button2 = new JButton("Opción 2");
        button3 = new JButton("Opción 3");

        // Agregar un ActionListener a cada botón
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        // Crear un panel para el menú
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Agregar el panel al marco principal
        getContentPane().add(panel);
        
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        // Establecer el tamaño del marco y mostrarlo en la pantalla
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Determinar cuál botón fue presionado y ejecutar la acción correspondiente
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(this, "Ha seleccionado la opción 1");
        } else if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(this, "Ha seleccionado la opción 2");
        } else if (e.getSource() == button3) {
            JOptionPane.showMessageDialog(this, "Ha seleccionado la opción 3");
        }
    }
}
