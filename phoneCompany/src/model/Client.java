package model;

import java.sql.Connection;

public class Client {

	/**
	 * Agrega un cliente en la base de datos
	 * 
	 * @param connection SQL.connection object
	 * @throws Exception Error enviado desde la base de datos
	 */
	public static void AddClient(Connection connection, String ivId, String ivContrasenha, String ivNombre,
			String ivCedula, String ivDireccion, String ivFecha, String ivTelefono) throws Exception {

		String Statament = "pkCliente.pInsertarCliente('" + ivId + "','" + ivContrasenha + "','" + ivNombre + "','"
				+ ivCedula + "','" + ivDireccion + "','" + ivFecha + "','" + ivTelefono + "');";

		ConnectionDB.send(connection, Statament);
	}

	/**
	 * Elimina el cliente con la cedula ingresada por parametro
	 * 
	 * @param connection SQL.connection object
	 * @throws Exception Error enviado desde la base de datos
	 */
	public static void deletesClient(Connection connection, String ivCedula) throws Exception {
		String Statament = "pkCliente.pEliminarCliente('" + ivCedula + "');";
		ConnectionDB.send(connection, Statament);
	}

	/**
	 * Modifica los campos del cliente con la cedula ingresada por parametro
	 * 
	 * @param connection SQL.connection object
	 * @throws Exception Error enviado desde la base de datos
	 */
	public static void editClient(Connection connection, String ivId, String ivContrasenha, String ivNombre,
			String ivCedula, String ivDireccion, String ivFecha, String ivTelefono) throws Exception {
		String Statament = "pkCliente.pModificarCliente('" + ivId + "','" + ivContrasenha + "','" + ivNombre + "','"
				+ ivCedula + "','" + ivDireccion + "','" + ivFecha + "','" + ivTelefono + "');";
		ConnectionDB.send(connection, Statament);
	}

	/**
	 * Consulta los datos de un cliente
	 * 
	 * @param connection SQL.connection object
	 * @return String con toda la informacion del cliente
	 * @throws Exception Error enviado desde la base de datos
	 */
	public static String consultClient(Connection connection, String ivCedula) throws Exception {
		String Statament = "pkCliente.fConsultarCliente('" + ivCedula + "')";
		return ConnectionDB.recive(connection, Statament);
	}

}
