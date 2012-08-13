package com.com3g.myPm.domaine;
// Generated 12 ao�t 2012 17:58:00 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ManagementResponsabId generated by hbm2java
 */
@Embeddable
public class ManagementResponsabId  implements java.io.Serializable {


     private int mrId;
     private String employeAppraisals;

    public ManagementResponsabId() {
    }

    public ManagementResponsabId(int mrId, String employeAppraisals) {
       this.mrId = mrId;
       this.employeAppraisals = employeAppraisals;
    }
   

    @Column(name="Mr_Id", nullable=false)
    public int getMrId() {
        return this.mrId;
    }
    
    public void setMrId(int mrId) {
        this.mrId = mrId;
    }

    @Column(name="Employe_Appraisals", nullable=false, length=100)
    public String getEmployeAppraisals() {
        return this.employeAppraisals;
    }
    
    public void setEmployeAppraisals(String employeAppraisals) {
        this.employeAppraisals = employeAppraisals;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ManagementResponsabId) ) return false;
		 ManagementResponsabId castOther = ( ManagementResponsabId ) other; 
         
		 return (this.getMrId()==castOther.getMrId())
 && ( (this.getEmployeAppraisals()==castOther.getEmployeAppraisals()) || ( this.getEmployeAppraisals()!=null && castOther.getEmployeAppraisals()!=null && this.getEmployeAppraisals().equals(castOther.getEmployeAppraisals()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMrId();
         result = 37 * result + ( getEmployeAppraisals() == null ? 0 : this.getEmployeAppraisals().hashCode() );
         return result;
   }   


}

