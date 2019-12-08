/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Charan
 */
public class Schedule {
    private Date date;
    private List<Time> schedule;
    
    public Schedule(Date date) {
        this.date = date;
        schedule = new ArrayList<>();
        schedule.add(new Time("10", "11"));
        schedule.add(new Time("11", "12"));
        schedule.add(new Time("12", "13"));
        schedule.add(new Time("13", "14"));
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Time> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Time> schedule) {
        this.schedule = schedule;
    }
    
    
}
