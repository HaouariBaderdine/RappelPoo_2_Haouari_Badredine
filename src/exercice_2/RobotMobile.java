package exercice_2;

public class RobotMobile extends Robot {

	private int abs;
	private int ord;

	public RobotMobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RobotMobile(String type, long code) {
		super(type, code);
		// TODO Auto-generated constructor stub
	}

	public RobotMobile(String type, long code, int abs, int ord) {
		super(type, code);
		this.abs = abs;
		this.ord = ord;
	}

	public void avancer(int x) {
		switch (this.getOrientation()) {
		case 1:
			this.ord += x;
		case 2:
			this.abs += x;
		case 3:
			this.ord -= x;
		case 4:
			this.abs -= x;
		}
	}

	public String affichePosition() {
		return "Position: [ abs: " + this.abs + " ord: " + this.ord + "]";
	}

	public void afficher() {
		super.affiche();
		this.affichePosition();
	}

}
