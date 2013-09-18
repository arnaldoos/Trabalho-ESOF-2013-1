/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.control;
import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.TrabalhosDAO;
import br.ufu.facom.persim.model.Trabalhos;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ricardo & Ludma
 */
public class TrabalhosControl {
    public static void save (Trabalhos trab){
        try {
            TrabalhosDAO dao = new TrabalhosDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            dao.save(trab, conn);
            conn.closeDB();
        } catch (SQLException e) {
            System.err.println("Problema ao salvar trabalho: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }
    
    public static Trabalhos load (){
        try {
            TrabalhosDAO dao = new TrabalhosDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            Trabalhos trabalho = dao.load(conn);
            conn.closeDB();
            return trabalho;
        } catch (SQLException e) {
            System.err.println("Problema ao recuperar info. de disciplina: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
        return null;
    }
    
    public static void remove (String descricao, String data){
        try {
            TrabalhosDAO dao = new TrabalhosDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            dao.remove(descricao,data,conn);
            conn.closeDB();
        } catch (SQLException e) {
            System.err.println("Problema ao recuperar info. de disciplina: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }
}
