package chainofresponsibility;

public class LoanApprovalDemo {
	public static void main(String args[]) {
	Approver asstMgr,mgr,rtgsMgr;
	Loan loan;
	
	 asstMgr= new AssistantBankManager();
	 
	 mgr=new BankManager();
	 
	 rtgsMgr= new RTGSManager();
	 
	 //setting the successor at each level
	 
	 asstMgr.passToSuccessor(mgr);
	 mgr.passToSuccessor(rtgsMgr);
	 
	 //demonstrating the loan approval process
	 
	 loan = new Loan("2021L-1234",4000000,"Harish");
	 asstMgr.processRequest(loan);
	 
	 loan = new Loan("2021L-3456",2000000,"Pooja");
	 asstMgr.processRequest(loan);
	 
   }
}
