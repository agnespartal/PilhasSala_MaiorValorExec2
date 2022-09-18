package controller;


import br.com.leandrocolevati.pilhaint.Pilha;

public class OperacaoController {
	
	public OperacaoController() {
		super();
	}

	public int maiorValor (Pilha p, Pilha p2) {
		int num1 = 0, num2 = 0, maior = 0;
		for (int i = 0; i < 15; i++) {
			try {
				num1 = p2.pop();
				num2 = p2.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(num1 > num2) {
				p.push(num1);
			} else {
				p.push(num2);
			}
		}
		
		try {
			maior = p.top();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return maior;
	}
}
