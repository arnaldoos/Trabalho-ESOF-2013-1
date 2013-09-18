/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.facom.persim.view;

import br.ufu.facom.persim.control.DisciplinaControl;
import br.ufu.facom.persim.model.Disciplina;
import br.ufu.facom.persim.model.Professor;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo & Ludma
 */
public class CadastroDisciplina extends javax.swing.JInternalFrame {

    String dia, horaAula, livros, horas, minutos, professor, professorEmail, sala, disciplina, disciplinaID;
    int contaLinhas = 0, contaLinhas2 = 0, linhaTabela, linhasTabela;
    List<String> horarios = new ArrayList<>();
    List<String> bibliografia = new ArrayList<>();
    /**
     * Creates new form Teste
     */
    public CadastroDisciplina() {
        initComponents();
        listaDiaSemana();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabBibliografia = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        nomeDisciplina = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        livro = new javax.swing.JTextField();
        addLivro = new javax.swing.JButton();
        remveLivro = new javax.swing.JButton();
        salaAula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeProfessor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailProfessor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addDiaHora = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDiaAula = new javax.swing.JTable();
        remvDiaHora = new javax.swing.JButton();
        diaSemana = new java.awt.Choice();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        idDisciplina = new javax.swing.JTextField();

        jLabel2.setText("Nome Disciplina:");

        tabBibliografia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Bibliografia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabBibliografia);
        tabBibliografia.getColumnModel().getColumn(0).setResizable(false);

        jLabel3.setText("Sala:");

        nomeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeDisciplinaActionPerformed(evt);
            }
        });

        jLabel10.setText("Livro:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cadastrar Disciplinas");

        addLivro.setText("Adicionar Livro");
        addLivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLivroActionPerformed(evt);
            }
        });

        remveLivro.setText("Remover Livro");
        remveLivro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remveLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remveLivroActionPerformed(evt);
            }
        });

        salaAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaAulaActionPerformed(evt);
            }
        });

        jLabel4.setText("Dia:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Professor");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Bibliografia");

        jLabel6.setText("Professor:");

        jLabel7.setText("Email:");

        jLabel5.setText("Horário:");

        addDiaHora.setText("Adicionar Dia/HoraAula");
        addDiaHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addDiaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiaHoraActionPerformed(evt);
            }
        });

        tabelaDiaAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Dia", "Hora/Aula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaDiaAula);
        tabelaDiaAula.getColumnModel().getColumn(0).setResizable(false);
        tabelaDiaAula.getColumnModel().getColumn(1).setResizable(false);

        remvDiaHora.setText("Remover Dia/HoraAula");
        remvDiaHora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remvDiaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remvDiaHoraActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLabel11.setText("Sigla Disciplina:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(livro))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btSalvar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btCancelar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(addDiaHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(remvDiaHora))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(addLivro)
                                .addGap(24, 24, 24)
                                .addComponent(remveLivro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(diaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salaAula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(84, 86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(salaAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(idDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(diaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addDiaHora)
                    .addComponent(remvDiaHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(emailProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addLivro)
                    .addComponent(remveLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeDisciplinaActionPerformed

    private void addLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLivroActionPerformed
        livros = livro.getText().toString();
        preencheBibliografia(livros);
        limpaBibliografia();
    }//GEN-LAST:event_addLivroActionPerformed

    private void remveLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remveLivroActionPerformed
        linhaTabela = tabBibliografia.getSelectedRow();
        removeBibliografia(linhaTabela);
    }//GEN-LAST:event_remveLivroActionPerformed

    private void salaAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaAulaActionPerformed

    private void addDiaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiaHoraActionPerformed
        dia = diaSemana.getSelectedItem().toString();
        horas = jSpinner1.getValue().toString();
        minutos = jSpinner2.getValue().toString();
        horaAula = horas+":"+minutos;
        //System.out.println("Dia "+dia+", hora/aula: "+horaAula+"!!");
        System.out.println("Hora "+horaAula+"!!");
        preencher_tabela(dia,horaAula);
    }//GEN-LAST:event_addDiaHoraActionPerformed

    private void remvDiaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remvDiaHoraActionPerformed
        linhaTabela = tabelaDiaAula.getSelectedRow();
        //System.out.println("Linha "+linhaTabela);
        removerDaTabela(linhaTabela);
    }//GEN-LAST:event_remvDiaHoraActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        gravarDisciplina();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GerenciamentoAtividadesAcademicas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btCancelarActionPerformed

    public void limpaBibliografia()
    {
        livro.setText("");
    }
    
    public void listaDiaSemana() {        
        diaSemana.addItem("Segunda");
        diaSemana.addItem("Terça");
        diaSemana.addItem("Quarta");
        diaSemana.addItem("Quinta");
        diaSemana.addItem("Sexta");
        diaSemana.addItem("Sabado");         
    }
    
    public void preencher_tabela(String dia, String horaAula) {
        //Conexao.conectar();        
        DefaultTableModel modelo = (DefaultTableModel) tabelaDiaAula.getModel();
        modelo.setNumRows(contaLinhas);
        modelo.addRow(new Object[]{dia,horaAula});
        contaLinhas++;
    } 
    
    public void removerDaTabela(int linha){
        DefaultTableModel modelo = (DefaultTableModel) tabelaDiaAula.getModel();
        modelo.removeRow(linha);
        contaLinhas--;
    }
    
    public void preencheBibliografia(String livro)
    {
        DefaultTableModel bibliografia = (DefaultTableModel) tabBibliografia.getModel();
        bibliografia.setNumRows(contaLinhas2);
        bibliografia.addRow(new Object[]{livro});
        contaLinhas2++;
    }
    
    public void removeBibliografia(int linha)
    {
        DefaultTableModel bibliografia = (DefaultTableModel) tabBibliografia.getModel();
        bibliografia.removeRow(linha);
        contaLinhas2--;
    }
    
    public void gravarDisciplina()
    {
        Disciplina ds = new Disciplina();
        sala = salaAula.getText().toString();
        professor = nomeProfessor.getText().toString();
        professorEmail = emailProfessor.getText().toString();
        disciplina = nomeDisciplina.getText().toString();
        disciplinaID = idDisciplina.getText().toString();
        Professor pf = new Professor(professor, professorEmail, sala);
        linhasTabela = tabelaDiaAula.getRowCount();
        System.out.println("LinhasTabela "+linhasTabela);
        while(linhasTabela>0)
        {            
            dia = tabelaDiaAula.getValueAt(linhasTabela-1, 0).toString();
            System.out.println("Dia "+dia);            
            horaAula = tabelaDiaAula.getValueAt(linhasTabela-1, 1).toString();
            System.out.println("Hora "+horaAula);
            ds = new Disciplina(disciplinaID, disciplina, pf, "");
            System.out.println("LinhasTabela "+linhasTabela);
            linhasTabela--;
        }
        linhasTabela = tabBibliografia.getRowCount();
        while(linhasTabela>0)
        {
            livros = tabBibliografia.getValueAt(linhasTabela-1, 0).toString();
            System.out.println("Livro "+livros);
            bibliografia.add(livros);
            linhasTabela--;
        }
        ds.setBibliografia(bibliografia);
        DisciplinaControl.save(ds);
        System.out.println("Gravou");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDiaHora;
    private javax.swing.JButton addLivro;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private java.awt.Choice diaSemana;
    private javax.swing.JTextField emailProfessor;
    private javax.swing.JTextField idDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField livro;
    private javax.swing.JTextField nomeDisciplina;
    private javax.swing.JTextField nomeProfessor;
    private javax.swing.JButton remvDiaHora;
    private javax.swing.JButton remveLivro;
    private javax.swing.JTextField salaAula;
    private javax.swing.JTable tabBibliografia;
    private javax.swing.JTable tabelaDiaAula;
    // End of variables declaration//GEN-END:variables
}
