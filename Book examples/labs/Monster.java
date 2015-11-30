//Name -Josh Martin	
//Date - January 28, 2015
//Class -AP Computer Programming
//Lab  -Monster

import static java.lang.System.*;

public class Monster implements Comparable {
	private int myWeight;
	private int myHeight;
	private int myAge;

	// write a default Constructor
	public Monster() {
		myHeight = myWeight = myAge = 0;
	}

	// write an initialization constructor with an int parameter ht
	public Monster(int ht) {
		myWeight = 0;
		myHeight = ht;
		myAge = 0;
	}

	// write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt) {
		myWeight = wt;
		myHeight = ht;
		myAge = 0;
	}

	// write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age) {
		myWeight = wt;
		myHeight = ht;
		myAge = age;
	}

	// modifiers - write set methods for height, weight, and age
	public void setWeight(int a) {
		myWeight = a;

	}

	public void setHeight(int a) {
		myHeight = a;
	}

	public void setAge(int a) {
		myAge = a;
	}

	// accessors - write get methods for height, weight, and age

	public int getWeight() {
		return myWeight;
	}

	public int getHeight() {
		return myHeight;
	}

	public int setAge() {
		return myAge;
	}

	// creates a new copy of this Object
	public Object clone() {
		return new Monster();
	}

	public boolean equals(Object obj) {

		return false;
	}

	public int compareTo(Object obj) {
		Monster rhs = (Monster) obj;

		return -1;
	}

	// write a toString() method
	public String toString() {
		return getWeight() + " " + getHeight() + " " + setAge();
	}

}