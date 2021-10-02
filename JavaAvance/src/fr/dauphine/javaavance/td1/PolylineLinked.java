package fr.dauphine.javaavance.td1;
import java.util.LinkedList;

public class PolylineLinked {

	private LinkedList<Point> points;
	private int nbpoint=0;
	public PolylineLinked(LinkedList<Point> list) {
		points = list;
	}
	
	public void add(Point p) {
		points.add(p);
		nbpoint++;
	}
	public void add() {
		points.add(null);
	}
	
	
	public void PointCapacity() {
		System.out.println("pas de limite");
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