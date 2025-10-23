package screens.panels;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import modelos.TipoMedicamento;
import utils.panels.ControladorMedicamentos;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Panel para añadir medicamentos
 * @author Padilla
 */
public class PanelMedicamentos extends JPanel {

	private static final long serialVersionUID = 1L;
	private static JTextField textNombre;
	private static JTextField textLaboratorio;
	private static JTextArea textDescripcion;
	private static JPanel panel;
	private static JComboBox<TipoMedicamento> comboBox;

	/**
	 * Create the panel.
	 */
	public PanelMedicamentos() {
		setBackground(new Color(240, 255, 240));
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 255, 240));
		add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 255, 240));
		add(panel_3, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 255, 240));
		add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(10, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		panel_4.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);
		
		textNombre = new JTextField();
		panel_4.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Laboratorio");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblNewLabel_2_1);
		
		textLaboratorio = new JTextField();
		panel_4.add(textLaboratorio);
		textLaboratorio.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("");
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tipo");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblNewLabel_2_2);
		
		comboBox = new JComboBox<>();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_4.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel<TipoMedicamento>(TipoMedicamento.values()));
		
		JLabel lblNewLabel_7 = new JLabel("");
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Descripción");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblNewLabel_2_2_1);
		
		textDescripcion = new JTextArea();
		textDescripcion.setColumns(10);
		panel_4.add(textDescripcion);
		
		JLabel lblNewLabel_9 = new JLabel("");
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		panel_4.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("Añade medicamento");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crear();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton);

	}
	
	/**
	 * Metodo que comprueba que los campos no estan vacios antes de añadir un nuevo medicamento
	 */
	private static void crear() {
		if (!textNombre.getText().isBlank() && !textLaboratorio.getText().isBlank() && !textDescripcion.getText().isBlank()) {
			
			ControladorMedicamentos.registrar(textNombre.getText(), textLaboratorio.getText(), (TipoMedicamento) comboBox.getSelectedItem(), textDescripcion.getText());
			JOptionPane.showMessageDialog(panel, "Medicamento añadido correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
			textNombre.setText("");
			textLaboratorio.setText("");
			textDescripcion.setText("");
		} else {
			JOptionPane.showMessageDialog(panel, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
