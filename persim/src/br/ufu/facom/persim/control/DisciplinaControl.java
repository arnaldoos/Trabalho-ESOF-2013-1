package br.ufu.facom.persim.control;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.DisciplinaDAO;
import br.ufu.facom.persim.model.Disciplina;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class DisciplinaControl {
    
    public static void save (Disciplina disc){
        try {
            DisciplinaDAO dao = new DisciplinaDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            dao.save(disc, conn);
            conn.closeDB();
        } catch (SQLException e) {
            System.err.println("Problema ao salvar disciplina: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
    }
    
    public static Disciplina load (String ID){
        try {
            DisciplinaDAO dao = new DisciplinaDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            Disciplina disciplina = dao.load(ID, conn);
            conn.closeDB();
            return disciplina;
        } catch (SQLException e) {
            System.err.println("Problema ao recuperar info. de disciplina: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
        return null;
    }
}
