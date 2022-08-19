package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        oddeve(6);   
    }

    public static boolean oddeve(int num)
    {
        return num % 2  == 0?true:false;
    }
}
