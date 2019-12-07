package com.softtek.javaAcademy.Java.io;

import java.io.File;
import java.io.IOException;

public interface RequsitoHimno {
	public Integer ContarCaracteres(File file)throws IOException;
	public Integer ContarLetras(File file);
	public Integer ContarLineas(File file);
	public Integer NumerosParafos(File file);
	public Integer ContarMexicano(File file);
}
