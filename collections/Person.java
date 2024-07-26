package com.collections;

public class Person implements Comparable<Person> {

	private String name;

	public Person(String name, Integer age, String workLocation, String isMarried, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.workLocation = workLocation;
		this.isMarried = isMarried;
		this.salary = salary;
	}

	private Integer age;
	private String workLocation;
	private String isMarried;
	private int salary;

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public String getIsMarried() {
		return isMarried;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", workLocation=" + workLocation + ", isMarried=" + isMarried
				+ ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Person o) {

		return o.getName().compareTo(this.getName());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
