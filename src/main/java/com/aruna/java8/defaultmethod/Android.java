package com.aruna.java8.defaultmethod;

/**
 * Hello world!
 *
 */
public class Android implements Phone
{
    public static void main( String[] args )
    {
        Phone p= new Android();
        p.call();
        p.message();
    }

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}
}
