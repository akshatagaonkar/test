package purchaseApprover_chain;

public abstract class MyApprover {
	MyApprover successor;

	public void setSuccessor(MyApprover a){
		successor=a;
	}
	public abstract void getFloor(Elevator p);
}
