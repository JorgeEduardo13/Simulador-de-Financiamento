package br.edu.iftm.simuladorDeFinanciamento;

public class ProgSimuladorFinanciamento {

	public static void main(String[] args) 
	{
		Financiamento f = new Financiamento();
		
		f.setValorVeiculo(50000.00);
		f.setEntrada(5000.00);
		f.setNumPrestacoes(120);
		f.setTaxaJuros(0.02);
		f.setRendaMensal(2500.00);
		
		f.valorASerFinanciado();
		f.valorDasPrestacoes();
		f.totalASerPago();
		
		f.informacoes();

	}

}
