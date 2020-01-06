/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities.DataAccessLayer;

//Importa as bibliotecas sql a serem usadas.
import java.sql.*;
/**
 *
 * @author Isaqu
 */
public class ModuloConexao {
    
    public static Connection connector()
    {
        //Faz parte do pacote java.sql.*
        Connection connection = null;
    
        //Driver responsável pela conexão java-mysql.
        String driver = "com.mysql.jdbc.Driver";
    
        //A url contém informações a respeito do caminho do banco de dados
        //como o servidor que o mesmo esta hospedado = localhost,
        //a porta de rede: 3306,
        //e o nome do banco de dados = db_teste.
        String url = "jdbc:mysql://localhost:3306/db_teste";
        String user = "root";
        String password = "";
    
        try
        {
            Class.forName(driver);
            //O método getConnection serve para estabelecer a conexão com
            //o banco de dados utilizando os parâmetros url, usuário e senha,
            //para localizar o BD e validar a conexão.
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        }catch(Exception e)
        {
             //A linha abaixo serve para tratar a exceção que ocorrer.
            System.out.println(e);
            return null;
        }
    }
}
