package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField campoUsuario;
	public static JPasswordField campoContraseña;
	public static JPasswordField campoConfirmarContraseña;

	public Registro() {
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\z_Medac\\Programación\\Trabajo_Final\\Multimedia\\Icono.jpg"));
		setTitle("Registro");
		setBackground(new Color(0, 51, 102));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 178, 275);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setForeground(Color.WHITE);
		lblNombreDeUsuario.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNombreDeUsuario.setBounds(10, 11, 123, 17);
		contentPane.add(lblNombreDeUsuario);
		
		campoUsuario = new JTextField();
		campoUsuario.setColumns(10);
		campoUsuario.setBounds(10, 39, 141, 20);
		contentPane.add(campoUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblContrasea.setBounds(10, 70, 123, 17);
		contentPane.add(lblContrasea);
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contraseña");
		lblConfirmarContrasea.setForeground(Color.WHITE);
		lblConfirmarContrasea.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblConfirmarContrasea.setBounds(10, 129, 141, 17);
		contentPane.add(lblConfirmarContrasea);
		
		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(10, 98, 141, 20);
		contentPane.add(campoContraseña);
		
		campoConfirmarContraseña = new JPasswordField();
		campoConfirmarContraseña.setBounds(10, 157, 141, 20);
		contentPane.add(campoConfirmarContraseña);
		
		JButton BotonRegistro = new JButton("Registrarse");
		BotonRegistro.setForeground(Color.WHITE);
		BotonRegistro.setFont(new Font("Arial Black", Font.PLAIN, 11));
		BotonRegistro.setBackground(Color.BLACK);
		BotonRegistro.setBounds(10, 197, 141, 25);
		contentPane.add(BotonRegistro);
		
		BotonRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Inicio_Sesion Inicio=new Inicio_Sesion();
				Logica.Funciones.registrarUsuario();
				dispose();
				Inicio.setVisible(true);
			};
		});
	}
}
