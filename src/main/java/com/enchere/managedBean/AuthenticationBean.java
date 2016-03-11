package com.enchere.managedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enchere.Exceptions.BadCredentialException;
import com.enchere.models.Client;
import com.enchere.service.IClientManager;


@Component
@ManagedBean(name = "authBean")
public class AuthenticationBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	IClientManager iClientManager;

	private boolean loggedIn = false;

	private Client user = new Client();

	public String doLogIn() {

		String page = null;

			try {
				
				System.out.println("DEbut");

				user = iClientManager.retrieveByCredentials(user.getLogin(),
						user.getMotDePasse());
				
				System.out.println(user.getEmail());
			} catch (BadCredentialException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			loggedIn = true;

			page = "pages/index?faces-redirect=true";

	
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
