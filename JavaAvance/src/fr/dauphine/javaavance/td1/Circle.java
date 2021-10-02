package fr.dauphine.javaavance.td1;
import java.util.List;
public class Circle {
	private Point c;
	private double r;
	
	public Circle(Point c, double r) {
		this.c=new Point(c.getx(),c.gety());
		this.r=r;
	}
	
	public Circle() {
		new Circle(new Point(0,0),1);
	}
	
	@Override
	public String toString() {
		String s="(center:"+c+"radius:"+r+",aire="+this.area()+")";
		return s;
	}
	
	public void translate(double dx,double dy) {
		c.translate(dx, dy);
	}
	
	public Point getcenter() {
		return new Point(c.getx(), c.gety());
	}
	
	public double getradius() {
		return r;
	}
	
	public void setradius(double nr) {
		r=nr;
	}
	
	public double area(){
		return r*r*3.1415926;
	}
	
	public boolean contains(Point p) {
		
		double dx=p.getx()-c.getx();
		dx=dx*dx;
		double dy=p.gety()-c.gety();
		dy=dy*dy;
		double ecart=Math.sqrt(dx+dy);
		return ecart<=r;
	}
	
	public boolean contains(Point p, List<?extends Circle> Circles){
		boolean ret=false;
		for( Circle c2 : Circles) {
			if(c2.contains(p)) {
				ret=true;
			}
		}
		return ret;
	}


}
