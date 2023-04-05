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
        button1 = new JButton("Buscar un cliente Por nombre  o nombre y apellido");
        button2 = new JButton("Opci�n 2");

        // Agregar un ActionListener a cada bot�n
        button1.addActionListener(this);
        button2.addActionListener(this);

        // Crear un panel para el men�
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(button1);
        panel.add(button2);

        // Agregar el panel al marco principal
        getContentPane().add(panel);
        
        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);

        // Establecer el tama�o del marco y mostrarlo en la pantalla
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Determinar cu�l bot�n fue presionado y ejecutar la acci�n correspondiente
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(this, "Esto no esta listo");
        } else if (e.getSource() == button2) {
            JOptionPane.showMessageDialog(this, "Ha seleccionado la opci�n 2");
        }
    }
}
