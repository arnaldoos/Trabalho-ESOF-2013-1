package br.ufu.facom.persim.view;

import br.ufu.facom.persim.control.DisciplinaControl;
import br.ufu.facom.persim.model.Disciplina;
import br.ufu.facom.persim.model.Professor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Classe temporaria para testes e simulacoes
 */
public class Tester {
    
    public static void main (String[] args){
        testeGravaDisciplina();
        testeLoadDisciplina();
    }
    
    public static void testeGravaDisciplina(){
        System.out.println("------------GRAVANDO---------------");
        Professor pf = new Professor("Maia", "lala@lala", "1b90");
        Disciplina ds = new Disciplina("ESOF", "Eng.Soft", pf , "bazingations");
        List<String> ls = new ArrayList<>();
        ls.add("bib1");
        ls.add("bib2");
        ds.setBibliografia(ls);
        
        DisciplinaControl.save(ds);
        
        
        System.out.println("prof: "+ds.getProfessor().getNome()+" <- "+
                ds.getProfessor().getEmail()+" <- "+ds.getProfessor().getSala());
        System.out.println("ds: "+ds.getID()+" <- "+ds.getNome()+" <- "+ds.getAdicionais());

        for (Iterator<String> it = ds.getBibliografia().iterator(); it.hasNext();) {
            String string = it.next();
            System.out.println("Bibliografia -> "+string);
        }
    }
    
    public static void testeLoadDisciplina() {
        System.out.println("------------RECUPERANDO------------");
        Disciplina ds = DisciplinaControl.load("ESOF");
        
        System.out.println("prof: "+ds.getProfessor().getNome()+" <- "+
                ds.getProfessor().getEmail()+" <- "+ds.getProfessor().getSala());
        System.out.println("ds: "+ds.getID()+" <- "+ds.getNome()+" <- "+ds.getAdicionais());

        for (Iterator<String> it = ds.getBibliografia().iterator(); it.hasNext();) {
            String string = it.next();
            System.out.println("Bibliografia -> "+string);
        }
    }
}
