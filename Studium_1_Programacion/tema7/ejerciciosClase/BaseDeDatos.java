package ejerciciosClase;

//Importar la clase que maneja sentencias SQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BaseDeDatos
{
	public static void main(String[] args)
	{
		String url = "jdbc:mysql://localhost:3306/empresa?useSSL=false";
		String login = "root";
		String password = "Studium2019;";
		
		int idEmpleado;
		String nombre = new String("");
		//Cargar los controladores para el acceso a la BD
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println("Error:"+cnfe.toString());
		}
		try
		{
			//Establecer la conexión con la BD Empresa
			Connection connection = DriverManager.getConnection(url, login, password);
			//Crear una sentencia
			Statement statement = connection.createStatement();
			//Crear un objeto ResultSet para guardar lo obtenido
			//y realizar la sentencia SQL
			ResultSet rs = statement.executeQuery("SELECT * FROM EMPLEADOS");
			//Recorrer los registros obtenidos
			while(rs.next())
			{
				//Obtener el campo nombre del registro activo
				idEmpleado = rs.getInt("idEmpleado");
				//Escribirlo
				System.out.print(idEmpleado+"-");
				//Obtener el campo nombre del registro activo
				nombre = rs.getString("nombreEmpleado");
				//Escribirlo
				System.out.println(nombre);
			}
			//Cerrar los objetos creados
			rs.close();
			statement.close();
			connection.close();
		}
		catch(SQLException sqle)
		{
			System.out.println("Error:"+sqle.toString());
		}
	}
}