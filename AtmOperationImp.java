package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImp implements Atminterface {
	atm Atm = new atm();
	Map<Double,String>ministmt = new HashMap<>();
	
	public void viewBalance() {
		System.out.println("AvailableBalance:" + Atm.getBalance());
	}

	
	public void withdrawAmount(double withdrawAmount) {
      if(withdrawAmount%500==0) {
    	  if(withdrawAmount<Atm.getBalance()) {
    		  System.out.println("collect the cash:" + withdrawAmount);
    		  Atm.setBalance(Atm.getBalance() - withdrawAmount);
    		  ministmt.put(withdrawAmount,"Amount withdrawAmount");
    		  viewBalance();
    	  }
      }
      else {
    	  System.out.println("enter amount in terms of 500");
      }

	}

	
	public void depositAmount(double depositeAmount) {
		System.out.println("depositedAmount is:" + depositeAmount);
		Atm.setBalance(Atm.getBalance() + depositeAmount);
		ministmt.put(depositeAmount,"Deposited Successfully");
		viewBalance();
	}

	
	public void viewMiniStatement() {
          Set<Double> set = ministmt.keySet();
          for(Double d:set) {
        	  System.out.println(d + "=" + ministmt.get(d));
          }
	}

}
