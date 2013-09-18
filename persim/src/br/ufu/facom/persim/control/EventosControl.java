/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.control;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.EventosDAO;
import br.ufu.facom.persim.model.Eventos;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 *
 * @author Ricardo & Ludma
 */
public class EventosControl {
    public static void save (Eventos even){
        try {
            EventosDAO dao = new EventosDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            dao.save(even, conn);
            conn.closeDB();
        } catch (SQLException e) {
            System.err.println("Problema ao salvar evento: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }
    
    public static Eventos load (){
        try {
            EventosDAO dao = new EventosDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            Eventos evento = dao.load(conn);
            conn.closeDB();
            return evento;
        } catch (SQLException e) {
            System.err.println("Problema ao recuperar info. de evento: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
        return null;
    }
    
    public static void remove (String descricao, String data, String hora){
        try {
            EventosDAO dao = new EventosDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            dao.remove(descricao,data,hora,conn);
            conn.closeDB();
        } catch (SQLException e) {
            System.err.println("Problema ao deletar evento: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }


}
