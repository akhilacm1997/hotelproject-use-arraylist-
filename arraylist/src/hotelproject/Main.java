package hotelproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import customerpakage.Customer;
import register.Register;
import booking.Booking;
import booking.Doubleroombooking;
public class Main {
	static int id =0;
	public static int m=0;
	
	static int room=0,m1=0;
	static ArrayList<Integer>arrid =new  ArrayList<Integer>();
	public static ArrayList<String> arrname=new  ArrayList<String>();
	static ArrayList<Integer>arrroom =new  ArrayList<Integer>();
	static ArrayList<Integer> arrdate=new  ArrayList<Integer>();
	public static ArrayList<String> arremail=new  ArrayList<String>();
	static String name;
	static String address;
	static String contactNumber;
	static String email;
	static String proofType;
	static String proofID;
	static String i,k;
	static String num1="0";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String i1;
	String date;
	String ac;
	String cot;
	String cableConnection;
	String wifi;
	String Laundry;
	public static void main(String[] args) throws IOException {
		
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String i;
		String k = new String();
		String num1="0";
		String i1;
		int date=0;
		int r1=0;
		String ac;
		String cot;
		String cableConnection;
		String wifi;
		String Laundry;
		
		Customer c = new Customer();
		Register r =  new Register();
		Booking b = new Booking();
		Doubleroombooking db1 = new Doubleroombooking();
		do
			{
			System.out.println("Enter your choice\n1.Registration\n2.Booking\n3.check status \n4.update email\n5.date\n6.view registerd customers\n7.exit");
			
		num1=br.readLine();
		switch(num1)
		{
		case "1":
		{
			System.out.println(" Welcome to Registration \n Enter your details:");
		 r.register1();
		 r.display();
		//arrid[m++]=++id;
		 arrid.add(++id);
		 System.out.println("Thankyou for your registration your customer id is "+ id);
		 break;
		}
		case "2":
		{
			System.out.println(" Welcome to booking ");	
			 System.out.println("Did you register before?(y/n)");
			  String s =br.readLine();
			  if(s.contentEquals("y"))
			  {
			     System.out.println("enter your id"); 
				 int enterid=Integer.parseInt(br.readLine());
				 for(int h=0;h<id;h++)
				 {
					System.out.println(h);
					System.out.println( "array element "+arrid.get(h));
					if(arrid.get(h)==enterid)
					 {
						b.booking1();
						b.displaycost();
						System.out.println("Do you want to proceed? (y/n)");
						k=br.readLine();
						System.out.println();// space of another person details
						System.out.println("Enter the  date of booking");
						date = Integer.parseInt(br.readLine());
				        int e=--enterid;
						arrroom.add(++room);
						arrdate.add(date);
					    r1++;
				       System.out.println("your room number is  "+room );
				       break;
				 }
				}
			  }
				else
				 {
					 System.out.println("Please register first");
				 }
			break;
		}
	
		case "3":
		{ 
			int count=0;
		   System.out.println("enter which room you want?");
		   System.out.println(r1);
		 int j= Integer.parseInt(br.readLine());
		if(j<=room)
		{
		 for(int h=0;h<room;h++)
		 {
			if(arrroom.get(h)==j)
			 {
				 System.out.println("Room number "+ arrroom.get(h)+ " is booked");
		     }
			
		 }
		}
		else
		{
			System.out.println("Room number "+ j + " is available");
	     }
			
		}
		break;
		
		case "4":
		{
			System.out.println("Do you want to update your email? (yes/no)");
			i=br.readLine();
			System.out.println();

			if(i.equalsIgnoreCase("yes"))
			{  System.out.println("enter your id"); 
			    int cusid=Integer.parseInt(br.readLine());
			    //--enterid;
			    System.out.println("enter your emailid");
				email=br.readLine();
				int f=--cusid;
				System.out.println(f);
				arremail.remove(f);
				arremail.add(email);
			    System.out.println(arrname.get(f)+" "+arremail.get(f));
			}	
			
			break;
		}
		case "5":
		{    System.out.println("enter startdate");
			 int startdate =Integer.parseInt(br.readLine());
             System.out.println("enter end date");
			 int enddate =Integer.parseInt(br.readLine());
			 System.out.println("name"+"   date "+"customer id");
			  for(int u=0;u<id;u++)
			  {
				
				if(arrdate.get(u)>=startdate&& arrdate.get(u)<=enddate)
				{
					System.out.println(arrname.get(u)+" "+arrdate.get(u)+"  "+arrid.get(u));
				}
			  }
			break;
		}
		case "6":
		{
			System.out.println("customer id"+"/t"+"name"+"/t"+"room number");
			for(int g=0;g<id;g++)
			{ 
				System.out.println(g);
				System.out.println(arrname.get(g)+"\t"+arrid.get(g)+"\t"+arrroom.get(g)+"\t"+arrdate.get(g));
			}
			break;
		}
		case "7":
		{
			System.out.println("BYE");
			System.exit(0);
		}
		}
		System.out.println("Do you want to continue? (y/n)");
		i=br.readLine();
		System.out.println();// space of another person details
		}
while(i.equalsIgnoreCase("y"));  
		
			}
	
	}


