package com.cursoceat.main;

public class Main {

	public static void main(String[] args) {
		
		Empleado yoEmpleado = new Empleado("Javi", (byte) 50, 1.75, 1000);
		System.out.println("Nombre: " + yoEmpleado.getNombre());
		System.out.println("Edad: " + yoEmpleado.getEdad());
		System.out.println("Estatura: " + yoEmpleado.getEstatura());
		System.out.println("Salario: " + yoEmpleado.getSalario());
	}

}
