package com.com3g.myPm.domaine;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users implements java.io.Serializable{

    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String info;
    private String info2;
    private String lastname;
    private String firstname;
    private Set<Authorities> authoritieses = new HashSet<Authorities>(0);
    private Set<Affectation> affectationsForUsersLm = new HashSet<Affectation>(0);
    private Set<Usertimesheet> usertimesheets = new HashSet<Usertimesheet>(0);
    private Set<Affectation> affectationsForUsersHr = new HashSet<Affectation>(0);
    private Set<Affectation> affectationsForUsersUsername = new HashSet<Affectation>(0);

    public Users() {
    }

    public Users(String username) {
	this.username = username;
    }

    public Users(String username, String password, String info, String info2, String lastname, String firstname,
	    Set<Authorities> authoritieses, Set<Affectation> affectationsForUsersLm, Set<Usertimesheet> usertimesheets,
	    Set<Affectation> affectationsForUsersHr, Set<Affectation> affectationsForUsersUsername) {
	this.username = username;
	this.password = password;
	this.info = info;
	this.info2 = info2;
	this.lastname = lastname;
	this.firstname = firstname;
	this.authoritieses = authoritieses;
	this.affectationsForUsersLm = affectationsForUsersLm;
	this.usertimesheets = usertimesheets;
	this.affectationsForUsersHr = affectationsForUsersHr;
	this.affectationsForUsersUsername = affectationsForUsersUsername;
    }

    @Id
    @Column(name = "username", unique = true, nullable = false, length = 45)
    public String getUsername() {
	return this.username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    @Column(name = "password", length = 45)
    public String getPassword() {
	return this.password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    @Column(name = "info", length = 500)
    public String getInfo() {
	return this.info;
    }

    public void setInfo(String info) {
	this.info = info;
    }

    @Column(name = "info2", length = 500)
    public String getInfo2() {
	return this.info2;
    }

    public void setInfo2(String info2) {
	this.info2 = info2;
    }

    @Column(name = "lastname", length = 45)
    public String getLastname() {
	return this.lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

    @Column(name = "firstname", length = 45)
    public String getFirstname() {
	return this.firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "users")
    public Set<Authorities> getAuthoritieses() {
	return this.authoritieses;
    }

    public void setAuthoritieses(Set<Authorities> authoritieses) {
	this.authoritieses = authoritieses;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usersByUsersLm")
    public Set<Affectation> getAffectationsForUsersLm() {
	return this.affectationsForUsersLm;
    }

    public void setAffectationsForUsersLm(Set<Affectation> affectationsForUsersLm) {
	this.affectationsForUsersLm = affectationsForUsersLm;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "users")
    public Set<Usertimesheet> getUsertimesheets() {
	return this.usertimesheets;
    }

    public void setUsertimesheets(Set<Usertimesheet> usertimesheets) {
	this.usertimesheets = usertimesheets;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usersByUsersHr")
    public Set<Affectation> getAffectationsForUsersHr() {
	return this.affectationsForUsersHr;
    }

    public void setAffectationsForUsersHr(Set<Affectation> affectationsForUsersHr) {
	this.affectationsForUsersHr = affectationsForUsersHr;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usersByUsersUsername")
    public Set<Affectation> getAffectationsForUsersUsername() {
	return this.affectationsForUsersUsername;
    }

    public void setAffectationsForUsersUsername(Set<Affectation> affectationsForUsersUsername) {
	this.affectationsForUsersUsername = affectationsForUsersUsername;
    }


}
