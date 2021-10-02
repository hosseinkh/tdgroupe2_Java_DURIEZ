package fr.dauphine.javaavance.td1;

import java.util.ArrayList;
import java.util.List;
public class Main {
	
	public static void main(String[] args) {
		
		Point p=new Point(1.5,2);
		p.translate(1, 1);
		p.afficher();
		System.out.println(p.getnb());
		TestPoint p22=new TestPoint();
		System.out.println(p22.getx()+" "+p22.gety());
		
		
		System.out.println(p);
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
		System.out.println(p1.isSameAS(p));
		System.out.println(p1.isSameAS(p2));
		
		
		PolyLine Pl= new PolyLine(5);
		Pl.add(p1);
		Pl.add(p);
		Pl.add(p3);
		Pl.add();
		System.out.println(Pl.contains(p2));
		
		
		
		
		Point p5=new Point(1,2);
		Circle c=new Circle(p5,1);
		Circle c2=new Circle(p5,2);
		c2.translate(1, 1);;
		System.out.println(c+" "+c2);
		
		Circle c3= new Circle(new Point(1,2), 1 );
		c3.getcenter().translate(1, 1);
		System.out.println(c3);
		System.out.println(c3.contains(p));
		System.out.println(c3.contains(p3));
		
		System.out.println(new Ring(p,5,4));
		
		Ring c25=new Ring(p2,5,4);
		Ring c45=new Ring(p1,3,1);
		Ring c35=new Ring(p3,4,2);
		ArrayList<Ring> ls=new ArrayList<>();
		ls.add(c35);
		ls.add(c45);
		System.out.println(c35.contains(p1,ls));
		ls.get(1).contains(p);
		
		
		
		
		
		
		System.out.println(c25);
		ls.get(1).contains(p);
	}
	
	
	
}
