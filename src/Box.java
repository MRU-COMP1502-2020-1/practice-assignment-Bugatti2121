import java.util.ArrayList;

public class Box {
	private ArrayList<Giftcard> gc = new ArrayList<Giftcard> (); 
	private int h;
	private int l;
	private int w;
	private int cap;
	 
	 public Box() {
		h = 0;
		l = 0;
		w = 0;
	}
	public Box(int h, int l, int w) {
		this.h = h;
		this.l = l;
		this.w = w;
	}
	public Box(int size) {
		this.h = size;
		this.w = size;
		this.l = size;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public void addGiftCard(Giftcard card) {
		if (gc.size() < cap) {
			gc.add(card);
		} else {
			// do nothing
		}
	}
	public int showGiftCards(int giftNums) {
		return giftNums;
	}
	
}
