package com.com3g.myPm.domaine;
// Generated 12 ao�t 2012 17:58:00 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Wtr generated by hbm2java
 */
@Entity
@Table(name="wtr"
    ,catalog="mypm"
)
public class Wtr  implements java.io.Serializable {


     private Integer idwtr;
     private Project project;
     private Date dateWtr;
     private Double duration;

    public Wtr() {
    }

    public Wtr(Project project, Date dateWtr, Double duration) {
       this.project = project;
       this.dateWtr = dateWtr;
       this.duration = duration;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idwtr", unique=true, nullable=false)
    public Integer getIdwtr() {
        return this.idwtr;
    }
    
    public void setIdwtr(Integer idwtr) {
        this.idwtr = idwtr;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="project_idProject")
    public Project getProject() {
        return this.project;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="dateWtr", length=10)
    public Date getDateWtr() {
        return this.dateWtr;
    }
    
    public void setDateWtr(Date dateWtr) {
        this.dateWtr = dateWtr;
    }
    
    @Column(name="duration", precision=22, scale=0)
    public Double getDuration() {
        return this.duration;
    }
    
    public void setDuration(Double duration) {
        this.duration = duration;
    }




}


