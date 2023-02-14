package rappel_poo_2;

import java.util.HashMap;
import java.util.LinkedList;

public class Disquette {

	public String nom;
	public double tailleSecteur;
	public int nbrSecteur;
	public int pistesSurface;

	public LinkedList<Fichier> listC = new LinkedList<Fichier>();

	public HashMap<String, Fichier> mapF = new HashMap<String, Fichier>();

	public Disquette(String nom, double tailleSecteur, int nbrSecteur, int pistesSurface) {
		super();
		this.nom = nom;
		this.tailleSecteur = tailleSecteur;
		this.nbrSecteur = nbrSecteur;
		this.pistesSurface = pistesSurface;
	}

	public double getEspaceDisque() {

		return this.tailleSecteur * this.nbrSecteur * this.pistesSurface;
	}

	public double getEspaceLibre() {

		double somme = 0;

		if (this.listC.size() == 0) {
			return this.getEspaceDisque();
		} else {
			for (Fichier e : this.listC) {
				somme += e.getTaille();
				return this.getEspaceDisque() - somme;
			}
		}

		return 0;
	}

	public void ajouterFichier(Fichier f) {
		if (f.getTaille() > this.getEspaceLibre()) {
			System.out.println("Espace libre est insuffisant !");
		} else {
			this.listC.add(f);
			this.mapF.put(f.getNom(), f);
			System.out.println("Insertion de fichier avec succés");
		}
	}

	public void explorerExtension(String extension) {
		for (Fichier e : this.listC) {
			if (e.getExtension() == extension) {
				System.out.println(e);
			}
		}
	}

}
