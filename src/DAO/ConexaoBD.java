
package DAO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBD {
    public Connection conectaBD(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/dbcr?user=root&passaword=";
            conn= DriverManager.getConnection(url);
           // JOptionPane.showMessageDialog(null, "conexao realizada com sucesso");
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"conexao" + erro.getMessage());
            
        }
        return conn;
    }
    
    
}
