package screens.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import utils.panels.ControladorTratamientos;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;

/**
 * Panel para añadir tratamientos
 * @author Padilla
 */
public class PanelTratamientos extends JPanel {

	private static final long serialVersionUID = 1L;
	private static JLabel lblTipo;
	private static JLabel lblDescripcion;
	private static JComboBox<String> comboBoxMedicamento;
	private static JSpinner spinnerComprimido;
	private static JSpinner spinnerHoras;
	private static JPanel panel;
	private static JDateChooser dateChooserInicio;
	private static JDateChooser dateChooserFinal;

	/**
	 * Create the panel.
	 */
	public PanelTratamientos() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblTipo.setText(ControladorTratamientos.buscarTipoODescripcion((String) comboBoxMedicamento.getSelectedItem(), true));
				lblDescripcion.setText(ControladorTratamientos.buscarTipoODescripcion((String) comboBoxMedicamento.getSelectedItem(), false));
			}
		});
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
		panel_4.setLayout(new GridLayout(14, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		panel_4.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Medicamento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);
		
		comboBoxMedicamento = new JComboBox<>();
		panel_4.add(comboBoxMedicamento);
		comboBoxMedicamento.setModel(new DefaultComboBoxModel<String>(ControladorTratamientos.rellenarComboBox()));
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tipo de medicamento");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblNewLabel_2_1);
		
		lblTipo = new JLabel("");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblTipo);
		
		JLabel lblNewLabel_5 = new JLabel("");
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_2 = new JLabel("Descripción");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblNewLabel_2_2);
		
		lblDescripcion = new JLabel("");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(lblDescripcion);
		
		JLabel lblNewLabel_7 = new JLabel("");
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Inicio tratamiento");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblNewLabel_2_2_1);
		
		dateChooserInicio = new JDateChooser();
		panel_4.add(dateChooserInicio);
		
		JLabel lblNewLabel_9 = new JLabel("");
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Fin tratamiento");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblNewLabel_2_2_1_1);
		
		dateChooserFinal = new JDateChooser();
		panel_4.add(dateChooserFinal);
		
		JLabel lblNewLabel_12 = new JLabel("");
		panel_4.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		panel_4.add(lblNewLabel_13);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Posología");
		lblNewLabel_2_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_4.add(lblNewLabel_2_2_1_1_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(240, 255, 240));
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 3, 0, 0));
		
		spinnerComprimido = new JSpinner();
		panel_5.add(spinnerComprimido);
		
		JLabel lblNewLabel_16 = new JLabel("Comprimido/s");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		panel_5.add(lblNewLabel_17);
		
		JLabel lblNewLabel_17_1 = new JLabel("Cada");
		lblNewLabel_17_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_17_1);
		
		spinnerHoras = new JSpinner();
		panel_5.add(spinnerHoras);
		
		JLabel lblNewLabel_17_1_1 = new JLabel("hora/s");
		lblNewLabel_17_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_17_1_1);
		
		JLabel lblNewLabel_11 = new JLabel("");
		panel_4.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crear();
			}
		});
		
		JLabel lblNewLabel_14 = new JLabel("");
		panel_4.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		panel_4.add(lblNewLabel_15);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(btnNewButton);
		
		lblTipo.setText(ControladorTratamientos.buscarTipoODescripcion((String) comboBoxMedicamento.getSelectedItem(), true));
		lblDescripcion.setText(ControladorTratamientos.buscarTipoODescripcion((String) comboBoxMedicamento.getSelectedItem(), false));
	}
	
	/**
	 * Comprueba que los campos de fecha estan escogidos antes de añadir un tratamiento
	 */
	private static void crear() {
		if (dateChooserInicio.getDate() != null && dateChooserFinal.getDate() != null) {
			try {
				spinnerComprimido.commitEdit();
				spinnerHoras.commitEdit();
			} catch (ParseException e) {e.printStackTrace();
			}
			ControladorTratamientos.registrar((String) comboBoxMedicamento.getSelectedItem(), dateChooserInicio.getDate(), dateChooserFinal.getDate(), (Integer) spinnerComprimido.getValue(), (Integer) spinnerHoras.getValue());
			JOptionPane.showMessageDialog(panel, "Tratamiento añadido correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(panel, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
