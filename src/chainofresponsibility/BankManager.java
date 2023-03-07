package chainofresponsibility;

public class BankManager  extends Approver {

	@Override
	public void processRequest(Loan loan) {
		if(loan.getLoanAmount()<3000000) {
			System.out.println(this.getClass().getSimpleName()+"Approved loan request id: "+loan.get_loanID()+" for customer -"+loan.getCustomerName());
		}
		else if(successor!=null) {
			successor.processRequest(loan);
		}
		
	}

}
