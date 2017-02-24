package br.com.fiap.si.bo;

public class Calculadora {

	private Double n1;
	private Double n2;
	private String op;
	
	public Double getN1() {
		return n1;
	}
	public void setN1(Double n1) {
		this.n1 = n1;
	}
	public Double getN2() {
		return n2;
	}
	public void setN2(Double n2) {
		this.n2 = n2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	
	public Calculadora(Double n1, String op, Double n2){
		this.n1 = n1;
		this.op = op;
		this.n2 = n2;
	}
	
	public Double calcular(){
		
		Double resultado = null;
		
		switch(op){
		
		case "+":
			resultado = n1 + n2;
			break;
			
		case "-":
			resultado = n1 - n2;
			break;
		
		case "*":
			resultado = n1 * n2;
			break;
		
		case "/":
			resultado = n1 / n2;
			break;
		
		}
		
		return resultado;
		
	}
}
