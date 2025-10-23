package screens.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import screens.MainScreen;
import utils.ControladorMainScreen;
import utils.login.ControladorInicioSesion;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;

/**
 * Pantalla de inicio de sesión, esta pantalla es la inicial
 * @author Padilla
 */
public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textPsswrd;
	private static InicioSesion frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControladorMainScreen.inicializarArrayLists();
					frame = new InicioSesion();
					frame.setBounds(0, 0, 800, 500);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		setBackground(new Color(240, 255, 240));
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSesion.class.getResource("/resources/logo.png")));
		setTitle("iSalud");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(46, 139, 87));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("iSalud");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setIcon(new ImageIcon(InicioSesion.class.getResource("/resources/logo.png")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(InicioSesion.class.getResource("/resources/imgPortada.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_3, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		panel_4.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		panel_4.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);
		
		textEmail = new JTextField();
		textEmail.setToolTipText("usuario1@gmail.com");
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		panel_4.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_4);
		
		textPsswrd = new JPasswordField();
		textPsswrd.setToolTipText("usuario1");
		textPsswrd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(textPsswrd);
		textPsswrd.setColumns(10);
		
		JLabel lblNewLabel_3_5 = new JLabel("");
		panel_4.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		panel_4.add(lblNewLabel_3_4);
		
		JLabel lblRegister = new JLabel("¿No tienes cuenta?");
		/**
		 * Hace que el texto responda visualmente al puntero
		 */
		lblRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				subrayar(lblRegister, true);
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				subrayar(lblRegister, false);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				lblRegister.setForeground(new java.awt.Color(0,0,0));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				lblRegister.setForeground(new java.awt.Color(0,0,255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				new Registro();
				Registro.main(null);
			}
		});
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblRegister.setForeground(new Color(0, 0, 255));
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblRegister);
		
		JButton btnLogin = new JButton("Iniciar Sesión");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ControladorInicioSesion.login(textEmail.getText(), textPsswrd.getText())) {
					new MainScreen();
					MainScreen.main(null);
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(frame, "Usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_4.add(btnLogin);

	}
	
	/**
	 * Metodo que subraya o quita el subrayado de un label
	 * @param label Texto que cambiar
	 * @param flag True para subrayar, False para quitar subrayado
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void subrayar(JLabel label, boolean flag) {
		Font font = label.getFont();
		Map attributes = font.getAttributes();
		if (flag) {
			attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		} else {
			attributes.put(TextAttribute.UNDERLINE, -1);
		}	
		label.setFont(font.deriveFont(attributes));
		
	}

}
