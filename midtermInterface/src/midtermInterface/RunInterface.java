package midtermInterface;

import java.util.*;

public class RunInterface {

	public static void main(String[] args) {
		Cookie coo1 = new Cookie(5, "Oreo", "April 14");
		Cookie coo2 = new Cookie(5, "prince", "April 14"); 
		Cookie coo3 = new Cookie(5, "Sooper", "April 14");
		
		CinnamonRoll cinn1 = new CinnamonRoll(7, "Chocolate", "April 14");
		CinnamonRoll cinn2 = new CinnamonRoll(7, "Dark Chocolate", "April 14");
		CinnamonRoll cinn3 = new CinnamonRoll(7, "White Chocolate", "April 14");
		
		Brownie bro1 = new Brownie(9, "Chocolate Fudge", "April 14");
		Brownie bro2 = new Brownie(9, "Dark Chocolate Fudge", "April 14");
		Brownie bro3 = new Brownie(9, "White Chocolate Fudge", "April 14");
		
		List<BakedGoods> items = new ArrayList<BakedGoods>();
		
		items.add(coo1);
		items.add(coo2);
		items.add(coo3);
		items.add(cinn1);
		items.add(cinn2);
		items.add(cinn3);
		items.add(bro1);
		items.add(bro2);
		items.add(bro3);
		
		for(BakedGoods b: items) {
			System.out.println("Price of item: " + b.getPrice() + " Description of item: " + b.getDescription() + " Sell By Date: " + b.getSellByDate());
		}
	}

}
