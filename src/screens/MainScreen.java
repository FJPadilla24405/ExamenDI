package screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import screens.panels.MenuInicio;
import screens.panels.PanelMedicamentos;
import screens.panels.PanelMiSalud;
import screens.panels.PanelTratamientos;
import java.awt.Toolkit;

/**
 * Pantalla principal de la aplicacion, disfuncional sin haber iniciado sesion
 * @author Padilla
 */
public class MainScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JLayeredPane layeredPane;
	private static MainScreen frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainScreen();
					frame.setBounds(0, 0, 1000, 800);
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
	public MainScreen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainScreen.class.getResource("/resources/logo.png")));
		setBackground(new Color(240, 255, 240));
		setTitle("iSalud App");
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
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_3 = new JLabel("iSalud");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setIcon(new ImageIcon(MainScreen.class.getResource("/resources/logo.png")));
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panelMedicamentos = new JPanel();
		panelMedicamentos.setBackground(new Color(143, 188, 143));
		panel_1.add(panelMedicamentos);
		panelMedicamentos.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblMedicamentos = new JLabel(" Añadir medicamento ");
		lblMedicamentos.setForeground(new Color(255, 255, 255));
		lblMedicamentos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMedicamentos.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelMedicamentos.add(lblMedicamentos);
		panelMedicamentos.addMouseListener(adaptadorPanel(panelMedicamentos, lblMedicamentos, 1));
		
		JPanel panelTratamientos = new JPanel();
		panelTratamientos.setBackground(new Color(143, 188, 143));
		panel_1.add(panelTratamientos);
		panelTratamientos.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblTratamientos = new JLabel(" Añadir tratamiento ");
		lblTratamientos.setForeground(new Color(255, 255, 255));
		lblTratamientos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTratamientos.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelTratamientos.add(lblTratamientos);
		panelTratamientos.addMouseListener(adaptadorPanel(panelTratamientos, lblTratamientos, 2));
		
		JPanel panelMiSalud = new JPanel();
		panelMiSalud.setBackground(new Color(143, 188, 143));
		panel_1.add(panelMiSalud);
		panelMiSalud.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblMiSalud = new JLabel(" Mi Salud ");
		lblMiSalud.setForeground(new Color(255, 255, 255));
		lblMiSalud.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiSalud.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelMiSalud.add(lblMiSalud);
		panelMiSalud.addMouseListener(adaptadorPanel(panelMiSalud, lblMiSalud, 3));
		
		JPanel panelCerrarSesion = new JPanel();
		panelCerrarSesion.setForeground(new Color(240, 230, 140));
		panelCerrarSesion.setBackground(new Color(143, 188, 143));
		panel_1.add(panelCerrarSesion);
		panelCerrarSesion.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel lblCerrarSesion = new JLabel(" Cerrar Sesión ");
		lblCerrarSesion.setForeground(new Color(255, 255, 255));
		lblCerrarSesion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCerrarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		panelCerrarSesion.add(lblCerrarSesion);
		panelCerrarSesion.addMouseListener(adaptadorPanel(panelCerrarSesion, lblCerrarSesion, 0));
		panelCerrarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 255, 240));
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Francisco Javier Padilla López");
		panel_3.add(lblNewLabel);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(255, 228, 196));
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JPanel panelMenu = new MenuInicio();
		panelMenu.setVisible(true);
		JPanel panelM = new PanelMedicamentos();
		panelM.setVisible(false);
		JPanel panelT = new PanelTratamientos();
		panelT.setVisible(false);
		JPanel panelMS = new PanelMiSalud();
		panelMS.setVisible(false);
		
		layeredPane.add(panelMenu, 0);
		layeredPane.add(panelM, 1);
		layeredPane.add(panelT, 2);
		layeredPane.add(panelMS, 3);
		
		layeredPane.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                resize();
            }
        });

	}

	/**
	 * 
	 * @param index
	 */
	private static void changePanel(int index) {
		
		for(int i = 0; i < layeredPane.getComponentCount(); i++) {
			
			Component panel = layeredPane.getComponent(i);
		    boolean show = (i == index);
		    panel.setVisible(show);
		    if (show) {
		        // Forzar actualización del panel que vamos a mostrar
		    	panel.validate();
		        panel.repaint();
		    }
		}
		
		// Actualiza el layeredpane y actualiza las dimensiones para que aparezca correctamente el panel
		layeredPane.revalidate();
	    layeredPane.repaint();
	    resize();
	}
	
	/**
	 * Actualiza las dimensiones del panel
	 */
	private static void resize() {
		
		for (int i = 0; i < MainScreen.layeredPane.getComponentCount(); i++) {
			if (MainScreen.layeredPane.getComponent(i).isVisible()) {
				Dimension size = MainScreen.layeredPane.getSize();
				MainScreen.layeredPane.getComponent(i).setBounds(0, 0, size.width, size.height);
			}
		}	
	}
	
	// Los siguientes tres metodos solo cambian el color de fondo del panel y el texto para tener feedback visual
	private static void colorBase(JPanel panel, JLabel label) {
		panel.setBackground(new java.awt.Color(143, 188, 143));
		label.setForeground(new java.awt.Color(255, 255, 255));
	}
	
	private static void colorFocus(JPanel panel, JLabel label) {
		panel.setBackground(new java.awt.Color(46, 139, 86));
		label.setForeground(new java.awt.Color(255, 255, 255));
	}
	
	private static void colorClick(JPanel panel, JLabel label) {
		panel.setBackground(new java.awt.Color(255, 255, 255));
		label.setForeground(new java.awt.Color(143, 188, 143));
	}
	
	/**
	 * Metodo que añade respuesta visual a los paneles que actuan como botones
	 * @param panel Panel que queremos que responda
	 * @param label Texto del panel
	 * @param index Indice para cambiar de panel al clickear
	 * @return Un mouse adapter para los paneles a los que queremos implementar esta funcionalidad
	 */
	private static MouseAdapter adaptadorPanel(JPanel panel, JLabel label, int index) {
		return new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				colorFocus(panel, label);
				frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				colorBase(panel, label);
				frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				colorClick(panel, label);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				colorFocus(panel, label);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				changePanel(index);
				
			}
		
		};
	}

}
