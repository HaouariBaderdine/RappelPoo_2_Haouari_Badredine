package rappel_poo_2;

public class Fichier {

	public String nom;
	public String extension;
	public String emplacement;
	public int taille;

	public Fichier(String nom, String extension, String emplacement, int taille) {
		super();
		this.nom = nom;
		this.extension = extension;
		this.emplacement = emplacement;
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "Fichier [nom=" + nom + ", extension=" + extension + ", emplacement=" + emplacement + ", taille="
				+ taille + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

}
