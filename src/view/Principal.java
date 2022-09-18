package view;

import br.com.leandrocolevati.pilhaint.Pilha;
import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		Pilha p2 = new Pilha();
		OperacaoController op = new OperacaoController();
		
		for (int i = 0; i < 15; i++) {
			int num = (int)((Math.random()* 50)+ 1);
			p.push(num);
			p2.push(num);
		}
		
		int maior = op.maiorValor(p, p2);
		System.out.println("Maior valor: "+maior);
	}

}
