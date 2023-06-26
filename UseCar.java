package com.onesoft.day12;
import java.util.*;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car("Audii",2000000,2016,"Black");
		Car c2=new Car("BMW",1000000,2011,"Yellow");
		Car c3=new Car("Audii",49999999,2018,"Red");
		Car c4=new Car("Rolls Royce",2000010,2018,"White");
		Car c5=new Car("Audii",3000000,2022,"Black");
		
		ArrayList<Car> cars=new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		
	

		Map<Integer,Car> brand=cars.stream().filter(x->x.getBrand().equalsIgnoreCase("AuDii")).collect(Collectors.toMap(x->x.getPrice(),y->y));
		//System.out.println("Auddi brand Only"+brand);
	//	brand.keySet().forEach(x->System.out.println(brand.get(x)));

		
	//	Map<Integer,Car> brand1=brand.values().stream().filter(x->x.getBrand().equalsIgnoreCase("AuDii")).collect(Collectors.toMap(x->x.getPrice(),y->y));
		//System.out.println("Auddi brand Only"+brand1);
	//	brand1.keySet().forEach(x->System.out.println(brand.get(x)));
		
		
		Map<Object, Object> brand2=brand.keySet().stream().filter(x->brand.get(x).getBrand().equalsIgnoreCase("AuDii")).collect(Collectors.toMap(x->x,y->brand.get(y)));
		//System.out.println("Auddi brand Only"+brand1);
		brand2.keySet().forEach(x->System.out.println(brand.get(x)));
		
		// Long brCount=brand.stream().count();
		// System.out.println("Auddi brand Count Only"+brCount);
		 
		 
		// HashMap<Integer, Car> cd=new HashMap<>();
		 
		 
			/*
		 List<Car> priceAb200k=cars.stream().filter(x->x.getPrice()>2000000).collect(Collectors.toList());
		 System.out.println(priceAb200k);
		 
		 Long countAb200k=priceAb200k.stream().count();
		 System.out.println(countAb200k);
		 
		 List<String >yearcars=cars.stream()
				 .filter(x->x.getModel()==2019)
				 .map(x->x.getBrand())
				 .collect(Collectors.toList());
		 
		 List<Car> color=cars.stream().filter(x->!x.getColour().equalsIgnoreCase("Black")).collect(Collectors.toList());
		 System.out.println(color);
		 
		 
		 List<Car> color1=cars.stream().filter(x->x.getBrand().equalsIgnoreCase("Audii")).limit(1).collect(Collectors.toList());
		 System.out.println("New one"+color1);
		
		
				 
		 Object priceA2k=cars.stream().min(Comparator.comparingInt(value ->value.getPrice() ));
		 System.out.println(priceA2k); 
		
		  Object priceA2k=cars.stream().min(Comparator.comparing(Car :: getPrice)).get();
		    Object priceA2k=cars.stream().max(Comparator.comparing(Car :: getPrice)).get();
		// System.out.println(priceA2k);
		 
		 List<Car> priceAk=cars.stream()
				 .sorted(Comparator.comparing(Car ::getModel))
				 .collect(Collectors.toList());
		
		 
		 priceAk.forEach(x-> System.out.println(x));
		 List<Car> priceA1k=cars.stream()
				 .sorted(Comparator.comparing(Car ::getModel).reversed())
				 .collect(Collectors.toList());
		priceA1k
		 
		 priceA1k.forEach(x-> System.out.println(x));
	//System.out.println(priceAk);
		
		
		 List<Car> color1=cars.stream().filter(x->x.getBrand().equalsIgnoreCase("Audii")).limit(1).collect(Collectors.toList());
		 System.out.println("New one"+color1);
		  
		 
		 Object priceA2k=cars.stream().max(Comparator.comparing(Car :: getPrice)).get();
			 System.out.println(priceA2k);
			
			 priceAk.forEach(x-> System.out.println(x));
			 List<Car> priceA1k=cars.stream()
					 .sorted(Comparator.comparing(Car ::getPrice))
					 .collect(Collectors.toList());
		int a=	priceA1k.size();
			System.out.println(priceA1k.get(a-2));
		 Object priceAb2k=cars.stream().max(Comparator.comparingInt(value ->value.getPrice() ));
		 System.out.println(priceAb2k);

		 
		 List<Character>yearcars=cars.stream()
				 .map(x->x.getBrand().charAt(x.getBrand().length()-2))
				 .collect(Collectors.toList());
		 System.out.println(yearcars);
		 
		
		 List<Car >yearcars=cars.stream()
				 .filter(x->x.getModel()==2019)
				.peek(v->v.setPrice(v.getPrice()-9999))
				 .collect(Collectors.toList());
		 yearcars.forEach(v->System.out.println(v));
		 */
	}

}
    