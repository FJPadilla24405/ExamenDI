package screens.panels;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import modelos.Medicamento;
import modelos.Tratamiento;
import utils.ControladorMainScreen;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.SwingConstants;

/**
 * Panel con las tablas de medicamentos y tratamientos
 */
public class PanelMiSalud extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textNombreM;
	private JTextField textTipo;
	private JTable tableMedicamentos;
	private JTextField textNombreT;
	private JTable tableTratamientos;
	private static TableRowSorter<TableModel> sorter;

	/**
	 * Create the panel.
	 */
	public PanelMiSalud() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setTable(tableMedicamentos, true);
				setTable(tableTratamientos, false);	
			}
		});
		setBackground(new Color(240, 255, 240));
		setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panelTratamientos = new JPanel();
		panelTratamientos.setBackground(new Color(240, 255, 240));
		add(panelTratamientos);
		panelTratamientos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panelTratamientos.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 255, 240));
		panel.add(panel_6, BorderLayout.WEST);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(143, 188, 143));
		panel.add(panel_7, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Medicamentos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_7.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		panelTratamientos.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_1);
		
		textNombreM = new JTextField();
		panel_1.add(textNombreM);
		textNombreM.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("     ");
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(lblNewLabel_2);
		
		textTipo = new JTextField();
		panel_1.add(textTipo);
		textTipo.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panelTratamientos.add(scrollPane, BorderLayout.CENTER);
		
		tableMedicamentos = new JTable();
		tableMedicamentos.setEnabled(false);
		tableMedicamentos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Laboratorio", "Tipo", "Descripci\u00F3n"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tableMedicamentos);
		
		sorter = new TableRowSorter<>(tableMedicamentos.getModel());
		tableMedicamentos.setRowSorter(sorter);
		
		JPanel panelMedicamentos = new JPanel();
		add(panelMedicamentos);
		panelMedicamentos.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(143, 188, 143));
		panelMedicamentos.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(240, 255, 240));
		panel_2.add(panel_8, BorderLayout.WEST);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(143, 188, 143));
		panel_2.add(panel_9, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("Mis tratamientos");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_9.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 255, 240));
		panelMedicamentos.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(lblNewLabel_5);
		
		textNombreT = new JTextField();
		panel_3.add(textNombreT);
		textNombreT.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panelMedicamentos.add(scrollPane_1, BorderLayout.CENTER);
		
		tableTratamientos = new JTable();
		tableTratamientos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Fecha Inicio", "Fecha Fin", "Comprimidos", "Horas"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, Integer.class
			};
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableTratamientos.setEnabled(false);
		scrollPane_1.setViewportView(tableTratamientos);
		sorter = new TableRowSorter<>(tableTratamientos.getModel());
		tableTratamientos.setRowSorter(sorter);
		
		setTable(tableMedicamentos, true);
		setTable(tableTratamientos, false);	
		
		textNombreM.getDocument().addDocumentListener(documentListener(tableMedicamentos, textNombreM, 0));
		textTipo.getDocument().addDocumentListener(documentListener(tableMedicamentos, textTipo, 2));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 255, 240));
		panelTratamientos.add(panel_4, BorderLayout.WEST);
		textNombreT.getDocument().addDocumentListener(documentListener(tableTratamientos, textNombreT, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(240, 255, 240));
		panelMedicamentos.add(panel_5, BorderLayout.WEST);
	}
	
	/**
	 * Metodo que actualiza las tablas con los datos de medicamentos y tratamientos
	 * @param table Tabla a la que vamos a añadir datos
	 * @param esMedicamento True para añadir datos de medicamentos a la tabla, False para añadir datos de tratamientos
	 */
	private static void setTable(JTable table, boolean esMedicamento) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();

		// Resetea la tabla para que no haya valores duplicados
	    model.setRowCount(0);
	    
	    // Añade los medicamentos
	    if (esMedicamento) {
	    	for (Medicamento medicamento : ControladorMainScreen.medicamentos) {
		    	Object[] row = {
		    			medicamento.getNombre(),
		    			medicamento.getLaboratorio(),
		    			String.valueOf(medicamento.getTipo()),
		    			medicamento.getDescripcion()
		            };
		            model.addRow(row);
		    }
	    // Añade los tratamientos
	    } else {
	    	for (Tratamiento tratamiento : ControladorMainScreen.currentUser.getMisTratamientos()) {
		    	Object[] row = {
		    			tratamiento.getMedicamento().getNombre(),
		    			dateToString(tratamiento.getFechaInicio()),
		    			dateToString(tratamiento.getFechaFin()),
		    			tratamiento.getComprimidos(),
		    			tratamiento.getHoras()
		            };
		            model.addRow(row);
		    }
	    }
	}
	
	/**
	 * Metodo que devuelve una fecha con formato dia/mes/año
	 * @param fecha Objeto fecha que queremos pasar a string
	 * @return String de la fecha en formato dia/mes/año
	 */
	@SuppressWarnings("deprecation")
	private static String dateToString(Date fecha) {
		String resultado = String.valueOf(fecha.getDay());
		resultado = resultado+"/"+String.valueOf(fecha.getMonth());
		resultado = resultado+"/"+String.valueOf(fecha.getYear());
		return resultado;
	}
	
	/**
	 * Metodo que añade filtros a una tabla
	 * @param tabla Tabla que queremos filtrar
	 * @param texto Campo de texto del que vamos a sacar el texto a comparar
	 * @param index Indice de la columna a la que vamos a añadir el filtro
	 */
	private static void filtrar(JTable tabla, JTextField texto, int index) {
		sorter = new TableRowSorter<>(tabla.getModel());
		sorter.setRowFilter(RowFilter.regexFilter(texto.getText(), index));
		tabla.setRowSorter(sorter);
	}
	
	/**
	 * Metodo que devuelve un listener para que los filtros se apliquen en tiempo real
	 * @param tabla Tabla para filtrar
	 * @param texto Campo de texto para el filtro
	 * @param index Indice de la columna a filtrar
	 * @return Un document listener para un campo de texto
	 */
	private static DocumentListener documentListener(JTable tabla, JTextField texto, int index) {
		return new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				filtrar(tabla, texto, index);
			}
			@Override
			public void removeUpdate(DocumentEvent e) {
				filtrar(tabla, texto, index);
			}
			@Override
			public void changedUpdate(DocumentEvent e) {
				filtrar(tabla, texto, index);
			}
		};
	}
}
