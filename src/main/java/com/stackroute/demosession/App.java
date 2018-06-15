package com.stackroute.demosession;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages="com.stackroute")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
