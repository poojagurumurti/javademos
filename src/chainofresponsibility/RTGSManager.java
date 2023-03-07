package chainofresponsibility;

public class RTGSManager extends Approver {

	@Override
	public void processRequest(Loan loan) {
		if(loan.getLoanAmount()<5000000) {
			System.out.println(this.getClass().getSimpleName()+"Approved loan request id: "+loan.get_loanID()+" for customer -"+loan.getCustomerName());
		}
		else if(successor!=null) {
			successor.processRequest(loan);
		}
		
	}
 

}
