package ejerciciosClase;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class EjemploMetadatos
{
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/empresa?useSSL=false";
	String login = "root";
	String password = "Studium2019;";
	String sentencia = "SELECT * FROM empleados";
	Connection connection = null;
	Statement statement = null;
	ResultSet rs = null;
	public EjemploMetadatos()
	{
		//Cargar el Driver
		try
		{
			Class.forName(driver);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Se ha producido un error al cargar el Driver");
		}
		//Establecer la conexión con la base de datos
		try
		{
			connection = DriverManager.getConnection(url, login, password);
		}
		catch(SQLException e)
		{
			System.out.println("Se produjo un error al conectar a la Base de Datos");
		}
		//Preparar el statement
		try
		{
			statement = connection.createStatement();
			// Trabajar con el Schema
			DatabaseMetaData dmd = connection.getMetaData();
			System.out.println("Base de Datos:"+dmd.getDatabaseProductName());
			System.out.println("Versión:"+dmd.getDatabaseProductVersion());
			System.out.println("Usuario:"+dmd.getUserName());
			ResultSet rsTablas = dmd.getTables(null, null, "%", null);
			while(rsTablas.next())
			{
				System.out.println("-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-");
				String catalogo = rsTablas.getString(1);
				String tabla = rsTablas.getString(3);
				System.out.println("TABLA=" + catalogo + "." + tabla);
				// Trabajar con una Tabla
				rs = statement.executeQuery("SELECT * FROM " + catalogo + "." + tabla);
				ResultSetMetaData rsm = rs.getMetaData();
				int n = rsm.getColumnCount();
				System.out.println("Número de columnas: "+n);
				System.out.println("-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-");

				for(int i=1;i<=n;i++)
				{
					System.out.println("Campo:"+rsm.getColumnName(i));
					System.out.println("Tipo:"+rsm.getColumnTypeName(i));
					System.out.println("Tamaño:"+rsm.getColumnDisplaySize(i));
					System.out.println("Precisión:"+rsm.getPrecision(i));
					System.out.println("-----------");
				}
			
			}
			}
		catch(SQLException e)
		{
			System.out.println("Error en la sentencia SQL"+e.toString());
		}
	}
	public static void main(String[] args)
	{
		new EjemploMetadatos();
	}
}
