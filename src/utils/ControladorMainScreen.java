package utils;

import java.util.ArrayList;

import javax.swing.JPanel;

import modelos.Medicamento;
import modelos.Usuario;

public class ControladorMainScreen {
	
	public static ArrayList<Usuario> usuarios = new ArrayList<>();
	public static ArrayList<Medicamento> medicamentos = new ArrayList<>();
	
	public static void colorBase(JPanel panel) {
		panel.setBackground(new java.awt.Color(240, 230, 140));
	}
	
	public static void colorFocus(JPanel panel) {
		panel.setBackground(new java.awt.Color(227, 209, 48));
	}
	
	public static void colorClick(JPanel panel) {
		panel.setBackground(new java.awt.Color(218, 165, 32));
	}
	
	public static void inicializarArrayLists() {
		
		for(int i = 1; i <= 5; i++) {
			Usuario usuario = new Usuario();
			usuario.setEmail("usuario"+i);
			usuario.setPass("usuario");
			usuarios.add(usuario);
		}
		
	}

}
