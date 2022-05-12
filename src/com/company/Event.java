package com.company;

import java.util.Date;
import java.util.List;

public class Event {
    private Integer id;
    private Date date;
    private List<Damages> damages;
    private String eventPlace;
    private String course;

    public Event(Integer id, Date date, List<Damages> damages, String eventPlace, String course) {
        this.id = id;
        this.date = date;
        this.damages = damages;
        this.eventPlace = eventPlace;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Damages> getDamages() {
        return damages;
    }

    public void setDamages(List<Damages> damages) {
        this.damages = damages;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
