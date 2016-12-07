package com.eugenefe.bean;


import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class NavigationBean implements Serializable {

	public NavigationBean() {
	}
	
	public String goToDataViewer(){
		
		
		return "/view/v900DataNavigation";
//		return "/navi/NCM_MST_SAA_CODE";
//		return "pretty:viewCategory";
	}
	
	
	public void viewaction(){
		
		System.out.println("view Action");
	}

}
