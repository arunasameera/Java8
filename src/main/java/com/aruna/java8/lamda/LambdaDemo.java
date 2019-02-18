package com.aruna.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(4,5,6,7,8);
		
		A obj= new Xyz();
		obj.show();
		
		A anonimus=new A(){
			@Override
			public void show() {
				System.out.println("Hellow A");				
			}
			
		};
		anonimus.show();
		
		
		Consumer<Integer> lanbdaObj=(i)->System.out.println(i);	
		values.forEach(lanbdaObj);

	}

}
