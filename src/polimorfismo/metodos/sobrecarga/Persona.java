package polimorfismo.metodos.sobrecarga;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

	long id;
	String nombre;
	String apellido;
	String nroCuenta;
	double saldo;
	
	public String realizarAccion01(String accion) {
		return "La acci�n que realiza la persona es "+accion+" !!";
	}
	
	public String realizarAccion02(String accion, int cantidad) {
		return "La acci�n que realiza la persona es "+accion
				+", un n�mero de " +cantidad+" veces !!";
	}
	
	

}
