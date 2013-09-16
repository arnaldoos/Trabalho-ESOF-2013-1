/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.control;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.ControleDisciplinaDAO;
import br.ufu.facom.persim.model.ControleDisciplina;
import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 *
 * @author Jakeline Bissani
 */
public class ControleDisciplinaControl {
    
    public static void save (ControleDisciplina disc) throws FileNotFoundException{
        try {
            ControleDisciplinaDAO dao = new ControleDisciplinaDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            dao.save(disc, conn);
            conn.closeDB();
        } catch (SQLException e) {
            System.err.println("Problema ao salvar o controle: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }
    
    public static ControleDisciplina load (String ID){
        try {
            ControleDisciplinaDAO dao = new ControleDisciplinaDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            ControleDisciplina ctr = dao.load(ID, conn);
            conn.closeDB();
            return ctr;
        } catch (SQLException e) {
            System.err.println("Problema ao recuperar controle de disciplina: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
        return null;
    }
    
}
