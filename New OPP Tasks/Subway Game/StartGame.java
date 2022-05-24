package lab2;

import java.util.ArrayList;

public class StartGame {

	public void StartTheGame() {
		
		System.out.println("The game started!");
		Player.run();
		Guard.run();
		Train firstTrain = new Train();
		firstTrain.setId(1);
		firstTrain.setMovingState(true);
		
		Train secondTrain = new Train();
		secondTrain.setId(2);
		secondTrain.setMovingState(false);
		
		Coin coin5 = new Coin();
		coin5.setPlace("left");
		Coin.addCoinToArray(coin5);
		
		Coin coin10 = new Coin();
		coin5.setPlace("left");
		Coin.addCoinToArray(coin10);
		
		Coin coin15 = new Coin();
		coin5.setPlace("right");
		Coin.addCoinToArray(coin15);
		
	}

}
