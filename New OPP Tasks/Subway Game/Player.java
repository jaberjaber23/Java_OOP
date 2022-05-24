package lab2;

public class Player extends Human{
	static String place;

	public static String getPlace() {
		return place;
	}

	public static void setPlace(String place) {
		Player.place = place;
	}
	
	static void moveRight()
	{
		place = "right";
		System.out.println("Player Moved to the Right!");
	}
	 
	static void moveLeft()
	 {
		place = "left";
		System.out.println("Player Moved to the Left!");
	 }	
	
	static void collectCoin()
	{
		if(Coin.coinsArray.get(0).getPlace()==place)
		{
			System.out.println("You collected a Coin");
		Coin.coinsArray.remove(0);
		}
		else
		{
			System.out.println("you are not collected a Coin!");
		}
	}
	
	static void run()
	{
		System.out.println("Player is running!");
	}
	

}
