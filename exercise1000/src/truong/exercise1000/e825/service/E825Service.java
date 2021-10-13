package truong.exercise1000.e825.service;

import java.util.ArrayList;
import java.util.List;

import truong.exercise1000.e825.model.Point;

public class E825Service {
	public List<Point> getListPointInPlaneOxyI(List<Point> listPoint) {
		List<Point> resultListPoint = new ArrayList<>();

		for (Point p : listPoint) {
			if (p.getX() > 0 && p.getY() > 0) {
				resultListPoint.add(p);
			}
		}

		return resultListPoint;
	}

	public Point getPointHasMaxYInList(List<Point> listPoint) {
		Point resultPoint = listPoint.get(0);
		for (Point p : listPoint) {
			if (p.getY() > resultPoint.getY()) {
				resultPoint = p;
			}
		}
		return resultPoint;
	}

	public List<Point> getListPointHasMaxYInList(List<Point> listPoint) {
		double maxY = getPointHasMaxYInList(listPoint).getY();
		List<Point> resultList = new ArrayList<>();
		for (Point p : listPoint) {
			if (p.getY() == maxY) {
				resultList.add(p);
			}
		}

		return resultList;
	}

	public double getDistanceBetweenPointToZero(Point point) {
		return Math.sqrt(Math.pow(point.getX(), 2) + Math.pow(point.getY(), 2));
	}

	public List<Point> sortListPoint(List<Point> listPoint) {
		// bubble sort
		int length = listPoint.size();
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < (length - i); j++) {
				if (getDistanceBetweenPointToZero(listPoint.get(j - 1)) > getDistanceBetweenPointToZero(
						listPoint.get(j))) {
					Point temp = listPoint.get(j);
					listPoint.set(j, listPoint.get(j - 1));
					listPoint.set(j - 1, temp);
				}
			}
		}
		return listPoint;
	}
	
	public void printResultListPoint(List<Point> listPoint) {
		int count=0;
		for(Point point:listPoint) {
			count++;
			System.out.println(String.format("%d. (%f, %f) -> distanceToZero: %f", count, point.getX(), point.getY(), getDistanceBetweenPointToZero(point)));
			
		}
	}
}
