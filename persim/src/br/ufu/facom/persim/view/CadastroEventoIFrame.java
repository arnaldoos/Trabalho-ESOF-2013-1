package br.ufu.facom.persim.view;

import br.ufu.facom.persim.control.DisciplinaControl;
import br.ufu.facom.persim.control.EventoControl;
import br.ufu.facom.persim.model.Disciplina;
import br.ufu.facom.persim.model.Evento;
import br.ufu.facom.persim.model.EventoAvaliativo;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class CadastroEventoIFrame extends javax.swing.JInternalFrame {

    public CadastroEventoIFrame() {
        initComponents();
        this.setupIframeConfigs();
        this.dataChooser.setDateFormatString("dd/MM/yyyy");
        this.setupDiscChooser();
    }
    
    public CadastroEventoIFrame(Date date) {
        initComponents();
        this.setupIframeConfigs();
        this.dataChooser.setDateFormatString("dd/MM/yyyy");
        this.dataChooser.setDate(date);
    }
    private void setupDiscChooser(){
        this.discChooser.setModel(new DefaultComboBoxModel(DisciplinaControl.getDisciplinas().toArray()));
    }
    
    private void setupIframeConfigs(){
        this.setTitle("Criar Eventos");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setClosable(true);
        if (DisciplinaControl.getDisciplinas().isEmpty()){
            this.avaliativoChoose.setEnabled(false);
        }
        this.discChooser.setEnabled(false);
        this.tipoText.setEnabled(false);
        this.lblDisc.setEnabled(false);
        this.lblTipo.setEnabled(false);
        
        this.descricaoText.addKeyListener(new LimitDigitsListener(200, this.descricaoText));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void clearAllFields(){
        this.descricaoText.setText("");
        this.dataChooser.setDate(null);
        this.horaSpinner.setValue(0);
        this.minSpinner.setValue(0);
        this.horaSpinnerDur.setValue(0);
        this.minSpinnerDur.setValue(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        dataChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoText = new javax.swing.JTextPane();
        horaSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        minSpinner = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblTipo = new javax.swing.JLabel();
        lblDisc = new javax.swing.JLabel();
        discChooser = new javax.swing.JComboBox();
        avaliativoChoose = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        horaSpinnerDur = new javax.swing.JSpinner();
        minSpinnerDur = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tipoText = new javax.swing.JComboBox();

        setTitle("Criando Eventos");

        jLabel1.setText("Descrição:");

        jLabel3.setText("Data:");

        jLabel4.setText("Horário:");

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Salvar");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(descricaoText);

        horaSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        jLabel5.setText(":");

        minSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        lblTipo.setText("Tipo:");

        lblDisc.setText("Disciplina:");

        avaliativoChoose.setText("Marque se deseja criar um evento de avaliação");
        avaliativoChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliativoChooseActionPerformed(evt);
            }
        });

        jLabel6.setText("Duracao do evento:");

        horaSpinnerDur.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        minSpinnerDur.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel7.setText(":");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 19, 19));
        jLabel2.setText("(i.e. provas, trabalhos.)");

        tipoText.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Exercício", "Trabalho", "Prova", "Seminário", "Extras", "Outros..." }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(minSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaSpinnerDur, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(minSpinnerDur, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(avaliativoChoose)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoText, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDisc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(discChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(minSpinner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(horaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minSpinnerDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(horaSpinnerDur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(avaliativoChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(lblDisc)
                    .addComponent(discChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(saveBtn))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void avaliativoChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliativoChooseActionPerformed
        this.discChooser.setEnabled(!this.discChooser.isEnabled());
        this.lblDisc.setEnabled(!this.lblDisc.isEnabled());
        this.tipoText.setEnabled(!this.tipoText.isEnabled());
        this.lblTipo.setEnabled(!this.lblTipo.isEnabled());
    }//GEN-LAST:event_avaliativoChooseActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        try {
            Evento evento;
            
            if (this.avaliativoChoose.isSelected()){
                evento = new EventoAvaliativo();
            }
            else{
                evento = new Evento();
            }
            String str = (new Timestamp(this.dataChooser.getDate().getTime())).toString().split(" ")[0];
            
            String str1 = (int)this.horaSpinner.getValue()+":"+(int)this.minSpinner.getValue();
            String str2 = (int)this.horaSpinnerDur.getValue()+":"+(int)this.minSpinnerDur.getValue();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
            Date dt = sdf.parse(str + " " + str1+":00");
            Date de = sdf2.parse(str2+":00");
            evento.setDataHora(new Timestamp(dt.getTime()));
            evento.setDescricao(this.descricaoText.getText());
            evento.setDuracao(new Timestamp(de.getTime()));
            
            if (this.avaliativoChoose.isSelected()){
                Disciplina disc = (Disciplina)this.discChooser.getSelectedItem();
                EventoAvaliativo event = (EventoAvaliativo) evento;
                event.setTipo((String) this.tipoText.getSelectedItem());
                event.setDescricao(" ("+event.getTipo()+" de "+disc.getNome()+")\n"+event.getDescricao());
                EventoControl.save((EventoAvaliativo) event, disc);
                disc.getEventos().add((EventoAvaliativo)event);
            }
            else{
                EventoControl.save(evento);
            }
            
            this.clearAllFields();
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Campos com valores invalidos para criar novo evento.", "ops!", JOptionPane.OK_OPTION);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "O campo de data não foi preenchido!", "ops!", JOptionPane.OK_OPTION);
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox avaliativoChoose;
    private javax.swing.JButton cancelBtn;
    private com.toedter.calendar.JDateChooser dataChooser;
    private javax.swing.JTextPane descricaoText;
    private javax.swing.JComboBox discChooser;
    private javax.swing.JSpinner horaSpinner;
    private javax.swing.JSpinner horaSpinnerDur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDisc;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JSpinner minSpinner;
    private javax.swing.JSpinner minSpinnerDur;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox tipoText;
    // End of variables declaration//GEN-END:variables
}
