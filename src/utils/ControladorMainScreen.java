package utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelos.Medicamento;
import modelos.TipoMedicamento;
import modelos.Tratamiento;
import modelos.Usuario;

/**
 * Clase controladora de la pantalla principal
 * @author Padilla
 */
public class ControladorMainScreen {
	
	/**
	* Lista de usuarios de la aplicacion
	*/
	public static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	/**
	 * Lista de medicamento de la aplicacion
	 */
	public static ArrayList<Medicamento> medicamentos = new ArrayList<>();
	
	/**
	 * Usuario que se ha logeado y esta usando la aplicacion
	 */
	public static Usuario currentUser;
	
	private static List<Tratamiento> tratamientos = new ArrayList<>();
	
	/**
	 * Inicializa las listas de usuarios y medicamentos con datos
	 */
	@SuppressWarnings("deprecation")
	public static void inicializarArrayLists() {
		
		for(int i = 0; i < 4; i++) {
			Medicamento medicamento = new Medicamento("Medicamento"+i, "Laboratorio"+i, TipoMedicamento.values()[i], "Descripcion"+i);
			medicamentos.add(medicamento);
			Tratamiento tratamiento = new Tratamiento();
			tratamiento.setMedicamento(medicamentos.get(i));
			tratamiento.setFechaInicio(new Date(2025, 10, i));
			tratamiento.setFechaFin(new Date(2025, 11, i*2));
			tratamiento.setComprimidos(i*2);
			tratamiento.setHoras(i*3);
			tratamientos = new ArrayList<>();
			tratamientos.add(tratamiento);
			Usuario usuario = new Usuario();
			usuario.setNombre("Nombre"+i);
			usuario.setApellidos("Apellidos"+i);
			usuario.setEmail("usuario"+i+"@gmail.com");
			usuario.setPass("usuario"+i);
			usuario.setMisTratamientos(tratamientos);
			usuarios.add(usuario);
		}
	}
}
