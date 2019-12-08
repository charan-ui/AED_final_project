/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Charan
 */
public class MasterSchedule {
    private List<Schedule> masterSchedule;
    public MasterSchedule() {
        masterSchedule = new ArrayList<>();
    }

    public List<Schedule> getMasterSchedule() {
        return masterSchedule;
    }

    public void setMasterSchedule(List<Schedule> masterSchedule) {
        this.masterSchedule = masterSchedule;
    }
    
    public Schedule addOrGetSchedule(Date date) {
        SimpleDateFormat smf = new SimpleDateFormat("yyyyMMdd");
        String d = smf.format(date);
        System.out.println("DATE="+d);
       for(Schedule s: masterSchedule) {
           String sDate = smf.format(s.getDate());
           System.out.println("date="+sDate);
           if(sDate.equals(d)) {
               System.out.println("MATCH");
               return s;
           }
       }
       Schedule s = new Schedule(date);
       masterSchedule.add(s);
       return s;
    }
}
