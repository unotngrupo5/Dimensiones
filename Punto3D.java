package ejercicioHerencia;

public class Punto3D extends Punto2D{
	private double z;


	public Punto3D(double x, double y, double z) {
		super(x ,y);
		this.setZ(z);
	}
	public Punto3D(Punto2D p,double z) {
		this(p.getX(),p.getY(),z);
	}
	public Punto3D(double xyz) {
		this(xyz, xyz, xyz);
	}
	public Punto3D() {
		this(0,0,0);
	}

	public String toString() {
		return "("+super.getX()+","+super.getY()+","+this.getZ()+")";
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getZ() {
		return z;
	}
}
