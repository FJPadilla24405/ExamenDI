package utils.login;

import modelos.Usuario;
import utils.ControladorMainScreen;

public class ControladorInicioSesión {
	
	public static boolean login(String email, String password) {
		boolean flag = false;
		
		for (Usuario usuario : ControladorMainScreen.usuarios) {
			if (usuario.getEmail().equals(email) && usuario.getPass().equals(password)) {
				flag = true;
			}
		}
		
		return flag;
	}

}
