package exercice_2;

public class testRobotMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RobotMobile rb = new RobotMobile("ta1", 007);

		rb.setEtat(true);

		// a-
		rb.tourner(2);
		System.out.println(rb.affiche());
		System.out.println(rb.affichePosition() + '\n');

		// b-
		rb.tourner(4);
		rb.avancer(4);
		System.out.println(rb.affiche());
		System.out.println(rb.affichePosition() + '\n');

		// c-
		rb.tourner(1);
		rb.avancer(6);
		System.out.println(rb.affiche());
		System.out.println(rb.affichePosition() + '\n');

		// d-
		rb.tourner(2);
		rb.avancer(14);
		System.out.println(rb.affiche());
		System.out.println(rb.affichePosition() + '\n');

		// e-
		rb.tourner(3);
		rb.avancer(8);
		System.out.println(rb.affiche());
		System.out.println(rb.affichePosition() + '\n');

	}

}
