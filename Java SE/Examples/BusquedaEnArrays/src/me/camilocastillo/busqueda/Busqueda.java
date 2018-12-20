package me.camilocastillo.busqueda;

public class Busqueda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// para arrays de una dimension
		char[] names= new char[4];
		
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		
		
		
		// para un array de varias dimensiones
		
		char[][] monkey = new char[2][3]; // filas , columnas
		monkey[1][2] = 'M';
		
		System.out.println(monkey[1][2]);
		
	}

}
