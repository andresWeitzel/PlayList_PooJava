package polimorfismo.metodos.parametrico;


public class Test {
	
	public static void main(String[] args) {

		//Aplicamos Polimorfirmo dinamico
		Persona cliente = new Cliente();
		Persona empleado = new Empleado();
		
		System.out.println(cliente.realizarUnaAccion("Comprar un Producto",2));
		System.out.println(empleado.realizarUnaAccion("Vender un Producto"));
		
		//Importante, en parametrizaci�n polimorfica y de sobrecarga deber�n estar 
		//definidos los m�todos en la clase padre, sino no se podr� ni aplicar 
		//sobrecarga ni parametrizacion con la herencia
	}

}
