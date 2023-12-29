package com.anotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;

@interface MyAnnotation{
	// Marker Annotation
}  
@interface MyAnnotation1{  
int value();  // single value Annotation
}  
class A {
	void m() {
		System.out.println("hello m");
	}

@Deprecated  
	void n() {
		System.out.println("hello n");
	}
}
class Hello{  
@MyAnnotation1(value=10)  
public void sayHello(){System.out.println("hello annotation");}  
}  
public class SuperWarningAnotation  {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		@SuppressWarnings("checked")
		ArrayList list = new ArrayList();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");

		for (Object obj : list)
			System.out.println(obj);
		
		A a=new A();
		a.n();
		Hello h=new Hello();  
		Method m=h.getClass().getMethod("sayHello");  
		
		MyAnnotation1 manno=m.getAnnotation(MyAnnotation1.class);  
		System.out.println("value is: "+manno.value());  
		
	}

	
}
