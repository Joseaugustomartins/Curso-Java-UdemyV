package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Date {

	public Date(long currentTimeMillis) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date(0);
		Date x2 = new Date(System.currentTimeMillis());
		
		java.util.Date y1 = sdf1.parse("25/06/2018");
		java.util.Date y2 = sdf2.parse("25/06/2018 15:42:17");
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x1: " + sdf2.format(x2 ));		
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		
		// MEU JAVA ESTÁ ATUALIZADO E NÃO CONSIGO TERMINAR O PROGRAMA
		// MESMO COPIANDO O CODIGO DO PROFESSOR CONTINUA DANDO ERRO
		// ESSE PROGRAMA ERA PRA RODAR ANTES DO JAVA 8
	}

	public static java.util.Date from(Instant parse) {
		// TODO Auto-generated method stub
		return null;
	}
}
