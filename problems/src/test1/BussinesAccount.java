package test1;

import java.util.Objects;

public class BussinesAccount extends User{
	private String job;
	private double pay;
	
	public BussinesAccount() {}
	
	public BussinesAccount(int id, String login, String dateOfReg, String job, double pay) {
		super(id, login, dateOfReg);
		this.job = job;
		this.pay = pay;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BussinesAccount))
			return false;
		
		BussinesAccount bussinesAccount = (BussinesAccount) obj;
		return bussinesAccount.pay == pay && bussinesAccount.job.equals(job);
	}
	
	public int hashCode() {
		return super.hashCode() + Objects.hash(pay, job);
	}

	public String toString() {
		return super.toString() + ", Job: " + job + ", Pay: " + pay;
	}
}
