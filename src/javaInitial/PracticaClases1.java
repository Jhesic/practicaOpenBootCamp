package javaInitial;

public class PracticaClases1 {
	public static void main(String[] args) {
		
		int miSuma = suma(1, 2, 3);
		
		System.out.println("Resultado de mi suma: "+ miSuma);		
		
		Coche miCoche = new Coche();
		
		miCoche.addPuerta();
		
		System.out.println("Cantidad de puertas de mi coche: " + miCoche.getPuertas());		
		
	}
	
	
	public static int suma(int a, int b, int c) {

		return (a+b+c);
	}

	
}

class Coche {
	
	public Coche () {
		
	}
	
	public Coche(int puertas) {
		this.puertas = puertas;
	}
	
	
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public void addPuerta() {
		this.puertas ++;
	}


	private int puertas = 0;
	
	}