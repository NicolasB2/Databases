package model;

import java.sql.Connection;

public class PhoneCompany {

	private String user;
	private String password;
	private Connection connection;

	/**
	 * Establece la conexion con la base de datos
	 * 
	 * @param username usuario de la base de datos
	 * @param password contraseña de la base de datos
	 * @throws Exception No es posible conectarse con la base de datos
	 */
	public void createConection(String user, String password) throws Exception {
		this.connection = ConnectionDB.createConnection(user, password);
		this.password = password;
		this.user = user;
	}

	// *******************************************************************************************************
	// ********************************************* CLIENTE*************************************************
	// *******************************************************************************************************

	/**
	 * Agrega un cliente en la base de datos
	 * 
	 * @throws Exception Error enviado desde la base de datos
	 */
	public void AddClient(String ivId, String ivContrasenha, String ivNombre, String ivCedula, String ivDireccion,
			String ivFecha, String ivTelefono) throws Exception {
		Client.AddClient(this.connection, ivId, ivContrasenha, ivNombre, ivCedula, ivDireccion, ivFecha, ivTelefono);
	}

	/**
	 * Elimina el cliente con la cedula ingresada por parametro
	 * 
	 * @throws Exception Error enviado desde la base de datos
	 */
	public void DeletedClient(String ivCedula) throws Exception {
		Client.deletesClient(this.connection, ivCedula);
	}

	/**
	 * Modifica los campos del cliente con la cedula ingresada por parametro
	 * 
	 * @throws Exception Error enviado desde la base de datos
	 */
	public void EditClient(String ivId, String ivContrasenha, String ivNombre, String ivCedula, String ivDireccion,
			String ivFecha, String ivTelefono) throws Exception {
		Client.editClient(this.connection, ivId, ivContrasenha, ivNombre, ivCedula, ivDireccion, ivFecha, ivTelefono);
	}

	/**
	 * Consulta los datos de un cliente
	 * 
	 * @return String con toda la informacion del cliente
	 * @throws Exception Error enviado desde la base de datos
	 */
	public String consultClient(String ivCedula) throws Exception {
		return Client.consultClient(this.connection, ivCedula);
	}

	// *******************************************************************************************************
	// ******************************************* FUNCIONARIO ***********************************************
	// *******************************************************************************************************

	/**
	 * Agrega un Funcionario en la base de datos
	 * 
	 * @throws Exception Error enviado desde la base de datos
	 */
	public void AddFuncionario(String ivId, String ivContrasenha, String ivNombre, String ivCedula, String ivDireccion,
			String ivFecha, String ivTelefono) throws Exception {
		Funcionario.AddFuncionario(this.connection, ivId, ivContrasenha, ivNombre, ivCedula, ivDireccion, ivFecha,
				ivTelefono);
	}

	/**
	 * Elimina el Funcionario con la cedula ingresada por parametro
	 * 
	 * @throws Exception Error enviado desde la base de datos
	 */
	public void DeletedFuncionario(String ivCedula) throws Exception {
		Funcionario.deletedFuncionario(this.connection, ivCedula);
	}

	/**
	 * Modifica los campos del Funcionario con la cedula ingresada por parametro
	 * 
	 * @throws Exception Error enviado desde la base de datos
	 */
	public void EditFuncionario(String ivId, String ivContrasenha, String ivNombre, String ivCedula, String ivDireccion,
			String ivFecha, String ivTelefono) throws Exception {
		Funcionario.editFuncionario(this.connection, ivId, ivContrasenha, ivNombre, ivCedula, ivDireccion, ivFecha,
				ivTelefono);
	}

	/**
	 * Consulta los datos de un Funcionario
	 * 
	 * @return String con toda la informacion del usuario
	 * @throws Exception Error enviado desde la base de datos
	 */
	public String consultaFuncionario(final String ivCedula) throws Exception {
		return Funcionario.consultFuncionario(this.connection, ivCedula);
	}


	// *******************************************************************************************************
	// **************************************** GETERS AND SETERS ********************************************
	// *******************************************************************************************************

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getConnection() {
		return connection;
	}

	public static void main(String[] args) {
		PhoneCompany pc = new PhoneCompany();

		try {
			pc.createConection("P09551_1_4", "P09551_1_4_20191");
			System.out.println(pc.consultClient("1638052477599"));
			String s = pc.consultClient("1638052477599");

		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
