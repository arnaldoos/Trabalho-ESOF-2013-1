/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.dao;
import br.ufu.facom.persim.model.Trabalhos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo & Ludma
 */
public class TrabalhosDAO {
    public void save (Trabalhos trab, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "INSERT INTO trabalhos VALUES (?, ?);";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, trab.getDecricao());
        ps.setString(2, trab.getDia());
        ps.execute();
    }
    
    public Trabalhos load (ConnectionSQLiteDAO conn) throws SQLException{        
        String query = "SELECT * FROM trabalhos;";        
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        return build(rs);
    }
    
    public void remove (String descricao, String data, ConnectionSQLiteDAO conn) throws SQLException
    {
        Trabalhos ds;
        String query = "delete from trabalhos where trab_descricao = ? and trab_dia = ?;";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, descricao);
        ps.setString(2, data);
        ps.execute();
    }
    
    private Trabalhos build (ResultSet rs) throws SQLException{
        Trabalhos ds = new Trabalhos();        
        
        ds.setDescricao(rs.getString("trab_descricao"));
        ds.setDia(rs.getString("trab_dia"));
        
        return ds;
    }
}
