package utils.login;

import modelos.Usuario;
import utils.ControladorMainScreen;

/**
 * Clase controladora de la pantalla de inicio de sesion
 * @author Padilla
 */
public class ControladorInicioSesion {
	
	/**
	 * Metodo que comprueba si el email y la contraseña coinciden con los datos de algun usuario
	 * @param email Email de usuario
	 * @param password Contraseña de usuario
	 * @return True si existe un usuario con estas caracteristicas, False si no
	 */
	public static boolean login(String email, String password) {
		boolean flag = false;
		
		for (Usuario usuario : ControladorMainScreen.usuarios) {
			if (usuario.getEmail().equals(email) && usuario.getPass().equals(password)) {
				flag = true;
				ControladorMainScreen.currentUser = usuario;
			}
		}
		
		return flag;
	}

}
