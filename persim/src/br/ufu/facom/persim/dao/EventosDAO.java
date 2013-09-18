/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.dao;

import br.ufu.facom.persim.model.Eventos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ricardo & Ludma
 */
public class EventosDAO {
    public void save (Eventos even, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "INSERT INTO eventos VALUES (?, ?, ?);";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, even.getDecricao());
        ps.setString(2, even.getDia());
        ps.setString(3, even.getHora());
        ps.execute();
    }
    
    public Eventos load (ConnectionSQLiteDAO conn) throws SQLException{        
        String query = "SELECT * FROM eventos;";        
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        return build(rs);
    }
    
    public void remove (String descricao, String data, String hora, ConnectionSQLiteDAO conn) throws SQLException
    {
        Eventos ds;
        String query = "delete from eventos where even_descricao = ? and even_data = ? and even_hora = ?;";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, descricao);
        ps.setString(2, data);
        ps.setString(3, hora);
        ps.execute();
    }
    
    private Eventos build (ResultSet rs) throws SQLException{
        Eventos ds = new Eventos();
        
        ds.setDescricao(rs.getString("even_descricao"));
        ds.setDia(rs.getString("even_data"));
        ds.setHora(rs.getString("even_hora"));
        
        return ds;
    }


}
