package com.softtek.java.examen.programa8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class Programa8 {
	public static void main(String[] args) {
		List<String> paises= new ArrayList<String>();
			paises.add("Sudafrica");
			paises.add("Egipto");
			paises.add("Turquia");
			paises.add("Rusia");
			paises.add("China");
			paises.add("India");
		
		List<String> paises2= new ArrayList<String>();
			paises2.add("Francia");
			paises2.add("Mexico");
			paises2.add("Australia");
			paises2.add("Italia");
			paises2.add("Argentina");
			paises2.add("Brasil");
		
		List<String> Allpaises= new ArrayList<String>();	
		
		Iterator<String> it = paises.iterator();
		Iterator<String> it2 = paises2.iterator();
		while(it.hasNext() && it2.hasNext()) {
			Allpaises.add(it.next());
			Allpaises.add(it2.next());
		}
	
		Collections.sort(Allpaises);
		System.out.println(Allpaises);
		
		
	}
}
