
package co.projetbank.entities;

import java.util.Date;

public  class Account {
	private int idCust ; 
	private double balance;
	private Date Creationdate;
	 
	
	public Account(int IdCust ,double Balance, Date CreationDate) {
		this.Creationdate= CreationDate;
		this.balance = Balance ; 
		this.idCust =IdCust;		
	}
	@Override
	public String toString() {
		return " CreationDate = " + Creationdate + ",Balance=" + balance+",Customer number = "+idCust;
	}
	public Date getCreationdate() {
		return Creationdate;
	}

	public void setDateCreation(Date Creationdate) {
		this.Creationdate = Creationdate;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double Balance) {
		this.balance =Balance;
	}
	public int getIdCust() {
		return idCust;
	}

	public void setIdCust(int IdCust) {
		this.idCust = IdCust;
	}

		
}