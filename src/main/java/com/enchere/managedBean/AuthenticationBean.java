package com.enchere.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enchere.Exceptions.BadCredentialException;
import com.enchere.models.Client;
import com.enchere.service.IClientManager;


@ManagedBean(name = "authBean")
@SessionScoped
@Component
public class AuthenticationBean {

	@Autowired
IClientManager iClientManager;
	

	private boolean loggedIn = false;
	
	
	private Client user = new Client();

	
	
	
	public String doLogIn() {

		
		String page = null;
		try {

			user = iClientManager.retrieveByCredentials(user.getLogin(),
					user.getMotDePasse());

			loggedIn = true;

			page= "pages/success?faces-redirect=true";
			
		} catch (BadCredentialException ex) {}
//			try {
//				user = journalisteDao.retrieveByCredentials(user.getLogin(),
//						user.getPwd());
//				if (((Journaliste) user).isActivate()) {
//					loggedIn = true;
//					return "welcome?faces-redirect=true";
//
//				} else {
//					return "notactivated";
//				}
//			} catch (BadCredentialException dd) {
//				try {
//					user = internauteDao.retrieveByCredentials(user.getLogin(),
//							user.getPwd());
//					loggedIn = true;
//					return "welcome?faces-redirect=true";
//				} catch (BadCredentialException rd) {
//
//					FacesContext.getCurrentInstance().addMessage(
//							"formLogin:authFormMsg",
//							new FacesMessage("Bad Credentials",
//									"Please fill in good ones"));
//					return "welcome?faces-redirect=true";
//				}
//			}
		//}
return page;
	}

	public String doLogOut() {
		user = new Client();
		loggedIn = false;
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		return "login?faces-redirect=true";
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Client getUser() {
		return user;
	}

	public void setUser(Client user) {
		this.user = user;
	}


}
