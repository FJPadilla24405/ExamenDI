package screens.login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import utils.login.ControladorRegistro;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

/**
 * Pantalla de registro de usuarios
 * @author Padilla
 */
public class Registro extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private static JTextField textNombre;
	private static JTextField textApellidos;
	private static JTextField textEmail;
	private static JTextField textPsswrd;
	private static JTextField textConfirmar;
	private static Registro dialog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialog = new Registro();
			dialog.setBounds(0, 0, 450, 500);
			dialog.setLocationRelativeTo(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registro.class.getResource("/resources/logo.png")));
		setModal(true);
		getContentPane().setBackground(new Color(46, 139, 87));
		setBackground(new Color(46, 139, 87));
		setTitle("Registro de usuario");
		setBounds(100, 100, 450, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(46, 139, 87));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(46, 139, 87));
			contentPanel.add(panel, BorderLayout.WEST);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(46, 139, 87));
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel lblNewLabel = new JLabel("Registro de usuario");
				lblNewLabel.setForeground(new Color(255, 255, 255));
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
				panel.add(lblNewLabel);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(46, 139, 87));
			contentPanel.add(panel, BorderLayout.EAST);
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(240, 255, 240));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new GridLayout(11, 2, 0, 0));
			{
				JLabel lblNewLabel_2 = new JLabel("");
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Nombre");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				panel.add(lblNewLabel_3);
			}
			{
				textNombre = new JTextField();
				panel.add(textNombre);
				textNombre.setColumns(10);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("");
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("");
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Apellidos");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				panel.add(lblNewLabel_3);
			}
			{
				textApellidos = new JTextField();
				textApellidos.setColumns(10);
				panel.add(textApellidos);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Email");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				panel.add(lblNewLabel_3);
			}
			{
				textEmail = new JTextField();
				textEmail.setColumns(10);
				panel.add(textEmail);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Contraseña");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				panel.add(lblNewLabel_3);
			}
			{
				textPsswrd = new JPasswordField();
				textPsswrd.setColumns(10);
				panel.add(textPsswrd);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Confirmar contraseña");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
				panel.add(lblNewLabel_3);
			}
			{
				textConfirmar = new JPasswordField();
				textConfirmar.setColumns(10);
				panel.add(textConfirmar);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(46, 139, 87));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registro");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						registrar();
					}
				});
				okButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	/**
	 * Metodo que comprueba que los campos de texto no estan vacios y las contraseñas coinciden para registrar al usuario
	 */
	private static void registrar() {
		if (textNombre.getText().isBlank() || textApellidos.getText().isBlank() || textEmail.getText().isBlank() ||
			textPsswrd.getText().isBlank() || textConfirmar.getText().isBlank()) {
			
			JOptionPane.showMessageDialog(dialog, "No debe haber campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
		} else if (textPsswrd.getText().equals(textConfirmar.getText())) {
			
			ControladorRegistro.registrar(textNombre.getText(), textApellidos.getText(), textEmail.getText(), textPsswrd.getText());
			JOptionPane.showMessageDialog(dialog, "Usuario creado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			dialog.dispose();
		} else {
			JOptionPane.showMessageDialog(dialog, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
