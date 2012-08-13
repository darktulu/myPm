package com.com3g.myPm.view.utils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.security.core.context.SecurityContextHolder;

@ManagedBean
@SessionScoped
public class UserSessionBean {

    private String username;

    public String getUsername() {
	if ("".equals(username))
	    username = SecurityContextHolder.getContext().getAuthentication().getName();
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

}
