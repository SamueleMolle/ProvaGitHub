import java.util.Random;

//Versione 4

public class Robot {

	private String nome;
	public final String uscita="Ciao";
	private String[] risposte={};
	private final String[] risFisse={"Meditiamo...","Questa domanda non mi compete...come le figlie femmine...","Domande mediocri da seccenti mediocri...","Master è la via!","Ovviamente, se lo dice Master!","No! Solo un falso profeta divulgherebbe certi sermoni seccenti!"};
	private int contaris=0;
	private Random r;
	
	public Robot(String n){
		nome=n;
		risposte= new String[100];
		for (int i=0; i<risFisse.length;i++) {
		risposte[i]=risFisse[i];
		contaris++;
		}
		r = new Random();
			}
	
	public String chiedi(String dom) {
		int n=r.nextInt(contaris);
		String ris=risposte[n];
		return ris;
	}
	
	public String getNome() {
		String s="Salve a tutti, sono Master Wallace!";
		return s;		
	}
	private boolean cercaDom(String dom) {
		for(int i=0;i<contaris;i++) 
	if(dom.compareToIgnoreCase(risposte[i])==0)
		return false;
		return true;
	}	
	private void setRisposta(String dom) {
		contaris++;
		risposte[contaris]=dom;
	}
		
	
	
}
