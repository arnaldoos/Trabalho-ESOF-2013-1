package br.ufu.facom.persim.control;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.EventoDAO;
import br.ufu.facom.persim.model.Evento;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class EventoControl {
    
    public static void save (Evento evento){
        try {
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            EventoDAO dao = new EventoDAO();
            dao.save(evento, conn);
            conn.closeDB();
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (SQLException e) {
            System.err.println("Problema ao salvar o evento: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }
}
