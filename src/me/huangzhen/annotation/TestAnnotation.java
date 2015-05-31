package me.huangzhen.annotation;

// JDK 提供的常用的注解 
// Override
//depredcated
//supperwarnning


public class TestAnnotation
{
	public static void main(String[] args)
	{
		Person p = new Student();
		p.walk();
		p.eat();
	}

}

@MyAnnotation(value = "huangzhen")
class Student extends Person
{
	@Override
	public void walk()
	{
		System.out.println("student walk");
	}
}

class Person
{
	private String name;
	private int age;

	public Person()
	{
		super();
	}

	@MyAnnotation(value = "annotation")
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void walk()
	{
		System.out.println("walk");
	}
	
	@Deprecated
	public void eat()
	{
		System.out.println("eat");
	}

}
