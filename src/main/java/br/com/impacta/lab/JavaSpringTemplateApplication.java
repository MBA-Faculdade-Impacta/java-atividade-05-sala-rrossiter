package br.com.impacta.lab;

import br.com.impacta.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.codigo = 1;
		produto.descricao = "Camisa";
		produto.valor = 70.00;
		
		String resumo = produto.montarResumo();
		
		System.out.println(resumo);
	}

}


