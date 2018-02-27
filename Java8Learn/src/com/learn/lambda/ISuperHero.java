package com.learn.lambda;

public interface ISuperHero {
	void fly(float speed);
//	float hit(int armor);
	default float hit(int armor) {
		return 20.f/armor;
	}
}
