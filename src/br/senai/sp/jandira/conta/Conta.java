package br.senai.sp.jandira.conta;

public class Conta {
	
          private int multiplicando;
          private int repeticao = 9;
          private int multiplicador;
          private int calcular ;
          private int resultado;
          
          public void setMultiplicando (int multiplicando) {
        	  
        	  this.multiplicando = multiplicando;
        			  
        	  
          }
          
          public int getMultiplicando() {
        	  
        	  return multiplicando;
        	  
          }
          
          public void setMultiplicador (int multiplicador) {
			
        	  this.multiplicador = multiplicador;
        	  
		}
          
          public String[] calcular() {
        	  
        	  String t[] = new String[multiplicador + 1];
        	  
        	  for (int i = 0; i <= multiplicador; i++) {
        		  
        		  int produto = multiplicando * i;
        		  
        		  t[i] = multiplicando + " x " + i + " = "+ produto;        		  
        	  }
        	  
			return t;
	  
          }
          
          

		 
        	  
          }

