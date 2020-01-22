
public class Giftcard {
	private String senderName;
	private String receiverName;
	private String message;
	
	public Giftcard() {
		
	}
	public Giftcard(String senderName, String receiverName, String message){
	this.senderName = senderName;
	this.receiverName = receiverName;
	this.message = message;
	}
	
	public String getMsg() {
		return message;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
