package com.com3g.myPm.domaine.types;

import java.io.Serializable;

public enum EtatCandidature implements Serializable {

    NEW("New"),
    PENDING("Pending"),
    COMPLETED("Completed"),
    DELETED("Deleted");

    String value;

    private EtatCandidature(String value) {
	this.value = value;
    }

    public void setValue(String value) {
	this.value = value;
    }

}
