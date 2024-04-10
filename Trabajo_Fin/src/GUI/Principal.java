package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public Principal() {
		setForeground(new Color(0, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\z_Medac\\Programación\\Trabajo_Final\\Multimedia\\Icono.jpg"));
		setTitle("Steam 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\z_Medac\\Programación\\Trabajo_Final\\Multimedia\\IconoPequeño.jpg"));
		lblNewLabel.setBounds(10, 11, 75, 75);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STEAM 2");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 39));
		lblNewLabel_1.setBounds(95, 21, 207, 56);
		contentPane.add(lblNewLabel_1);
		
		JLabel Amigos = new JLabel("<html><u>Amigos</u></html>");
		Amigos.setFont(new Font("Arial Black", Font.PLAIN, 12));
		Amigos.setForeground(new Color(255, 255, 255));
		Amigos.setIcon(new ImageIcon("C:\\z_Medac\\Programación\\Trabajo_Final\\Multimedia\\Amigos.png"));
		Amigos.setBounds(568, 47, 88, 19);
		contentPane.add(Amigos);
		
		Amigos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	Amigos.setCursor(new Cursor(Cursor.HAND_CURSOR));
            	Registro registro=new Registro();
				registro.setVisible(true);
            }
        });
		
		JLabel Perfil = new JLabel("<html><u>Perfil</u></html>");
		Perfil.setFont(new Font("Arial Black", Font.PLAIN, 12));
		Perfil.setForeground(new Color(255, 255, 255));
		Perfil.setIcon(new ImageIcon("C:\\z_Medac\\Programación\\Trabajo_Final\\Multimedia\\usuario.png"));
		Perfil.setBounds(666, 44, 64, 25);
		contentPane.add(Perfil);
		
		Perfil.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	Perfil.setCursor(new Cursor(Cursor.HAND_CURSOR));
            	Registro registro=new Registro();
				registro.setVisible(true);
            }
        });
		
	}
}
//Mostrar una ventana con un mensaje
//JOptionPane.showMessageDialog(null, "¡Has hecho clic en el JLabel!");