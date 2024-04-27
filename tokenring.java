import java.util.*;

public class tokenring {

public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no of nodes:");
	int n=sc.nextInt();
	
	
	System.out.print("Ring is formed as below :");
	for(int i=0;i<n;i++) {
	
		System.out.print(i + " ");
	}
	System.out.println("0");
		
	
	int token=0;
	int choice=0;
	do {
	
		System.out.println("Enter sender");
		int sender=sc.nextInt();
		
		System.out.println("Enter receiver");
		int receiver=sc.nextInt();
		
		System.out.println("Enter data to send");
		int data=sc.nextInt();
		
		
		System.out.println("Token Passing ");
		for(int i=token;i<sender;i++) {
		
			System.out.print(" " + i + "->");
		}
		System.out.println(" " + sender);
		
		
		
		System.out.println("Sender " + sender + " Sending data " + data);
		for(int i=sender;i!=receiver;i=(i+1)%n) {
			System.out.println("Data " + data + " Followed by " + i);
		} 
		
		System.out.println("Receiver " + receiver + " Received data " + data);
		token=sender;
		
		System.out.print("To continue enter 1 , To exit enter 0");
		choice=sc.nextInt();
	}
	while(choice==1);	
	
	}
}		


