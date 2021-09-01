/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        System.out.println("Hi! What's your name?");

        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        String output = "Nice to meet you " + s + "!";

        System.out.println(output);
    }
}
