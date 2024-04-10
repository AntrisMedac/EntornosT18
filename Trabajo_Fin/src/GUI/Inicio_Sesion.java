package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Inicio_Sesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField CampoUsuario;
	public static JPasswordField Campo_Contraseña;
	
	/**
	 * Create the frame.
	 */
	public Inicio_Sesion() {
		setBackground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\z_Medac\\Programación\\Trabajo_Final\\Multimedia\\Icono.jpg"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 210, 280);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(47, 27, 98, 17);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel);
		
		CampoUsuario = new JTextField();
		CampoUsuario.setBounds(47, 55, 98, 20);
		contentPane.add(CampoUsuario);
		CampoUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(47, 86, 98, 17);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_1);
		
		Campo_Contraseña = new JPasswordField();
		Campo_Contraseña.setBounds(47, 114, 98, 20);
		contentPane.add(Campo_Contraseña);
		
		JButton BotonIniciar = new JButton("Inciar Sesion");
		BotonIniciar.setBounds(38, 163, 122, 25);
		BotonIniciar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		BotonIniciar.setBackground(Color.BLACK);
		BotonIniciar.setForeground(Color.WHITE);
		contentPane.add(BotonIniciar);
		
		BotonIniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Principal principal=new Principal();
				
				if (Logica.Funciones.comprobarUsuario()==true) {
					principal.setVisible(true);
					dispose();
				}
			};
		});
		
		
		JButton BotonRegistro = new JButton("Registrarse");
		BotonRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BotonRegistro.setForeground(Color.WHITE);
		BotonRegistro.setFont(new Font("Arial Black", Font.PLAIN, 11));
		BotonRegistro.setBackground(Color.BLACK);
		BotonRegistro.setBounds(38, 199, 122, 25);
		contentPane.add(BotonRegistro);
		
		BotonRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Registro registro=new Registro();
				
				registro.setVisible(true);
				dispose();
				
			};
		});
	}
}
