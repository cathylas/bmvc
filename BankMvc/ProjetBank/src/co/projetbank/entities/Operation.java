package co.projetbank.entities;

import java.util.Date;

public  class Operation {
	
	private int NumOp;
	private Date DateOp ;
	private double Amount;
	private String Type ;
	private int IdCust;
	
	public Operation(int NumOp,Date DateOp, double Amount ,String Type, int IdCust ) {
		this.NumOp = NumOp;
		this.DateOp = DateOp;
		this.Amount = Amount;
		this.Type = Type ; 
		this.IdCust = IdCust;
}
	@Override
	public String toString() {
		return "Operation Type "+ Type +"[numero d'operation = " + NumOp + " ,Creation Date = " + DateOp + ", Amount =" + Amount + " ,IdCust =" + IdCust + "]";
	}
	public int getNumOp() {
		return NumOp;
	}

	public void setNumOp(int NumOp) {
		this.NumOp = NumOp;
	}
	public Date getDateOp() {
		return DateOp;
	}

	public void setDateCreation(Date DateOp) {
		this.DateOp = DateOp;
}
	public double getAmount() {
		return Amount;
	}

	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public int getIdCust() {
		return IdCust;
	}

	public void setIdCust(int IdCust) {
		this.IdCust = IdCust;
	}
}