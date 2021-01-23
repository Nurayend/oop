package second;

import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<House> houses = new HashSet<House>();
		House h1 = new House("Almaty", 2012, 1, 80, "wooden");
		House h2 = new House("Almaty", 2012, 1, 80, "wooden");
		houses.add(h1);
		houses.add(h2);
		System.out.println(houses);
		//System.out.println(h1.equals(h2));
		
		HashSet<Apartment> apartments = new HashSet<Apartment>();
		Apartment a1 = new Apartment("Almaty", 1987, 5, false);
		Apartment a2 = new Apartment("Almaty", 1987, 5, false);
		apartments.add(a1);
		apartments.add(a2);
		System.out.println(apartments);
		
		HashSet<Property> p = new HashSet<Property>();
		p.add(h1);
		p.add(a1);
		for (Property pr: p) {
			System.out.println(pr.toString());
		}
	}

}
