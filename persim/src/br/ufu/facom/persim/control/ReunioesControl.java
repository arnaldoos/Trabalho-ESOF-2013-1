/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.control;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.ReunioesDAO;
import br.ufu.facom.persim.model.Reunioes;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 *
 * @author Ricardo & Ludma
 */
public class ReunioesControl {
    public static void save (Reunioes trab){
        try {
            ReunioesDAO dao = new ReunioesDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            dao.save(trab, conn);
            conn.closeDB();
        } catch (SQLException e) {
            System.err.println("Problema ao salvar reuniao: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }
    
    public static Reunioes load (){
        try {
            ReunioesDAO dao = new ReunioesDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            Reunioes trabalho = dao.load(conn);
            conn.closeDB();
            return trabalho;
        } catch (SQLException e) {
            System.err.println("Problema ao recuperar info. de reuniao: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
        return null;
    }
    
    public static void remove (String descricao, String data){
        try {
            ReunioesDAO dao = new ReunioesDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            dao.remove(descricao,data,conn);
            conn.closeDB();
        } catch (SQLException e) {
            System.err.println("Problema ao deletar reuniao: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }

}
