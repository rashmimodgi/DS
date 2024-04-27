import java.io.*;
import java.util.Scanner;


class bully {
    
    static int numberOfProcess;
    static int priorities[] = new int[100];
    static int status[] = new int[100];
    static int cord;

    
    public static void main(String args[]) throws IOException 
    {

	Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total number of processes:");
        numberOfProcess = sc.nextInt();
        
        
       
        for (int i = 0; i < numberOfProcess; i++) {
        
            System.out.println("Status for process " + (i + 1) + ":");
            status[i] = sc.nextInt();
            
            System.out.println("Priority of process " + (i + 1) + ":");
            priorities[i] = sc.nextInt();
            
        }
        
        
        System.out.println("Enter process which will initiate the election : ");
        int ele = sc.nextInt();
        
        electProcess(ele);
        System.out.println("After electing final coordinator is : " + cord );
    }
    
    
    static void electProcess(int ele) {

	ele = ele - 1;
	cord = ele + 1;
	
	for (int i = 0; i < numberOfProcess; i++) {
        
        	if(priorities[ele]<priorities[i]) {
            		System.out.println("Election message is sent from " + (ele + 1) + " to " + (i+1));
        		
        		if(status[i]==1) 
        			electProcess(i+1); 
        	}
       } 
    }    
        
}        
        
        
        
        
