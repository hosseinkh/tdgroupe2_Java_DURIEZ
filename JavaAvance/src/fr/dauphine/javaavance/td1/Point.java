package fr.dauphine.javaavance.td1;

public class Point {
	private double x;
	private double y;
	private static int nbPoint=0;
	public Point() {
		new Point(0,0);
	}
	public double getx() {
		return x;
				
	}
	
	public double gety() {
		return y;
				
	}
	public int getnb() {
		return nbPoint;
				
	}
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
		nbPoint++;
	}
	
	public Point(Point p2) {
		this.x=p2.x;
		this.y=p2.y;
		nbPoint++;
	}
	
	@Override
	public String toString() {
		String s="("+x+","+y+")";
		return s;
	}
	
	public void afficher() {
		Point p=new Point();
		System.out.println(p.x+" "+p.y);
		return;
	}
	public boolean isSameAS(Point p) {
		if(this.x==p.getx() && this.y==p.gety()) {
			return true;
		}
		else return false;
	}
	
	@Override
	public boolean equals(Object o) {
			boolean ret=false;
		if(o instanceof Point) {
			ret=isSameAS((Point)o);
		}
		return ret;
	}
	
	public void translate(double dx, double dy) {
		x=x+dx;
		y=y+dy;
	}
	
}