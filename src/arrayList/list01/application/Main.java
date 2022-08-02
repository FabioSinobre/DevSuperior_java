package arrayList.list01.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Fatima");
		list.add("Rafa");
		list.add("Odete");
		list.add("Macelo");
		list.add("Pablo");
		
		System.out.println("-------------------------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());//devolve uma lista
		System.out.println(result);
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------------------------------");		
		for(String x : list) {
			System.out.println(x);
		}
		
		
		list.remove("Odete");
		
		list.removeIf(x -> x.charAt(0) == 'M'); //remover por predicado função lambda
		list.add(2, "Julia");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);//encontrar o primeiro elemento que atenda um certo predicado
		System.out.println(name);
		System.out.println("-------------------------------------------------------");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println(list.indexOf("Pablo"));//indica a posição do elemento casso o elemento não exista retornara -1
		System.out.println(list.size());

	}

}
