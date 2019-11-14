package ejercicioHerencia;

public class Punto2D {
	//Atributos
	private double x;
	private double y;
	//Constructores
	public Punto2D(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	public Punto2D(double xy) {
		this(xy,xy);
	}
	public Punto2D() {
		this(0,0);
	}


	// Metodo toString
	public String toString() {
		return "("+this.getX()+","+this.getY()+")";
	}
	//Setters
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	//Getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}