package co.projetbank.entities;

import java.util.Date;

public class Withdrawal extends Operation {
	

	public Withdrawal(int NumOp, datetime DateOp, double Amount, String Type, int IdCust) {
		super(NumOp, DateOp, Amount,Type,IdCust);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Withdrawal ["+super.toString()+"]";
	}

}
