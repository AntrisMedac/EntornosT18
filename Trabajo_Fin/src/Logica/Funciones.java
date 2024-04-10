package Logica;

import java.sql.ResultSet;
import java.sql.SQLException;

import GUI.Registro;
import Persistencia.ConexionBBDD;

public class Funciones {
	
	
	/*
	 * Esta funcion busca el usuario en la base de datos y si encuentra coincidencia
	 * permite el incio de sesion, cerrando la ventana de inicio y abriendo la principal
	 * */
	public static boolean comprobarUsuario() {
		char[] passwordChars = GUI.Inicio_Sesion.Campo_Contraseña.getPassword();
		String contraseña = new String(passwordChars);
		String usuario = GUI.Inicio_Sesion.CampoUsuario.getText();

		
		ConexionBBDD conexion=new ConexionBBDD("root", "", "prueba");
		
		
		try {
			conexion.conectar();
			
			String sentencia="SELECT * FROM usuarios WHERE Usuario='"+usuario+"'";
			ResultSet datos;
			datos=conexion.ejecutarSelect(sentencia);
			
			while(datos.next()) {
				String usuarioBBDD=datos.getString("Usuario");
				String contraseñaBBDD=datos.getString("Contraseña");
				
				if (usuarioBBDD.equals(usuario) && contraseñaBBDD.equals(contraseña)) {
					return true;
				}
				else {
					return false;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				conexion.desconectar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	
	/*
	 * Esta funcion busca en la base de datos que no exista ese nombre de usuario,
	 * si no hay coincidencias entonces registra ese nombre con su contraseña,
	 * la cual hay que introducir dos veces exactamente igual para no tener fallos.
	 * */
	public static void registrarUsuario() {
		ConexionBBDD conexion=new ConexionBBDD("root", "", "prueba");
		
		try {
			conexion.conectar();
			
			String nuevoUsuario=GUI.Registro.campoUsuario.getText();
			char[] contraseñaChars=GUI.Registro.campoContraseña.getPassword();
			String contraseña=new String(contraseñaChars);
			char[] confirmaContraseñaChars=GUI.Registro.campoConfirmarContraseña.getPassword();
			String confirmaContraseña=new String(confirmaContraseñaChars);
			
			String sentenciaBuscar="SELECT * FROM usuarios";
			ResultSet datos;
			datos=conexion.ejecutarSelect(sentenciaBuscar);
			
			boolean encontrado=false;
			
			while(datos.next()) {
				String usuarioBBDD=datos.getString("Usuario");
				if (nuevoUsuario.equals(usuarioBBDD)) {
					encontrado=true;
					break;
				}
			}
			
			if (!encontrado && contraseña.equals(confirmaContraseña)) {
				String sentencia="INSERT INTO usuarios (Usuario, Contraseña) VALUES ('"+nuevoUsuario+"', '"+contraseña+"')";
				conexion.ejecutarInsertDeleteUpdate(sentencia);
			}
			else {
				GUI.Registro registro=new Registro();
				
				registro.setVisible(true);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conexion.desconectar();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
