package com.manish.javadev.test;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Manish
 *
 */
public class AccountEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long accountNumber;

	private String accountType;

	private String accountHolderName;

	private Double amount;

	private Date startDate;

	public AccountEntity() {
		super();
	}

	public AccountEntity(Long accountNumber, String accountType, String accountHolderName, Double amount,
			Date startDate) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.amount = amount;
		this.startDate = startDate;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "AccountEntity [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountHolderName="
				+ accountHolderName + ", amount=" + amount + ", startDate=" + startDate + "]";
	}

}