package utils.login;

import java.util.ArrayList;
import java.util.List;

import modelos.Tratamiento;
import modelos.Usuario;
import utils.ControladorMainScreen;

/**
 * Clase controladora de la pantalla de registro
 * @author Padilla
 */
public class ControladorRegistro {
	
	/**
	 * Metodo que registra un nuevo usuario con los datos que se le pasen
	 * @param nombre Nombre del usuario
	 * @param apellidos Apellidos de lusuario
	 * @param email Email del usuario
	 * @param password Contraseña del usuario
	 */
	public static void registrar(String nombre, String apellidos, String email, String password) {
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellidos(apellidos);
		usuario.setEmail(email);
		usuario.setPass(password);
		List<Tratamiento> tratamientos = new ArrayList<>();
		usuario.setMisTratamientos(tratamientos);
		ControladorMainScreen.usuarios.add(usuario);
	}
}
