package org.manager;

import org.pom.Cancelpom;
import org.pom.Detailspom;
import org.pom.LoginPom;
import org.pom.Searchpom;


public class pageManager {

	private LoginPom loginPom;
	private Detailspom detailspom;
	private Searchpom searchPom;
	private Cancelpom cancelPom;

	public LoginPom getLoginPom() {
		return (loginPom==null)?loginPom=new LoginPom():loginPom;
	}

	public Detailspom getDetailspom() {
		return (detailspom==null)?detailspom=new Detailspom():detailspom;
		
	}

	public Searchpom getSearchPom() {
		return (searchPom==null)?searchPom=new Searchpom():searchPom;
	}

	public Cancelpom getCancelPom() {
		return (cancelPom==null)?cancelPom=new Cancelpom():cancelPom;
	}

}
