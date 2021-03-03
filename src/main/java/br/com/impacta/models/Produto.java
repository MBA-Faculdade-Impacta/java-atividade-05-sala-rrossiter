package br.com.impacta.models;

public class Produto {

    public int codigo;
		public String descricao;
		public double valor;
/*
   public Produto(int codigo, String descricao, double valor ) {
      this.codigo = codigo;	
      this.descricao = descricao;	
      this.valor = valor;	
	}*/

  public String montarResumo() {
		 return "codigo:" + this.codigo + ", descricao: " + this.descricao + " , valor: " + this.valor;
	}
}


