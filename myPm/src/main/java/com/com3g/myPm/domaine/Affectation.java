package com.com3g.myPm.domaine;
// Generated 12 ao�t 2012 17:58:00 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Affectation generated by hbm2java
 */
@Entity
@Table(name="affectation")
public class Affectation  implements java.io.Serializable {


     private Integer idaffectation;
     private Users usersByUsersHr;
     private Lob lob;
     private Users usersByUsersLm;
     private Users usersByUsersUsername;

    public Affectation() {
    }

	
    public Affectation(Users usersByUsersUsername) {
        this.usersByUsersUsername = usersByUsersUsername;
    }
    public Affectation(Users usersByUsersHr, Lob lob, Users usersByUsersLm, Users usersByUsersUsername) {
       this.usersByUsersHr = usersByUsersHr;
       this.lob = lob;
       this.usersByUsersLm = usersByUsersLm;
       this.usersByUsersUsername = usersByUsersUsername;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idaffectation", unique=true, nullable=false)
    public Integer getIdaffectation() {
        return this.idaffectation;
    }
    
    public void setIdaffectation(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="users_hr")
    public Users getUsersByUsersHr() {
        return this.usersByUsersHr;
    }
    
    public void setUsersByUsersHr(Users usersByUsersHr) {
        this.usersByUsersHr = usersByUsersHr;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="lob_idlob")
    public Lob getLob() {
        return this.lob;
    }
    
    public void setLob(Lob lob) {
        this.lob = lob;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="users_lm")
    public Users getUsersByUsersLm() {
        return this.usersByUsersLm;
    }
    
    public void setUsersByUsersLm(Users usersByUsersLm) {
        this.usersByUsersLm = usersByUsersLm;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="users_username", nullable=false)
    public Users getUsersByUsersUsername() {
        return this.usersByUsersUsername;
    }
    
    public void setUsersByUsersUsername(Users usersByUsersUsername) {
        this.usersByUsersUsername = usersByUsersUsername;
    }




}


