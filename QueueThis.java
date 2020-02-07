public class QueueThis{
		
	Node head;
	
	public QueueThis(){
		
		head = null;
	}
		
	private class Node{
				
		Node next;
		private String data;
		private Node(String data){
			
			this.data = data;
			next = null;						
		}
				
		public String getData(){
			return data;
		}
	}
		
	public boolean empty(){
		
		if(head == null){
			
			return true;
		}
		
		return false;
	}
		
	public void enqueue(String input){
				
		if(head == null){
			
			head = new Node(input);
			return;
		}
		
		else{
			
			Node curr = head;
			
			while(curr.next != null){	
				
				curr = curr.next;
			}
			
			curr.next = new Node(input);
		}
	}
	
	public String dequeue(){
		
		if(head == null){
			
			return null;
		}
				
		else{
			String output = head.getData();
			head = head.next;;
			return output;

		}
	}
}