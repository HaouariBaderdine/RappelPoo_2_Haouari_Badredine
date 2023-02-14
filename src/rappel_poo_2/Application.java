package rappel_poo_2;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fichier f1 = new Fichier("examen", "doc", "C:\\word", 2);
		Fichier f2 = new Fichier("bulletin", "xls", "C:\\excel", 1);
		Fichier f3 = new Fichier("nature", "gif", "C", 25);

		Disque_Dur c = new Disque_Dur("C:", 0.9375, 1024, 520, 16);

		System.out.println("Taille libre de disque dur :" + c.getEspaceLibre());

		c.ajouterFichier(f1);
		c.ajouterFichier(f2);
		c.ajouterFichier(f3);

	}

}
