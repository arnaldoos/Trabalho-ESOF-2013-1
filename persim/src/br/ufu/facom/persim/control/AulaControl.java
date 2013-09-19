package br.ufu.facom.persim.control;

import br.ufu.facom.persim.dao.ConnectionSQLiteDAO;
import br.ufu.facom.persim.dao.AulaDAO;
import br.ufu.facom.persim.model.Aula;
import java.io.FileNotFoundException;
import java.sql.SQLException;


public class AulaControl {
    public static Aula load (String ID){
        try {
            AulaDAO dao = new AulaDAO();
            ConnectionSQLiteDAO conn = new ConnectionSQLiteDAO();
            Aula disciplina = (Aula) dao.load(ID, conn);
            conn.closeDB();
            return disciplina;
        } catch (SQLException e) {
            System.err.println("Problema ao recuperar info. de aula: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possivel encontrar plugin do banco de dados"+e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("Problema ao configurar banco de dados: "+e.getMessage());
        }
        return null;
    }
}
