package com.cursoceat.main;

public class Main {

	public static void main(String[] args) {
		
		Empleado yoEmpleado = new Empleado("Javi", (byte) 50, 1.75, 1000);
		yoEmpleado.mostrarDatos();  // Método de la clase hija
		Persona yoPersona = new Persona("Irina", (byte) 51, 1.65);
		yoPersona.mostrarDatos();  // Método de la clase padre
	}

}
