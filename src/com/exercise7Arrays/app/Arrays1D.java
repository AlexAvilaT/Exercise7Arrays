package com.exercise7Arrays.app;

public class Arrays1D 
{

	public static void main(String[] args) 
	{
		//constant declaration
		// I want 10 elements because it is a practice project
		final int ELEMENTS_ARRAY = 10;
		// Arrays declaration
		//1st Way
		int[]intArray = new int[ELEMENTS_ARRAY];
		char[] charArray = new char[ELEMENTS_ARRAY];
		boolean[] boolArray = new boolean[ELEMENTS_ARRAY];
		double[]dblArray = new double[ELEMENTS_ARRAY];
		String[] strArray = new String[ELEMENTS_ARRAY];
		
		int[] intArray2 = {10, 10, 30, 40, 50, 60};
		char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
		boolean[] boolArray2 = {true, false, true, false, true};
		double[] dblArray2 = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] strArray2 = {"First", "Second2", "Third", "Fourth", "Fifth"};

		for(int i = 0; i < intArray2.length; i +=1) 
		{
			System.out.println(intArray2[i]); 
		}
			
	}
			
				
		
}
