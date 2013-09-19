package br.ufu.facom.persim.control;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.EventoDAO;
import br.ufu.facom.persim.model.Evento;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventoControl {
    
    private static EventoControl instance;
    private List<Evento> eventosDoMes;
    
    private EventoControl(List<Evento> eventos) {
        this.eventosDoMes = eventos;
    }
    
    public static EventoControl getInstance() {
        if (instance == null) {
            instance = new EventoControl(load());
        }
        return instance;
    }
    
    public static List<Evento> getEventos(){
        return getInstance().eventosDoMes;
    }
    
    public static void save (Evento evento){
        try {
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            EventoDAO dao = new EventoDAO();
            dao.save(evento, conn);
            conn.closeDB();
            EventoControl.getEventos().add(evento);
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (SQLException e) {
            System.err.println("Problema ao salvar o evento: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }
    
    private static List<Evento> load () {
        try {
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            EventoDAO dao = new EventoDAO();
            List<Evento> lista = dao.load(conn);
            conn.closeDB();
            return lista;
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (SQLException e) {
            System.err.println("Problema ao salvar o evento: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
        
        return new ArrayList<>();
    }
}
