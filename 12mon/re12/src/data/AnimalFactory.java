package data;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactory {

	public static Animal create(String key,String name,int age,String color) {
		Map<String, Animal> animalMap = new HashMap<String, Animal>();
		animalMap.put("1", new Dog(name,age,color));
		animalMap.put("2", new Tiger(name,age,color));
		animalMap.put("3", new Bird(name,age,color));

		return animalMap.get(key);
	}
}
