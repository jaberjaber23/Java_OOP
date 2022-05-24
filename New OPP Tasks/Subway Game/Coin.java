package lab2;
import java.util.ArrayList;
public class Coin extends Collectables{

  public static ArrayList<Coin> coinsArray = new ArrayList<Coin>();

  private String place;

public static ArrayList<Coin> getCoinsArray() {
	return coinsArray;
}

public static void setCoinsArray(ArrayList<Coin> coinsArray) {
	Coin.coinsArray = coinsArray;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
	System.out.println("The coin generated in " + place);
}
static void addCoinToArray(Coin coin) {
	coinsArray.add(coin);
}
  
  
}
