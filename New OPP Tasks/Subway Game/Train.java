package lab2;

public class Train {

	private static int id;
	private boolean movingState;
	
	public  int getId() {
		return id;
	}
	public void setId(int id) {
		Train.id = id;
	}
	static void transport()
	{
		System.out.println("the train : " + id);
	}
	static void rigidTrain()
	{
		System.out.println("the train :" + id + " is rigid!");
	}
	
	public boolean getMovingState() {
		return movingState;
	}
	public void setMovingState(boolean movingState) {
		this.movingState = movingState;
		if(movingState)
		{
          transport();
		}
		else
		  rigidTrain();
	}	
}
