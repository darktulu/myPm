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
 * Bankaccount generated by hbm2java
 */
@Entity
@Table(name="bankaccount"
    ,catalog="mypm"
)
public class Bankaccount  implements java.io.Serializable {


     private Integer idbankAccount;
     private Company company;
     private String bank;
     private String status;
     private String rib;
     private String type;
     private String swiftCode;
     private String manager;

    public Bankaccount() {
    }

	
    public Bankaccount(Company company) {
        this.company = company;
    }
    public Bankaccount(Company company, String bank, String status, String rib, String type, String swiftCode, String manager) {
       this.company = company;
       this.bank = bank;
       this.status = status;
       this.rib = rib;
       this.type = type;
       this.swiftCode = swiftCode;
       this.manager = manager;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idbankAccount", unique=true, nullable=false)
    public Integer getIdbankAccount() {
        return this.idbankAccount;
    }
    
    public void setIdbankAccount(Integer idbankAccount) {
        this.idbankAccount = idbankAccount;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_idcompany", nullable=false)
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    
    @Column(name="bank", length=45)
    public String getBank() {
        return this.bank;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }
    
    @Column(name="status", length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="rib", length=450)
    public String getRib() {
        return this.rib;
    }
    
    public void setRib(String rib) {
        this.rib = rib;
    }
    
    @Column(name="type", length=45)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    @Column(name="swiftCode", length=450)
    public String getSwiftCode() {
        return this.swiftCode;
    }
    
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }
    
    @Column(name="manager", length=45)
    public String getManager() {
        return this.manager;
    }
    
    public void setManager(String manager) {
        this.manager = manager;
    }




}


