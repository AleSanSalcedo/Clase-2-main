package ar.com.unpaz.service;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputWindow {
	public static String showInputWindow() {
	        // Crear una ventana JFrame
	        JFrame window = new JFrame("Buscar");
	        
	        // Mostrar un cuadro de diálogo para recibir la entrada del teclado
	        String input = JOptionPane.showInputDialog(window, "Escriba el nombre o apellido del cliente buscado");
	        
	        // Imprimir la entrada recibida en la consola
	        
	        // Cerrar la ventana
	        window.dispose();
	        
	        return input;
	    
	}
}
