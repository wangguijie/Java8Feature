package com.learn.lambda;

public class LambdaLearn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IAnimal animal1 = () -> System.out.println("Animal1 say");
		animal1.say();
		
		IAnimal animal2 = () -> { System.out.println("Animal2 say"); } ;
		animal2.say();
		
		IRun run1 = (float a) -> {System.out.println("run : " + a + "m");};
		run1.run(20);
		
		IHero hero1 = (int armor) ->{return armor / 10f;};
		System.out.println(hero1.hit(20));
		
		ISuperHero superHero = (float speed) -> {System.out.println("here fly speed : " + speed);};
		System.out.println(superHero.hit(20));
	}

}
