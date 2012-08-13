package com.com3g.myPm.domaine.types;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    String label;

    private Gender(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

}
