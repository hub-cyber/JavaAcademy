package com.softtek.javaAcademy.Java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HimnoNacional implements RequsitoHimno {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\Usuario\\Downloads\\himno.txt\\");
		HimnoNacional Hn= new HimnoNacional();
		//Instanciar el primer metodo
		Integer CountChar = Hn.ContarCaracteres(file);
		System.out.println("1. Numero de caracteres: "+ CountChar);
	}
	@Override
	public Integer ContarCaracteres(File file) throws IOException {
		Integer  characterCount = 0; 
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileStream);
		BufferedReader reader= new BufferedReader(inputStreamReader);
		try {
			String line= null;
			
			while((line = reader.readLine()) != null) {
				characterCount += line.length();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return characterCount;
	}

	@Override
	public Integer ContarLetras(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer ContarLineas(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer NumerosParafos(File file) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer ContarMexicano(File file) {
		// TODO Auto-generated method stub
		return null;
	}
}

