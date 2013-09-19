package br.ufu.facom.persim.dao;

import br.ufu.facom.persim.model.Aula;
import br.ufu.facom.persim.model.Disciplina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AulaDAO {
   
   public void save (Disciplina disc, ConnectionSQLiteDAO conn) throws SQLException {
        if (disc.getAulas() != null){
            for (Iterator it = disc.getAulas().iterator();it.hasNext();) {
                //Iterator itt = disc.getAula().iterator();
                Aula aula = (Aula) it.next();        
                //String hora = (String) itt.next();
                String query = "INSERT INTO aula (fk_disc_id,aula_horario,aula_diasemana) VALUES (?, ?, ?);";
                PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
                ps.setString(1, disc.getID());
                ps.setString(2, aula.getHorario());
                ps.setString(3, aula.getDiaSemana());
                ps.execute();
            }
        }
    }
    
    public List<String> load (String ID, ConnectionSQLiteDAO conn) throws SQLException{       
        String query = "SELECT * FROM aula where fk_disc_id = ?;";
        
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, ID);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return build(rs);
    }
    
    public void delete (String idDisc, ConnectionSQLiteDAO conn) throws SQLException{
        String query = "DELETE FROM aula WHERE fk_disc_id LIKE ?;";
        PreparedStatement ps = conn.getDBConnection().prepareStatement(query);
        ps.setString(1, idDisc);
        ps.execute();
    }
    
    private List<String> build (ResultSet rs) throws SQLException {
        List<String> aulas = new ArrayList<>();
        while(rs.next()) {
            aulas.add(rs.getString("aula_horario"));
            aulas.add(rs.getString("aula_diasemana"));
        }
        if (aulas.isEmpty()) {
            return null;
        }
        else {
            return aulas;
        }
    }
}
