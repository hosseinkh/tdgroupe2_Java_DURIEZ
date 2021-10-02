package fr.dauphine.javaavance.td1;

import java.util.List;

public class Ring extends Circle {
	private double r2;
	 
	public Ring(Point center,double radius,double radius2) {
		super(center,radius);
		if(radius2<radius) {
			r2=radius2;
		}
		else {
			this.setradius(radius2);
			r2=radius;
		}
	}
	
	
	public double getradius2() {
		return 2;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean ret=false;
		if(o instanceof Ring) {
			Ring r=(Ring)o;
			if(this.r2==r.getradius2() && this.getcenter()==r.getcenter() && this.getradius()==r.getradius()) {
				ret=true;
			}
		}
		return ret;
	}
	
	@Override
	public String toString() {
		String s=super.toString();
		s=s+"intern radius:"+"r2"+", intern area:"+(new Circle(getcenter(),r2)).area();
		return s;
	}
	
	@Override
	public boolean contains(Point p) {
		Circle c2=new Circle(getcenter(),r2);
		Circle c=new Circle(getcenter(),getradius());
		boolean ret=false;
		if(c.contains(p)==true && c2.contains(p)==false) {
			ret=true;
		}
		return ret;
		
	}
	
	
	
	@Override
	public boolean contains(Point p, List<? extends Circle> Rings){
		boolean ret=false;
		for( Circle r2 : Rings) {
			Ring r= (Ring)r2;
			if(r.contains(p)==true){
				ret=true;
			}
		}
		return ret;
	}
}
