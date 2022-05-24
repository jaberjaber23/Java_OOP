package lab2;

public class MainGame {

	public static void main(String[] args) {

		GameSystem.StartGame(); // Start
		Player.moveRight();     //--->
		Player.moveLeft();      //<---
		Player.collectCoin();   // $$+
		Player.collectCoin();   // $$+
		Player.moveRight();     //--->
		Player.collectCoin();   // $$+
		
	}

}
