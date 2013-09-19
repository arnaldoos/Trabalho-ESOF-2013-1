package br.ufu.facom.persim.dao;

import br.ufu.facom.persim.model.Evento;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EventoDAO {
    
    public void save (Evento evento, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "INSERT INTO evento "
                + "(event_datahora, event_duracao, event_local, event_descricao)"
                + "VALUES(?, ?, ?, ?);";
        
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setTimestamp(1, evento.getDataHora());
        ps.setTimestamp(2, evento.getDuracao());
        ps.setString(3, evento.getLocal());
        ps.setString(4, evento.getDescricao());
        ps.execute();        
    }
}
