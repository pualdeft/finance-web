package com.atguigu.finance.bean;

public class ContractVo {

	private LoanContract loanContract;
	
	private BorrowerInfo borrowerInfo;
	
	private ContractAttribute contractAttribute;

	public LoanContract getLoanContract() {
		return loanContract;
	}

	public void setLoanContract(LoanContract loanContract) {
		this.loanContract = loanContract;
	}

	public BorrowerInfo getBorrowerInfo() {
		return borrowerInfo;
	}

	public void setBorrowerInfo(BorrowerInfo borrowerInfo) {
		this.borrowerInfo = borrowerInfo;
	}

	public ContractAttribute getContractAttribute() {
		return contractAttribute;
	}

	public void setContractAttribute(ContractAttribute contractAttribute) {
		this.contractAttribute = contractAttribute;
	}
	
	
	
}
