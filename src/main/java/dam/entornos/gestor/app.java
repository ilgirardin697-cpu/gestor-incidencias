package dam.entornos.gestor;

import org.apache.commons.lang3.StringUtils;

public class app {

	public static void main(String[] args) {

		String incidencia = "pantalla negra";

		String titulo = StringUtils.capitalize(incidencia);

		String estado = "PENDIENTE";

		System.out.println(titulo);

		System.out.println("versión de desarrollo");

		System.out.println("Estado: " + estado);

	}

}