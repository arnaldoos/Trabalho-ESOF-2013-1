package br.ufu.facom.persim.view;

import com.javaswingcomponents.calendar.JSCCalendar;
import com.javaswingcomponents.calendar.plaf.darksteel.DarkSteelCalendarUI;
import com.javaswingcomponents.calendar.plaf.darksteel.DarkSteelCellPanel;
import com.javaswingcomponents.calendar.plaf.darksteel.DarkSteelCellPanelBackgroundPainter;
import com.javaswingcomponents.calendar.plaf.darksteel.DarkSteelMonthAndYearPanel;
import java.awt.Color;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JInternalFrame;

/*
 *  IFrame do calendario sobre o desktop
 */

public class CalendarIFrame extends JInternalFrame{
    
    public CalendarIFrame () {
        this.createCalendar();
        this.setIFrameConfigurations();
    }
    
    private void createCalendar() {
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.getDefault();
        
        this.calendar = new JSCCalendar(timeZone, locale);
        this.calendar.setUI(new DarkSteelCalendarUI());
        this.calendar.setBounds(0, 0, 400, 250);
        
        DarkSteelCalendarUI calendarUI = (DarkSteelCalendarUI) this.calendar.getUI();
        DarkSteelMonthAndYearPanel monthAndYearPanel = (DarkSteelMonthAndYearPanel) calendarUI.getMonthAndYearPanel();
        DarkSteelCellPanel cellPanel = (DarkSteelCellPanel) calendarUI.getCellPanel();
        DarkSteelCellPanelBackgroundPainter cellPanelBackgroundPainter =
                (DarkSteelCellPanelBackgroundPainter) cellPanel.getBackgroundPainter();
        cellPanelBackgroundPainter.setHeadingBackgroundStartGradientColor(new Color(0xB0, 0xE0, 0xE6));
        cellPanelBackgroundPainter.setHeadingBackgroundEndGradientColor(new Color(0x46, 0x82, 0xB4));
        
        this.calendar.setCalendarCellRenderer(new CalendarRenderer());
        this.add(calendar);
    }
    
    private void setIFrameConfigurations() {
        this.setTitle("Calendário");
        this.setBounds(this.calendar.getBounds());
        this.setIconifiable(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    
    private JSCCalendar calendar;
}
