package utils.panels;

import modelos.Medicamento;
import modelos.TipoMedicamento;
import utils.ControladorMainScreen;

/**
 * Clase controladora del panel para añadir medicamentos
 * @author Padilla
 */
public class ControladorMedicamentos {
	
	/**
	 * Añade un nuevo medicamento con los datos introducidos
	 * @param nombre Nombre del medicamento
	 * @param laboratorio Nombre del laboratorio donde se ha creado el medicamento
	 * @param tipo Tipo de medicamento que es
	 * @param descripcion Descripcion de para lo que sirve el medicamento o lo que hace
	 */
	public static void registrar(String nombre, String laboratorio, TipoMedicamento tipo, String descripcion) {
		Medicamento medicamento = new Medicamento();
		medicamento.setNombre(nombre);
		medicamento.setLaboratorio(laboratorio);
		medicamento.setTipo(tipo);
		medicamento.setDescripcion(descripcion);
		ControladorMainScreen.medicamentos.add(medicamento);
	}

}
