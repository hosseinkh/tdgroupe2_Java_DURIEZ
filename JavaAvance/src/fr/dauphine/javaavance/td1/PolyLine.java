package fr.dauphine.javaavance.td1;
import java.util.ArrayList;

public class PolyLine {

	private ArrayList<Point> points;
	private int taille;
	private int nbpoint=0;
	public PolyLine(int x) {
		points = new ArrayList<>();
		taille=x;
	}
	
	public void add(Point p) {
		if(nbpoint<taille){
		points.add(p);
		nbpoint++;
		}
		else {
			System.out.println("poltline pleine");
		}
	}
	public void add() {
		if(nbpoint<taille) {
		points.add(null);
		}
		else {
			System.out.println("poltline pleine");
		}
	}
	
	
	public int PointCapacity() {
		return taille;
	}
	
	public int nbPoints() {
		return nbpoint;
	}
	
	public boolean contains(Point p){
		boolean ret=false;
		for( Point p2 : points) {
			if(p.equals(p2)) {
				ret=true;
			}
		}
		return ret;
	}
}
