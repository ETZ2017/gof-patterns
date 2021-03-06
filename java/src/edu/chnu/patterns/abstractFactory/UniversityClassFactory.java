package edu.chnu.patterns.abstractFactory;

import edu.chnu.patterns.factoryMethod.UniversityClass;

public abstract class UniversityClassFactory {
	protected abstract UniversityClass createClass(String subject, Integer group);

	protected abstract Log createLog();
}
