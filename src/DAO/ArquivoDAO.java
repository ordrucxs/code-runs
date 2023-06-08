
package DAO;

import DTO.ArquivoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ArquivoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public void InserirPecasFasesUm(ArquivoDTO arquivodto) {
    String sqlUpdate = "UPDATE faseum SET peca_um=?, peca_dois=?, peca_tres=?, peca_quatro=?, peca_cinco=?, peca_seis=?, total_pecas=? WHERE id=100";
    String sqlInsert = "INSERT INTO faseum(id, peca_um, peca_dois, peca_tres, peca_quatro, peca_cinco, peca_seis, total_pecas) VALUES (100, ?, ?, ?, ?, ?, ?, ?)";
    conn = new ConexaoBD().conectaBD();

    String buscar = "SELECT * FROM faseum WHERE id=100";

    try {
        pstm = conn.prepareStatement(buscar);
        rs = pstm.executeQuery();

        if (rs.next() && rs.getInt("id") == 100) {
            
            pstm = conn.prepareStatement(sqlUpdate);
            pstm.setInt(1, arquivodto.getUmpeca_um());
            pstm.setInt(2, arquivodto.getUmpeca_dois());
            pstm.setInt(3, arquivodto.getUmpeca_tres());
            pstm.setInt(4, arquivodto.getUmpeca_quatro());
            pstm.setInt(5, arquivodto.getUmpeca_cinco());
            pstm.setInt(6, arquivodto.getUmpeca_seis());
            pstm.setInt(7, arquivodto.getTotal_pecasum());
            pstm.executeUpdate();
            pstm.close();
        } else {
            
            pstm = conn.prepareStatement(sqlInsert);
            pstm.setInt(1, arquivodto.getUmpeca_um());
            pstm.setInt(2, arquivodto.getUmpeca_dois());
            pstm.setInt(3, arquivodto.getUmpeca_tres());
            pstm.setInt(4, arquivodto.getUmpeca_quatro());
            pstm.setInt(5, arquivodto.getUmpeca_cinco());
            pstm.setInt(6, arquivodto.getUmpeca_seis());
            pstm.setInt(7, arquivodto.getTotal_pecasum());
            pstm.executeUpdate();
            pstm.close();
        }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de conexão: " + erro.getMessage());
    }
}
    
    public void InserirPecasFasesDois(ArquivoDTO arquivodto){
    String sqlUpdate = "UPDATE fasedois SET peca_um=?, peca_dois=?, peca_tres=?, peca_quatro=?, peca_cinco=?, peca_seis=?, total_pecas=? WHERE id=1";
    String sqlInsert = "INSERT INTO fasedois(id, peca_um, peca_dois, peca_tres, peca_quatro, peca_cinco, peca_seis, total_pecas) VALUES (1, ?, ?, ?, ?, ?, ?, ?)";
    conn = new ConexaoBD().conectaBD();

    String buscar = "SELECT * FROM fasedois WHERE id=1";

    try{
        
        pstm = conn.prepareStatement(buscar);
        rs = pstm.executeQuery();

        if (rs.next() && rs.getInt("id") == 1) {
 
    pstm= conn.prepareStatement(sqlUpdate);

    pstm.setInt(1, arquivodto.getDoispeca_um());
    pstm.setInt(2, arquivodto.getDoispeca_dois());
    pstm.setInt(3, arquivodto.getDoispeca_tres());
    pstm.setInt(4, arquivodto.getDoispeca_quatro());
    pstm.setInt(5, arquivodto.getDoispeca_cinco());
    pstm.setInt(6, arquivodto.getDoispeca_seis());
    pstm.setInt(7, arquivodto.getTotal_pecasdois());
    pstm.executeUpdate();
    pstm.close();
    
    }else {
            
            pstm = conn.prepareStatement(sqlInsert);
            pstm.setInt(1, arquivodto.getDoispeca_um());
            pstm.setInt(2, arquivodto.getDoispeca_dois());
            pstm.setInt(3, arquivodto.getDoispeca_tres());
            pstm.setInt(4, arquivodto.getDoispeca_quatro());
            pstm.setInt(5, arquivodto.getDoispeca_cinco());
            pstm.setInt(6, arquivodto.getDoispeca_seis());
            pstm.setInt(7, arquivodto.getTotal_pecasdois());
            pstm.executeUpdate();
            pstm.close();
        }
    }catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de conexão: " + erro.getMessage());
    }
    }
    public void InserirPecasFasesTres(ArquivoDTO arquivodto){
    
    String sqlUpdate = "UPDATE fasetres SET peca_um=?, peca_dois=?, peca_tres=?, peca_quatro=?, total_pecas=? WHERE id=1";
    String sqlInsert = "INSERT INTO fasetres(id, peca_um, peca_dois, peca_tres, peca_quatro, total_pecas) VALUES (1, ?, ?, ?, ?, ?)";
    conn = new ConexaoBD().conectaBD();
    
    String buscar = "SELECT * FROM fasetres WHERE id=1";
    try{
   
        pstm = conn.prepareStatement(buscar);
        rs = pstm.executeQuery();

        if (rs.next() && rs.getInt("id") == 1) {
 
    pstm= conn.prepareStatement(sqlUpdate);
    pstm.setInt(1, arquivodto.getTrespecadois());
    pstm.setInt(2, arquivodto.getTrespeca_dois());
    pstm.setInt(3, arquivodto.getTrespeca_tres());
    pstm.setInt(5, arquivodto.getTrespeca_quatro());
    pstm.setInt(4, arquivodto.getTotal_pecastres());
    pstm.executeUpdate();
    pstm.close();
    
        }else{
    pstm= conn.prepareStatement(sqlInsert);
    pstm.setInt(1, arquivodto.getTrespecadois());
    pstm.setInt(2, arquivodto.getTrespeca_dois());
    pstm.setInt(3, arquivodto.getTrespeca_tres());
    pstm.setInt(4, arquivodto.getTrespeca_quatro());
    pstm.setInt(5, arquivodto.getTotal_pecastres());
    pstm.executeUpdate();
    pstm.close();
        
        }
    }catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro de conexão: " + erro.getMessage());
    }
    }
    
    public ResultSet Listarfaseum(){
    conn= new ConexaoBD().conectaBD();
    String sql= "SELECT * FROM faseum WHERE id=100 AND total_pecas =6 ";
    try{
    pstm=conn.prepareStatement(sql);
    rs= pstm.executeQuery();
    if(rs.next())
    return rs;
    else
        return null;
    
    }catch (SQLException erro) {
       JOptionPane.showMessageDialog(null, "Erro de conexão: " + erro.getMessage());
       return null;
    }
    }
    public ResultSet Listarfasedois(){
    conn= new ConexaoBD().conectaBD();
    String sql= "SELECT * FROM fasedois WHERE id=1 AND total_pecas = 6";
    try{
    pstm=conn.prepareStatement(sql);
    rs= pstm.executeQuery();
    if(rs.next())
    return rs;
    else
        return null;
    
    
    
    }catch (SQLException erro) {
       JOptionPane.showMessageDialog(null, "Erro de conexão: " + erro.getMessage());
       return null;
    }
}
}
