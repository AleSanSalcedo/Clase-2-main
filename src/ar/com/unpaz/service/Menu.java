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
        button1 = new JButton("Buscar un cliente Por nombre  o nombre y apellido");
        button2 = new JButton("Opción 2");

        // Agregar un ActionListener a cada botón
        button1.addActionListener(this);
        button2.addActionListener(this);

        // Crear un panel para el menú
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(button1);
        panel.add(button2);

        // Agregar el panel al marco principal
        getContentPane().add(panel);
        
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        // Establecer el tamaño del marco y mostrarlo en la pantalla
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Determinar cuál botón fue presionado y ejecutar la acción correspondiente
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(this, "Esto no esta listo");
        } else if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(this, "Ha seleccionado la opción 2");
        }
    }
}
