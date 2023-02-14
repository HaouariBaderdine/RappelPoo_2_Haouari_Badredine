package exercice_2;

public class Robot {

	protected String type;
	protected long code;
	// t (1 = Nord, 2 =Est, 3 = Sud, 4 = West)
	protected int orientation;
	protected boolean etat;

	public Robot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Robot(String type, long code) {
		super();
		this.type = type;
		this.code = code;
	}

	public void tourner(int sens) {
		this.orientation = sens;
	}

	public String affiche() {
		return "[orientation=" + orientation + ", etat=" + etat + "]";
	}

	@Override
	public String toString() {
		return "Robot [type=" + type + ", code=" + code + ", orientation=" + orientation + ", etat=" + etat + "]";
	}

	public String getType() {
		return type;
	}

	public long getCode() {
		return code;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

}
