/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.dao;

import br.ufu.facom.persim.model.Reunioes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ricardo & Ludma
 */
public class ReunioesDAO {
    public void save (Reunioes trab, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "INSERT INTO reunioes VALUES (?, ?);";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, trab.getDecricao());
        ps.setString(2, trab.getDia());
        ps.execute();
    }
    
    public Reunioes load (ConnectionSQLiteDAO conn) throws SQLException{        
        String query = "SELECT * FROM reunioes;";        
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        return build(rs);
    }
    
    public void remove (String descricao, String data, ConnectionSQLiteDAO conn) throws SQLException
    {
        Reunioes ds;
        String query = "delete from reunioes where reun_descricao = ? and reun_dia = ?;";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, descricao);
        ps.setString(2, data);
        ps.execute();
    }
    
    private Reunioes build (ResultSet rs) throws SQLException{
        Reunioes ds = new Reunioes();
        
        ds.setDescricao(rs.getString("reun_descricao"));
        ds.setDia(rs.getString("reun_dia"));
        
        return ds;
    }

}
