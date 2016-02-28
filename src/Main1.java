import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.formation.spring.fonctionnel.Adherent;
import com.formation.spring.fonctionnel.GestionAdherent;

public class Main1 {


	public static void main(String[] args) {
		// Recherche du fichier de configuration de Spring
		ClassPathResource cpr=new ClassPathResource("applicationContext.xml");
		// Initialisation de la fabrique SPRING, les singletons sont charges
		ListableBeanFactory bf = new XmlBeanFactory(cpr);
		// Initialisation de la methode getBean en parametrant le nom du bean
		// pour recuperer un bean 
		GestionAdherent gestion = (GestionAdherent) bf.getBean("g1");
	    Adherent a1=(Adherent)bf.getBean("adherent1");
		
	    gestion.EnregistrerAdherent(a1);
		
		

	}

}
