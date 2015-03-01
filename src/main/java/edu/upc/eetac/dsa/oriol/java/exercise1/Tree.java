package edu.upc.eetac.dsa.oriol.java.exercise1;

public class Tree {
	
	private int altura;
	private String nombre;
	
	public Tree(int altura, String nombre){
		this.altura = altura;
		this.nombre = nombre;
	}
	
	public Tree(){
		this(0, null);
	}
	
	public Tree(int altura){
		this(altura, null);
	}
	

	public Tree(String nombre){
		this(0, nombre);
		
	}
	
	@Override
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		sb.append("Un ");
		
		if (nombre == null)
			sb.append("árbol");
		else
			sb.append(nombre);
		
		if (altura > 0)
			sb.append(" de ").append(altura).append(" metros.");
		return sb.toString();			
							
	}
	
}
