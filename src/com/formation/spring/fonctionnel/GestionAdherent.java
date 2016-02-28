package com.formation.spring.fonctionnel;

import java.util.ArrayList;

import com.formation.spring.technique.*;

public class GestionAdherent {
	
	private ArrayList<Adherent> liste1=new ArrayList<Adherent>();
	private INotification notification;
	
	public void EnregistrerAdherent(Adherent a1){
		//Ajout de l'adherent dans la liste
		liste1.add(a1);
		//Notification de l'administrateur
		IMessage msg=new StringMessage("Adherent ajouté avec Infos : "+a1.toString());
		notification.notify(msg);
	}

	public INotification getNotification() {
		return notification;
	}

	public void setNotification(INotification notification) {
		this.notification = notification;
	}
	
	

}
