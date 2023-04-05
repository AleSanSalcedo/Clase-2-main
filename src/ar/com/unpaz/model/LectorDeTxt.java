package ar.com.unpaz.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.unpaz.repository.Cliente;

public class LectorDeTxt {
	//lee el archivo txt. Tgieme que recibir el path
	public static ArrayList<Cliente> leer(String path) {
		//String path = "D:\\Proyectos Java\\Clase 2\\clientes.txt"; // ruta del archivo CSV
		//Creo una lista de clientes para agregarlos al ir leyendo el archivo
		List <Cliente> clientes = new ArrayList<>();
		
	    try (BufferedReader archive = new BufferedReader(new FileReader(path))) {
	        String line;

	        while ((line = archive.readLine()) != null) {
	        	//Separo los datos del txt por ; y los voy agregando a un arreglo de string
	            String[] data = line.split(";");
	            int id = Integer.parseInt(data[0]);
	            SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyy");
	            Date fecha = format.parse(data[3]);
	            Cliente aux = new Cliente (id, data[1], data[2], fecha);
	            clientes.add(aux);
	        }
	    } catch (IOException e) {
	        System.out.println("Error al leer el archivo CSV: " + e.getMessage());
	    } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (ArrayList<Cliente>) clientes;
		
	}
}
