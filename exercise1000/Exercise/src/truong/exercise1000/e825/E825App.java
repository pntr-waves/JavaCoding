package truong.exercise1000.e825;

import java.util.List;

import truong.exercise1000.e825.Data.E825DataTestBuilder;
import truong.exercise1000.e825.model.Point;
import truong.exercise1000.e825.service.E825Service;

public class E825App {
	public static void main(String[] args) {
		
		List<Point> listPointInOxyPlane = E825DataTestBuilder.getListPoint();
		E825Service service = new E825Service();
		
		System.out.println("list point in Oxy plane I");
		System.out.println("======================================");
		service.printResultListPoint(service.getListPointInPlaneOxyI(listPointInOxyPlane));
		System.out.println("\npoints has max Y in list");
		service.printResultListPoint(service.getListPointHasMaxYInList(listPointInOxyPlane));
		System.out.println("\nsort point decrease by distance to zero");
		System.out.println("======================================");
		service.printResultListPoint(service.sortListPoint(listPointInOxyPlane));
	}
}
