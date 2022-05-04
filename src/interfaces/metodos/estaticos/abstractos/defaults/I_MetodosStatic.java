package interfaces.metodos.estaticos.abstractos.defaults;

public interface I_MetodosStatic {
	
	/*
	 * 
	 * == FUNCI�N PRINCIPAL METODOS ABSTRACTOS== El prop�sito de un m�todo abstracto
	 * es dejar que las clases que heredan de �stas puedan implementar un m�todo de
	 * diferentes maneras. Este mecanismo es fundamental para hacer uso del
	 * polimorfismo, uno de los conceptos principales de la programaci�n orientada a
	 * objetos, as� como la mayor�a de patrones de dise�o m�s usados.
	 * 
	 * 
	*/
	// ==========STATIC==========
		// --STATIC VOID--
		public static void accion_05_00() {
			System.out.println("static accion_05_00");
		};
		

		static void accion_05_01() {
			System.out.println("static accion_05_01");
		};

		// --STATIC STRING, BOOLEAN, ETC--
		public static String accion_06_00() {
			return "static accion_06_00";
		};

		static String accion_06_01() {
			return "static accion_06_01";
		};

}
