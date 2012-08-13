package com.com3g.myPm.domaine.types;

import java.io.Serializable;

public enum EtatEntretien implements Serializable {

    NEW("New"),
    CANCELED("Canceled"),
    APPROVED("Approved"),
    COMPLETED("Completed");
    
    String value;

    private EtatEntretien(String value) {
	this.value = value;
    }

    public String getValue() {
	return value;
    }

}
