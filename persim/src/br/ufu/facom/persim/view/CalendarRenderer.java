package br.ufu.facom.persim.view;

import br.ufu.facom.persim.control.EventoControl;
import br.ufu.facom.persim.model.Evento;
import com.javaswingcomponents.calendar.JSCCalendar;
import com.javaswingcomponents.calendar.cellrenderers.CalendarCellRenderer;
import com.javaswingcomponents.calendar.cellrenderers.CellRendererComponentParameter;
import java.awt.Color;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/*
 * Alteracoes sobre o formato e cor do calendario sao controladas por esta classe
 */

public class CalendarRenderer extends JLabel implements CalendarCellRenderer {
    
    private Evento[] eventoMes;
    private int mesCorrente;
    private JTextArea textArea;
    
    public CalendarRenderer (JTextArea text) {
        this.mesCorrente = 0;
        this.textArea = text;
    }
    
    @Override
    public JComponent getCellRendererComponent(CellRendererComponentParameter parameterObject) {
        boolean isToday = parameterObject.isToday;
        boolean isSelected = parameterObject.isSelected;
        boolean isSelectable = parameterObject.isAllowSelection();
        boolean hasKeyboardFocus = parameterObject.isHasFocus();
        boolean isCurrentMonth = parameterObject.isCurrentMonth;
        
        String text = parameterObject.getText();
        Date date = parameterObject.getDate();
        String[] datestr = (new Timestamp(date.getTime())).toString().split("[^0-9]");
        int mes = Integer.parseInt(datestr[1]);
        int dia = Integer.parseInt(datestr[2]);
        //JSCCalendar calendar = parameterObject.getCalendar();
        
        if (isCurrentMonth){
            if (mes != this.mesCorrente){
                this.mesCorrente = mes;
                System.out.println(mes);
                updateEventosDoMes();
            }            
        }
        
        setHorizontalAlignment(JLabel.CENTER);
        setText(text);
        setOpaque(false);
        
        if (isSelectable) {
            setForeground(Color.BLACK);
        } else {
            setText(text);
            setForeground(Color.LIGHT_GRAY);
        }
        
        if (!isCurrentMonth) {
            setText("");
        }
        
        if (isSelected) {
            setBorder(BorderFactory.createDashedBorder(Color.BLACK, 3, 2));
            if ((this.eventoMes[dia-1] != null) && isCurrentMonth){
                textArea.setText(this.eventoMes[dia-1].toString());
            }
            else{
                textArea.setText("");
            }
        } else {
            setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        }
        
        if (isToday && isCurrentMonth) {
            setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        
        if ((this.eventoMes[dia-1] != null) && isCurrentMonth){
            setBackground(Color.red);
            setOpaque(true);
        }

        if (hasKeyboardFocus) {
            setBorder(BorderFactory.createDashedBorder(Color.BLACK, 6, 2));
            setBackground(new Color(255,248,220));
            setOpaque(true);
        }
        return this;

    }

    @Override
    public JComponent getHeadingCellRendererComponent(JSCCalendar calendar, String text) {
        setHorizontalAlignment(JLabel.CENTER);
        setText(text);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setForeground(Color.BLACK);
        return this;
    }
    
    private void updateEventosDoMes () {
        this.eventoMes = new Evento[31];
        
        List<Evento> eventos = EventoControl.getEventos();
        for (Iterator<Evento> it = eventos.iterator(); it.hasNext();) {
            Evento evento = it.next();
            String[] time = evento.getDataHora().toString().split("[^0-9]");
            
            int mes = Integer.parseInt(time[1]);
            if (mes == this.mesCorrente)
            {
                int day = Integer.parseInt(time[2]);
                this.eventoMes[day-1] = evento;
            }
        }
    }
}
