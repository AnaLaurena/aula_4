package model;

public class ContaPoupanca extends Conta {
	private double rendimento;
	ContaPoupanca (String Email, double rendimento) {
		super(Email);
	this.rendimento = rendimento;
	
	}

public String Saque (double valorSaque) {	
	if(valorSaque <= Saldo) {
		Saldo =- valorSaque;
	return ("Valor Sacado:" + valorSaque 
			+"\nValor Saldo Após o Saque:"
			+ Saldo
			);
	}else {
		return "Saldo insuficiente";
	}
			
}
public String Deposito (double valorDeposito) {
	Saldo += (valorDeposito + (valorDeposito*rendimento));
	return ("Valor Sacado;" + valorDeposito 
			+ "\nValor saldo Após o Saque :"
			+ Saldo);
	
	
}
 public double getsaldo( ) {
return Saldo;
 }



  
}

