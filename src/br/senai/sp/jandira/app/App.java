package br.senai.sp.jandira.app;

import br.senai.sp.jandira.conta.Conta;

public class App {
	
	public static void main (String[] args) {
		
		Conta x = new Conta();
		Conta z = new Conta();
		
		x.setMultiplicador(8);
		x.setMultiplicando(10);
		
		z.setMultiplicador(6);
		z.setMultiplicando(5);
		
		String contaX[] = x.calcular();
		String contaZ[] = z.calcular();
		
		for (int i = 0; i < contaX.length; i++) {
			
			System.out.println(contaX[i]);
		}
		
		System.out.println("---------------------------");
		
        for (int i = 0; i < contaZ.length; i++) {
			
			System.out.println(contaZ[i]);
		}
		
		
	}

}
