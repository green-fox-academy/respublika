package com.greenfoxacademy.connectsql.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;
import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean urgent = false;
    private Boolean done = false;
    private Date crDate;
    private Date dDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;


    public Todo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.crDate = new Date();
        Random random = new Random();
        int randomDays = random.nextInt(101) + 10;
        this.dDate = new Date(crDate.getYear(), crDate.getMonth(), crDate.getDate() + randomDays);
    }

    public Todo(String title, Boolean urgent, Boolean done, Assignee assignee) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.crDate = new Date();
        Random random = new Random();
        int randomDays = random.nextInt(101) + 10;
        this.dDate = new Date(crDate.getYear(), crDate.getMonth(), crDate.getDate() + randomDays);
        this.assignee = assignee;
    }

    public Todo(String title) {
        this.title = title;
        this.crDate = new Date();
        Random random = new Random();
        int randomDays = random.nextInt(101) + 10;
        this.dDate = new Date(crDate.getYear(), crDate.getMonth(), crDate.getDate() + randomDays);
    }

    public Todo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Date getCrDate() {
        return crDate;
    }

    public void setCrDate(Date date) {
        this.crDate = crDate;
    }

    public Date getdDate() {
        return dDate;
    }

    public void setdDate(Date dDate) {
        this.dDate = dDate;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }
}
