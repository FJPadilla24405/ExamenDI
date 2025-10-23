package utils.panels;

import java.util.Date;

import modelos.Medicamento;
import modelos.Tratamiento;
import utils.ControladorMainScreen;

/**
 * Clase controladora del panel de añadir tratamientos
 * @author Padilla
 */
public class ControladorTratamientos {
	
	/**
	 * Añade un nuevo tratamiento con los datos introducidos
	 * @param medicamento Medicamento del tratamiento
	 * @param inicio Fecha de inicio del tratamiento
	 * @param fin Fecha de final del tratamiento
	 * @param comprimido Numero de comprimidos
	 * @param horas Cada cuantas horas hay que tomarse los comprimidos
	 */
	public static void registrar(String medicamento, Date inicio, Date fin, int comprimido, int horas) {
		Tratamiento tratamiento = new Tratamiento();
		tratamiento.setMedicamento(encontrar(medicamento));
		tratamiento.setFechaInicio(inicio);
		tratamiento.setFechaFin(fin);
		tratamiento.setComprimidos(comprimido);
		tratamiento.setHoras(horas);
		ControladorMainScreen.currentUser.getMisTratamientos().add(tratamiento);
	}
	
	/**
	 * Metodo que recoge los nombres de los medicamentos para rellenar un combobox
	 * @return Array de strings con los nombres de todos los medicamentos guardados
	 */
	public static String[] rellenarComboBox() {
		String nombres = "";
		
		for (Medicamento medicamento : ControladorMainScreen.medicamentos) {
			nombres += medicamento.getNombre() + ";";
		}
		
		String[] resultado = nombres.trim().split(";");
		
		return resultado;
	}
	
	/**
	 * Metodo que busca con el nombre de un medicamento uno que coincida para sacar o su tipo o su descripcion (usado para el combobox)
	 * @param nombreMedicamento Nombre del medicamento a buscar
	 * @param esTipo True si queremos sacar el tipo, False si queremos sacar la descripcion
	 * @return El tipo o la descripcion del medicamento
	 */
	public static String buscarTipoODescripcion(String nombreMedicamento, boolean esTipo) {
		String resultado = "";
		
		for (Medicamento medicamento : ControladorMainScreen.medicamentos) {
			if (medicamento.getNombre().equals(nombreMedicamento)) {
				if (esTipo) {
					resultado = String.valueOf(medicamento.getTipo());
				} else {
					resultado = medicamento.getDescripcion();
				}
			}
		}
		return resultado;	
	}
	
	/**
	 * Metodo que encuentra un medicamento por el nombre (usado para el combobox)
	 * @param nombre Nombre del medicamento a buscar
	 * @return Objeto Medicamento
	 */
	private static Medicamento encontrar(String nombre) {
		Medicamento resultado = new Medicamento();
		
		for (Medicamento medicamento : ControladorMainScreen.medicamentos) {
			if (medicamento.getNombre().equals(nombre)) {
				resultado = medicamento;
			}
		}
		
		return resultado;
	}
}
