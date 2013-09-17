/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.dao;
import br.ufu.facom.persim.model.ControleDisciplina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jakeline Bissani
 */
public class ControleDisciplinaDAO {

    public void save (ControleDisciplina ctr, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "INSERT INTO controle_disciplina VALUES (?, ?, ?, ?);";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, ctr.getDisc_id());
        ps.setFloat(2, ctr.getNotas());
        ps.setInt(3, ctr.getFaltas());
        ps.setString(4, ctr.getTrf_adicionais());
        ps.execute();
    }


public  ControleDisciplina load (String ID, ConnectionSQLiteDAO conn) throws SQLException{
        
        ControleDisciplina ctr;
        
        String query = "SELECT * FROM controle_disciplina LEFT OUTER JOIN disciplina "
                            + "controle_disciplina.disc_id = ?";
        
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, ID);
        ResultSet rs = ps.executeQuery();
        rs.next();
        ctr = build(rs);
 
        
        return ctr;
    }

private ControleDisciplina build (ResultSet rs) throws SQLException{
        ControleDisciplina ctr = new ControleDisciplina();
        
        ctr.setDisc_id(rs.getString("disc_id"));
        ctr.setNotas(rs.getFloat("notas"));
        ctr.setFaltas(rs.getInt("nro_faltas"));
        ctr.setTrf_adicionais(rs.getString("tarefas_adicionais"));
        
        
        return ctr;
    }
}