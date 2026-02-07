package com.TestAutomationPractice.BaseClass;

 interface Bird {
	
	abstract public void fly();
	abstract public void eat();
	abstract public void sleep();
	
	
 }
 
 
 class Sparrow implements Bird{
	 public void fly() {
		System.out.println("sparrow flying over the sky");
		
		
	}

	@Override
	public void eat() {
		System.out.println("sparrow is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("sparrow is sleeping");
		
	}

}
 
 class Crow implements Bird{

	@Override
	public void fly() {
		System.out.println("crow is flying");
		
	}

	@Override
	public void eat() {
		System.out.println("crow is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("crow is sleeping");
		
	}
	 
	 
 }
 
 
 class Parrot implements Bird{

	@Override
	public void fly() {
		System.out.println("parrot is flying");
		
	}

	@Override
	public void eat() {
		System.out.println("parrot is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("parrot is sleeping");
		
	}
	 
	 
 }
 
 class Sky{
	
	 void allowBird(Bird ref)
	 {
		 ref.fly();
		 ref.eat();
		 ref.sleep();
		 
	 }
	 
	 
 }
 
 
 class BirdApplication{
 public static void main(String []args)
	 {
		 
		 
		 Sparrow s = new Sparrow();
		 Crow c = new Crow();
		 Parrot p = new Parrot();
		 
		 
		 Sky sk = new Sky();
		 
		 sk.allowBird(s);
		 sk.allowBird(c);
		 sk.allowBird(p);
		 
		 
		 
	 }
 }
