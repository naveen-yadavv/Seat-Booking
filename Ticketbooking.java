import java.util.*;
import java.awt.*;
import java.text.SimpleDateFormat;
class colourcode 
{
	
	static Scanner sc=new Scanner(System.in);
	static String bgred="\u001B[41m";
 	static String bgblue="\u001B[44m";
    	static String bgmegenta="\u001B[45";
    	static String bggreen="\u001B[42m";
  	static String bgyellow="\u001B[43m";
    	static String SET_BOLD_TEXT = "\033[0;1m";
	static String REDBRI= "\033[1;91m";
	static String increaseFontSize = "\033[1;31m";
	static String resetFormatting = "\033[0m";
	static String BOLD="\u001B[1m";
	static String BLINK ="\u001B[5m";
	static String whitebg="\u001B[47m";
	static String black ="\u001B[30m";
	String skblue = "\u001B[36m";
	static String magent = "\u001B[95m";
	static final String ital = "\u001B[3m";
	static String ul = "\u001B[4m";
	static String RESET = "\u001B[0m";
        static String RED = "\u001B[31m";
        static String GREEN = "\u001B[32m";
        static String YELLOW = "\u001B[33m";
	static String BLUE="\u001B[34m";
	static String PURPLE="\u001B[35m";
	static String WHITE="\u001B[37m";
	static String CYAN="\u001B[36m";
}
class login extends colourcode{
	static  Movies obj = new Movies();
	private String mobile_number;
	 void mobile(){

        System.out.println("  BBBBB   OOO   OOO  K   K          Y   Y   OOO   U   U   RRRR         SSSS  H   H  OOO  W   W  ");
        System.out.println("  B    B O   O O   O K  K            Y Y   O   O  U   U   R   R      S      H   H O   O  W W W  ");
        System.out.println("  BBBBB  O   O O   O KKK              Y    O   O  U   U   RRRR       SSS   HHHHH O   O  W W W  ");
        System.out.println("  B    B O   O O   O K  K             Y     O   O  U   U   R  R          S  H   H O   O  W W W  ");
        System.out.println("  BBBBB   OOO   OOO  K   K            Y      OOO    UUU    R   R     SSSS   H   H  OOO   W W W  ");
    

		System.out.println(RED+"\nBOOK YOUR TICKET");
		System.out.println(PURPLE+"              WELCOME TO YOUR SHOW                    ");
		System.out.println("BOOK  YOUR  SHOW*");
		System.out.println(" "+whitebg+black+"    Enter Mobile Number For Login To Your Account    "+RESET);
		System.out.println("                                              ");
		mobilenum(sc.next());
	}
	void mobilenum(String number){
		this.mobile_number=number;
		boolean b=true;
		for(int i=number.length()-1;i>=0;i--){
			char ch = number.charAt(i);
			if(ch<'0'|| ch>'9'){
				System.out.println("NUMBER SHOULD BE IN ONLY UNIT DIGITS\n");
				mobilenum(sc.next());b=false;break;
			}
		}
		if(b){
			if(number.length()>9&&number.length()<11&&number.charAt(0)!='0'){
				System.out.println("OTP SEND TO YOUR MOBILE NUMBER\n");
				generateOTP();
			}
			else if(number.charAt(0)=='0'){
				System.out.println("NUMBER SHOULD NOT START WITH ZERO\n");
				mobilenum(sc.next());
			}
			else{
				System.out.println("NUMBER SHOULD HAVE 10 UNIT DIGITS ONLY\n");
				mobilenum(sc.next());
			}
		}
	}
	void generateOTP(){  
        int randomPin   =(int) (Math.random()*9000);
		System.out.println("              your generatedOTP is :"+GREEN+randomPin+RESET);
		System.out.println();
		System.out.println(" "+whitebg+black+"     Enter OTP  To Continue       "+RESET);
		int otp=sc.nextInt();
		System.out.println();
		if(randomPin==otp)
		{
			System.out.println(GREEN+"*     Login Sucessful     *"+RESET);
			System.out.println(" ");
			System.out.println("	     *ENJOY YOUR SHOW*  	");
		shows();
		}
		else
		{
			System.out.println(RED+"Invalid OTP"+RESET);
           	 generateOTP();
			
		}
		
    	} 
	void shows(){

	System.out.println("\nChoose your Category :\n1.Movies \t2.Music \n3.ComedyShow \t4.Sports");
	System.out.println("\nEnter your option : ");
	int n=sc.nextInt();
	String show="";
	switch(n)
	{
	case 1:
	show ="Movies";
	obj.Language();
	break;

	case 2:
	show ="Music";
	MusicshowTicketBooking obj2=new MusicshowTicketBooking();
	obj2.MusicShow();
	break;

	case 3:
	show ="Comedy show";
	ComedyshowTicketBooking obj3=new  ComedyshowTicketBooking();
	obj3.ComedyShow();
	break;

	case 4:
	show ="sports";
	Sports obj1 = new Sports(); 
        obj1.Sports();
	break;

	default:
		System.out.println("Invalid show");
		
	}
	}
}
abstract class bookmyshow extends login
{
	abstract void ticketbooking(double ticket);
        double MovieticketPrice=175;
	double MusicticketPrice=150;
	double ComedyticketPrice=250;
	double SportsticketPrice=600;	
}
class Movies extends bookmyshow
{
    
    static Scanner sc = new Scanner(System.in);
    int r=200;
	void ticketbooking(double ticket){

		}
	 void Language()
     {
      	System.out.println("\nSelect Language \n\n1.Telugu \n2.Hindi \n3.Tamil");
	System.out.println("\nEnter your option : ");
         String Language ="" ;
      	int n = sc.nextInt();
      	switch(n)
      	{
        	case 1:
             		Language="Telugu";
			Theatre();
             		break;
       		case 2:
             		Language="Hindi";
			Theatre();
             		break;
       		case 3:
             		Language="Tamil";
			Theatre();
             		break;
       		default:
             		System.out.println("Invalid Input");
			Language();
			break;
     	}
    } 	


	void Theatre ()
    {
         System.out.println("\n Select Theatre \n\n1.Viswanath Theatre \n2.Cinepolis Lulu Mall  \n3.Miraj Theatre \n4.Sandhya Theatre \n5.Prasads imax");
	System.out.println("\nEnter your option : ");
	 String TheatreName="";
         int n = sc.nextInt();
         switch(n)
        {
            case 1:
             TheatreName ="Viswanath Theatre";
	     Movie();
              break;
            case 2:
             TheatreName="Cinepolis Lulu Mall";
		Movie();
              break;
            case 3: 
              TheatreName="Miraj Theatre";
		Movie();
              break;
	    case 4: 
              TheatreName="Sandhya Theatre";
		Movie();
              break;
	    case 5: 
              TheatreName="Prasads imax";
		Movie();
              break;
            default :
              System.out.print("Invalid Number");
		Theatre();
		break;
        }  
     
     }



     void Movie()
     {
	System.out.println("\nWelcome to the Movies");
        System.out.println("\nPick your Movie\n\n1.DEVARA \n2.JOCKER THE DARK NIGHT  \n3.TILLU SQUARE \n4.PUSHPA THE RULE\n5.KALKI");
	System.out.println("\nEnter your option : ");
       String MovieName = "";
       int n = sc.nextInt();
       switch(n)
       { 
          case 1:
               MovieName="DEVARA";
		Day();
               break;
          case 2:
               MovieName="JOCKER THE DARK NIGHT";
		Day();
               break;
          case 3:
               MovieName="TILLU SQUARE";
		Day();
               break;
	  case 4:
               MovieName="PUSHPA THE RULE";
		Day();
               break;
	 case 5:
               MovieName="Kalki";
		Day();
               break;
          default:
               System.out.println("Please enter valid movie name");
	Movie();
	break;
       }
     } 
    
    
      void Day()
     {
      	System.out.println("\nBook for : \n\n1.TODAY \n2.TOMORROW  \n3.THIS WEEKEND");
	System.out.println("\nEnter your option : ");
        String Day ="" ;
      	int n = sc.nextInt();
      	switch(n)
      	{
        	case 1:
                    Day="TODAY";
		    Time();
                    break;
       		case 2:
             	    Day="TOMORROW";
		    Time();
             	    break;
       		case 3:
             	    Day="THIS WEEKEND";
		    Time();
             	    break;
       		default:
             	    System.out.println("Invalid ShowDay");
		    Day();
     	}
     } 
    

     void Time()
     {
      	System.out.println("\nSelect Timings\n\n1.11:15 AM\n2.2:15 PM  \n3.6:30 PM \n4.9:45 PM");
	System.out.println("\nEnter your option : ");
        String Time ="" ;
      	int n = sc.nextInt();
      	switch(n)
      	{
        	case 1:
                    Time="11:00AM";
		    Tickets();
                    break;
       		case 2:
             	    Time="1:10PM";
		    Tickets();
             	    break;
       		case 3:
             	    Time="7:30PM";
		    Tickets();
             	    break;
		case 4:
             	    Time="11:30PM";
		    Tickets();
             	    break;
       		default:
             	    System.out.println("Invalid Showtime");
		    Time();
     	}
     } 
     double sum=0;
     void Tickets()
     {
	  movieName();
     }
     void movieName()
     {
        
	
		System.out.println("\n1.Book A Seat \n2.Exit");
		System.out.println("\nEnter your option :");
		int a=sc.nextInt();
		switch(a)
		{
			case 1:
			System.out.println("\nAvailable Seats = "+r);
			System.out.println("\nEnter Number Of Tickets: ");
			int numTickets =sc.nextInt();
			if(numTickets<=r) 
			{
				double totalCost=MovieticketPrice*numTickets;
				sum=sum+totalCost;
				this.r=this.r-numTickets;
				System.out.println("\nTotal Cost: Rs" + totalCost);
				System.out.println("\nBooking Details:");
				System.out.println("Number Of Tickets: " + numTickets);
				System.out.println("\n1.Book Another Seat \n2.totalCost:");
				System.out.println("\n Enter your option :");
				int b=sc.nextInt();
				if(b==1)
				{
			     		if(r>0)
			     		{
						movieName();
		
			     		}
		             		else
			     		{
						System.out.println("All Seats are Filled");
						System.out.println("1.HOME PAGE\t2.EXIT");
					String T ="" ;
      					int n = sc.nextInt();
      					switch(n)
      					{
        				case 1:
                    			T="HOME PAGE";
					shows();
                    			break;
       					case 2:
             	    			T="EXIT";
					break;
					default:
             	    			System.out.println("Invalid ");
					}
			     		}
				}	
				else if(b==2)
				{
	         			System.out.println("\nTotal Cost: Rs" + sum);													System.out.println("\n1.HOME PAGE\t2.EXIT\n3.PAYMENT");
					int n = sc.nextInt();
      					switch(n)
      					{
        				case 1:
					shows();
                    			break;
       					case 2:
					break;
					case 3:
					new payments().mode();
					break;
					default:
             	    			System.out.println("Invalid");
					}
				}
				else
				{
					System.out.println("Invalid Selection");
	 				movieName();
				}		
			}
			else {
				System.out.print("\nTickets Unavailable");
			Tickets();
			}
			break;
			case 2 :	
			System.out.println("EXITING FROM Movies");
			break;
			case 3:
			System.out.println("Invalid Selection");
			Tickets();
			break;	
       	}
}
     
	}
class Sports extends bookmyshow
{
	static Scanner sc = new Scanner(System.in);
	int r=220;
	void ticketbooking(double ticket){

	}
	void Sports()
    	{
        	 System.out.println("\nWelcome to Sports");
         	System.out.println("\nChoose Sport : \n1.CRICKET \n2.VOLLEYBALL \n3.KABBADI");
		System.out.println("\nEnter your option :");
	 	String SportName="";
         	int n = sc.nextInt();
         	switch(n)
        	{
            	case 1:
              	SportName="CRICKET";
              	Cricket();
              	break;
            	case 2:
              	SportName="VOLLEYBALL";
              	VolleyBall();
              	break;
            	case 3: 
              	SportName="KABADDI";
              	Kabaddi();
              	break;
            	default :
              	System.out.print("Invalid Number");
		Sports();
		break;
        } 
     
}
     
	void Cricket()
     	{
        	System.out.println("\nChoose a match : \n1.T20 WC INDIA VS AUSTRALIA \n2.ODI PAKISTAN VS AFGHANISTAN \n3.T20 WC WEST INDIES VS NEW ZEALAND");
		System.out.println("\nEnter your option :");
       		String CricketMatchName = "";
       		int n = sc.nextInt();
      	 	switch(n)
      		{ 
          	case 1:
               	CricketMatchName="T20 WC INDIA VS AUSTRALIA";
		System.out.println("Match Details : \n");
		System.out.println(CricketMatchName);
		System.out.println("Venue : Chinnaswamy Stadium,Banglore.");
		date();
               	break;
          	case 2:
               	CricketMatchName="ODI PAKISTAN VS AFGHANISTAN";
		System.out.println("Match Details : \n");
		System.out.println(CricketMatchName);
		System.out.println("Venue : RajivGandhi International Stadium,Hyderabad.");
		date();
       		break;
          	case 3:
               	CricketMatchName="T20 WC WEST INDIES VS NEW ZEALAND";
		System.out.println("Match Details : \n");
		System.out.println(CricketMatchName);
		System.out.println("Venue : Narendra Modi Stadium,Ahmedabad.");
		date();
               	break;
          	default:
               	System.out.println("Invalid Input");
		Cricket();
		break;
       }
    }
	void Kabaddi()
     	{
        	System.out.println("Enter the option\n 1.ProKabaddi TELUGUTITANS vs UP YODHA \n 2.ProKabaddi PUNE vs JAIPUR \n 3.ProKabaddi DELHI vs U MUMBAI");
       		String KabaddiMatchName = "";
       		int n = sc.nextInt();
       		switch(n)
       		{ 
          	case 1:
               	KabaddiMatchName="ProKabaddi TELUGUTITANS vs UP YODHA ";
		System.out.println("Match Details : \n");
		System.out.println(KabaddiMatchName);
		System.out.println("Venue : Gachibowli Indoor Stadium,Hyderabad.");
		date();
               	break;
          	case 2:
               	KabaddiMatchName="ProKabaddi PUNE vs JAIPUR ";
		System.out.println("Match Details : \n");
		System.out.println(KabaddiMatchName);
		System.out.println("Venue : Nethaji Indoor Stadium,Kolkata.");
		date();
               	break;
          	case 3:
               	KabaddiMatchName="ProKabaddi DELHI vs U MUMBAI";
		System.out.println("Match Details : \n");
		System.out.println(KabaddiMatchName);
		System.out.println("Venue : Sms Indoor Stadium,Jaipur.");
		date();
               	break;
          	default:
               	System.out.println("Invalid Input");
		Kabaddi();
       }
    } 
	void VolleyBall()
     	{
        	System.out.println("Enter the option\n 1.Japan vs Brazil \n 2.India vs Australia \n 3.Italy vs Argentina");
       		String VolleyballMatchName = "";
      	 	int n = sc.nextInt();
       		switch(n)
       		{ 
          	case 1:
               	VolleyballMatchName="Japan vs Brazil";
		System.out.println("Match Details : \n");
		System.out.println(VolleyballMatchName);
		System.out.println("Venue : Ariake Arena,Indore.");
		date();
               	break;
          	case 2:
               	VolleyballMatchName="India vs Australia ";
		System.out.println("Match Details : \n");
		System.out.println(VolleyballMatchName);
		System.out.println("Venue : Indira Gandhi Sports Stadium,Kolkata.");
		date();
               	break;
          	case 3:
               	VolleyballMatchName="Italy vs Argentina";
		System.out.println("Match Details : \n");
		System.out.println(VolleyballMatchName);
		System.out.println("Venue : Nices Arena,Chennai.");
		date();
               	break;
          	default:
               	System.out.println("Invalid Input");
		VolleyBall();
		break;
       }
    } 
	void date()
     	{
      		System.out.println("\nChoose Date : \n1.Sun 18-Feb-2024  @9:00 PM.\n2.Wed 22-Feb-2024 @7:00 PM.");
		System.out.println("\nEnter your option :");
         	String Date ="" ;
      		int n = sc.nextInt();
      		switch(n)
      		{
        	case 1:
             		Date="Sunday 18 Feb 2024 at 9:00 PM";
			Tickets();
             		break;
       		case 2:
             		Date="web 20 Feb 2024 at 7:00 PM";
			Tickets();
             		break;
       		default:
             		System.out.println("Invalid Input");
			date();
			break;
     	}
    } 
	double sum=0;
     	void Tickets()
     	{
		SportName();
     	}
     	void SportName()
     	{
        	if(r<=0)
		{
	    		System.out.println("All Seats Are Filled");
		}
		else
		{
			System.out.println("\n1.Book a Seat \n2.Exit");
			System.out.println("\nEnter your option :");
			int a=sc.nextInt();
			if(a==1)
			{
				System.out.println("\nAvailable Seats = "+r);
				System.out.println("\nEnter Number Of Tickets: ");
				int numTickets =sc.nextInt();
				if(numTickets<=r)
				{
                        		double totalCost=SportsticketPrice*numTickets;
					sum=sum+totalCost;
					this.r=this.r-numTickets;		
					System.out.println("\nTotal Cost: Rs" + totalCost);
					System.out.println("\nBooking Details:");
					System.out.println("Number Of Tickets: " + numTickets);
					System.out.println("\n1.Book Another Seat \n2.totalCost:");
	System.out.println("\nEnter your option :");
					int b=sc.nextInt();
					if(b==1)
					{
			    			 if(r>0)
			     			{
				   	 		SportName();	
			 	   	 	}
		        		 	else
			   	  		{
				    			System.out.println("All Seats Are Filled");
							System.out.println("1.HOME PAGE\t2.EXIT");
							String T ="" ;
  							int n = sc.nextInt();
   							switch(n)
      							{
       							case 1:
              						T="HOME PAGE";
							shows();
                    					break;
       							case 2:
             	    					T="EXIT";
							break;
							default:
             	    					System.out.println("Invalid");
							break;
							}
			        		}
					}
					else if(b==2)
					{
	         				System.out.println("\nTotal Cost: Rs" + sum);
						System.out.println("\n1.HOME PAGE\t2.EXIT\t3.PAYMENT");
					int n = sc.nextInt();
      					switch(n)
      					{
        				case 1:
					shows();
                    			break;
       					case 2:
					break;
					case 3:
					new payments().mode();
					break;
					default:
             	    			System.out.println("Invalid");
				}
		
					}
					else
					{
						System.out.println("Invalid Selection");
						SportName();
					}
			}
			else if(a==2)
			{
				System.out.println("EXITING FROM Sports");
			}
			else
			{
				System.out.println("Invalid Selection");
				SportName();
			}
		}
	}
}
}
class MusicshowTicketBooking extends bookmyshow
{
	static Scanner Scanner = new Scanner(System.in);
	static MusicshowTicketBooking obj = new MusicshowTicketBooking();
	int r = 200;
	void ticketbooking(double ticket){

	}
	void MusicShow()
	{
		System.out.println("Welcome to the Musicshow Ticket Booking System!\n");
		obj.Language();
		obj.Tickets();
	}
	void Language()
     	{
      		System.out.println("\nChoose Language : \n\n1.Telugu \n2.Hindi\n3.Tamil");
		System.out.println("\nEnter your opinion :");
       		String Language ="" ;
		int n = Scanner.nextInt();
      		switch(n)
      		{
        	case 1:
			Language="Telugu";
			MusicbandName();
             		break;
       		case 2:
             		Language="Hindi";
			MusicbandName();
             		break;
       		case 3:
             		Language="Tamil";
			MusicbandName();
             		break;
       		default:
             		System.out.println("Invalid Input");
			Language();
			break;
    		}
    	} 
	void MusicbandName()
     	{
		System.out.println("\nWelcome to the MusicbandName");
        	System.out.println("\nChoose Music Band Name : \n1.Karthik Live  \n2.A.r.rahman Live \n3.Anirudh Live \n4.DSPLive");
		System.out.println("\nEnter your option :");
       		String MusicbandName = "";
       		int n = Scanner.nextInt();
       		switch(n)
       		{ 
          	case 1:
               		MusicbandName="Karthik Live";
			System.out.println("\nShow Details :");
			System.out.println("\nBand Name : "+MusicbandName);
			System.out.println("Monday - 11:00 am");
			System.out.println("VENUE-Hyderabad.");
             		break;
          	case 2:
               		MusicbandName="A.r.rahman Live";
			System.out.println("\nShow Details :");
			System.out.println("\nBand Name : "+MusicbandName);
			System.out.println("Tuesday - 1:00 pm");
			System.out.println();
			System.out.println("VENUE-vizag.");
               		break;
          	case 3:
               		MusicbandName="Anirudh Live";
			System.out.println("\nShow Details :");
			System.out.println("\nBand Name : "+MusicbandName);
			System.out.println("Wednesday - 11:00 am");
			System.out.println();
			System.out.println("VENUE-Hitech city.");
              		break;
	  	case 4:
			MusicbandName="DSPLive";
			System.out.println("\nShow Details :");
			System.out.println("\nBand Name : "+MusicbandName);
		 	System.out.println("Thursday - 10:00 am");
			System.out.println();
			System.out.println("VENUE-Gachibowli.");
      			break;
  		default:
 			System.out.println("Please enter valid MusicbandName");
			MusicbandName();
			break;
 		}
  	} 
	double sum=0;
	void Tickets()
	{
		MusicShow1();
	}
	void MusicShow1()
	{
		System.out.println("\n1.Book a seat \n2.Exit");
		System.out.println("\nEnter your option :");
		int a=Scanner.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("\nAvailable Seats = "+r);
			System.out.println("\nEnter number of tickets: ");
			int numTickets = Scanner.nextInt();
			if(numTickets<=r) 
			{		
				double totalCost=MusicticketPrice*numTickets;
				sum=sum+totalCost;
				this.r=this.r-numTickets;
				System.out.println("Total Cost: Rs" + totalCost);
				System.out.println("\nBooking Details:");
				System.out.println("Number of tickets: " + numTickets);
				System.out.println("\n1.Book another seat \n2.Total Cost:");
				System.out.println("\nEnter your option :");
				int b=Scanner.nextInt();
				if(b==1)
				{
					if(r>0)
					{
						MusicShow1();
					}
					else
					{
						System.out.println("All Seats Are Filled");
						System.out.println("\n1.PAYMENTS \n2.HOME PAGE\t3.EXIT");
						String T ="" ;
  						int n = Scanner.nextInt();
   						switch(n)
      						{
						case 1:
							T="PAYMENTS";
							
							break;
       						case 2:
              						T="HOME PAGE";
							shows();
                    					break;
       						case 3:
             	    					T="EXIT";
							break;
						default:
             	    					System.out.println("Invalid");
							break;
						}
			        	}
				}
				else if(b==2)
				{
					System.out.println("\nTotal Cost: Rs" + sum);
					System.out.println("\n\n1.HOME PAGE\t2.EXIT\t3.PAYMENT");
					int n = sc.nextInt();
      					switch(n)
      					{
        				case 1:
					shows();
                    			break;
       					case 2:
					break;
					case 3:
					new payments().mode();
					break;
					default:
             	    			System.out.println("Invalid");
					break;	
				}
				}
				else
				{
					System.out.println("Invalid Selection");
					MusicShow1();
					break;
				}
			}
			else {
				System.out.println("Enter valid Tickets");
				Tickets();
				break;
			}
		case 2:
		break;
		default:
		System.out.println("Invalid Selection");
		Tickets();
		break;
			
		}
	}
}		


class ComedyshowTicketBooking extends bookmyshow
{
	static Scanner Scanner = new Scanner(System.in);
	static ComedyshowTicketBooking obj = new ComedyshowTicketBooking();
	int r=246;
		void ticketbooking(double ticket){

		}
		void ComedyShow()
		{
			System.out.println("Welcome to the ComedyShow Ticket Booking System!");
			obj.Language();
			obj.Tickets();
		}
		void Language()
		{
		System.out.println("\nChoose Language : \n\n1.Telugu \n2.Hindi \n3.Tamil");	
		System.out.println("\nEnter your option : ");
		int n = Scanner.nextInt();
      		switch(n)
      		{
        	case 1:
			ComedyShowName();
             		break;
       		case 2:
			ComedyShowName();
             		break;
       		case 3:
			ComedyShowName();
             		break;
       		default:
             		System.out.println("\nInvalid Input");
			Language();
			break;
    		}
	}
	void ComedyShowName()
     	{
        	System.out.println("\nChoose Comedy Show : \n\n1.The Laughology Project\n2.Open-mic Comedy\n3.Mr.polishetty\n4.Ila Katha Mafiliya");
		System.out.println("\nEnter your option : ");
       		String ComedyShowName = "";
       		int n = Scanner.nextInt();
       		switch(n)
       		{ 
          	case 1:
               		ComedyShowName="The Laughology Project";
			System.out.println("Show Details : ");
			System.out.println("\nComedy Show Name : "+ComedyShowName);
			System.out.println("Monday - 08:00 pm");
			System.out.println("VENUE-Hyderabad.");
             		break;
          	case 2:
               		ComedyShowName="Open-mic Comedy";
			System.out.println("Show Details : ");
			System.out.println("\nComedy Show Name : "+ComedyShowName);
			System.out.println("Tuesday - 07:00 pm");
			System.out.println("VENUE-Vizag.");
             		break;
          	case 3:
               		ComedyShowName="Mr.polishetty";
			System.out.println("Show Details : ");
			System.out.println("\nComedy Show Name : "+ComedyShowName);
			System.out.println("Wednesday - 06:30 pm");
			System.out.println("VENUE-Hitech city.");
             		break;
	  	case 4:
			ComedyShowName="Ila Katha Mafiliya";
			System.out.println("Show Details : ");
			System.out.println("\nComedy Show Name : "+ComedyShowName);
			System.out.println("Saturday - 05:30 pm");
			System.out.println("VENUE-Hitech city.");
             		break;
  		default:
 			System.out.println("Please enter valid ComedyShowName");
			ComedyShowName();
			break;
 		}
}

	double sum=0;
	void Tickets()
	{
		ComedyShow1();
	}
	void ComedyShow1()
	{
		System.out.println("\n1.Book a seat \n2.Exit");
		System.out.println("\nEnter your choice : ");
		int a=Scanner.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("\n\nAvailable Seats = "+r);
			System.out.println("\nEnter number of tickets: ");
			int numTickets = Scanner.nextInt();
			if(numTickets<=r) 
			{		
				double totalCost=MusicticketPrice*numTickets;
				sum=sum+totalCost;
				this.r=this.r-numTickets;
				System.out.println("\nTotal Cost: Rs" + totalCost);
				System.out.println("\nBooking Details:");
				System.out.println("Number of tickets: " + numTickets);
				System.out.println("\n1.Book another seat \n2.totalCost:");
				System.out.println("\nEnter your option : ");
				int b=Scanner.nextInt();
				if(b==1)
				{
					if(r>0)
					{
						ComedyShow1();;
					}
					else
					{
						System.out.println("All Seats Are Filled");
						System.out.println("1.HOME PAGE\t2.Payment1\t3.EXIT");
						String T ="" ;
  						int n = Scanner.nextInt();
   						switch(n)
      						{
       						case 1:
              						T="HOME PAGE";
							shows();
                    					break;
       						case 2:
             	    					T="Payment1";
							break;
						case 3:
             	    					T="EXIT";
							break;
						default:
             	    					System.out.println("Invalid");
						}
			        	}
				}
				else if(b==2)
				{
					System.out.println("\nTotal Cost: Rs" + sum);	
					System.out.println("\n1.HOME PAGE\n2.EXIT\n3.PAYMENT");
					int n = sc.nextInt();
      					switch(n)
      					{
        				case 1:
					shows();
                    			break;
       					case 2:
					break;
					case 3:
					new payments().mode();
					break;
					default:
             	    			System.out.println("Invalid");
				}
}
				else 
				{
					System.out.println("Invalid Selection");
					ComedyShow1();
					
						
				}
			}
			else {
				System.out.println("Enter valid Tickets");
				Tickets();
				break;
			}
		case 2:
			break;
		default:
			System.out.println("Invalid Selection");
			Tickets();
			break;
			
		}
	}
}
class payments extends bookmyshow{
	private String mobile_number;
	static Scanner sc=new Scanner(System.in);
	void ticketbooking(double ticket){

		}
	void num() {
		System.out.println("Enter mobile number :");
		mobilenum(sc.next());
	}
	void mobilenum(String number){
		this.mobile_number=number;
		boolean b=true;
		for(int i=number.length()-1;i>=0;i--){
			char ch = number.charAt(i);
			if(ch<'0'|| ch>'9'){
				System.out.println("NUMBER SHOULD BE IN ONLY UNIT DIGITS\n");
				mobilenum(sc.next());b=false;break;
			}
		}
		if(b){
			if(number.length()>9&&number.length()<11&&number.charAt(0)!='0'){
				System.out.println("OTP SEND TO YOUR MOBILE NUMBER\n");
				otp();
			}
			else if(number.charAt(0)=='0'){
				System.out.println("NUMBER SHOULD NOT START WITH ZERO\n");
				mobilenum(sc.next());
			}
			else{
				System.out.println("NUMBER SHOULD HAVE 10 UNIT DIGITS ONLY\n");
				mobilenum(sc.next());
			}
		}
	}
	/*void num(){
		System.out.println(magent+"ENTER MOBILE NUMBER:"+RESET);
		
		String mobile_num=sc.next();
		int length_mobile=mobile_num.length();
			if(length_mobile==10)
			{
				System.out.println(" " );
				System.out.println(GREEN+"MOBILE NUMBER VERIFIED SUCCESSFULLY."+RESET);
				System.out.println(" " );
				otp();
			}
			else
			{
				System.out.println(" " );
				System.out.println(RED+"INVALID NUMBER PLEASE TRY AGAIN"+RESET);
				num();
				System.out.println(" " );
			}
		}*/
		void otp(){
			int x=(int)(Math.random()*9000);
			System.out.println("OTP:-" +x);
			System.out.println(" " );
			System.out.print(RED+"ENTER OTP:"+RESET);
			int otp=sc.nextInt();
			System.out.println(" ");
			if(x==otp)
			{
				System.out.println(RED+"TOTAL AMOUNT: rs."+RESET);
				System.out.println(" ");
			
			}
			else
			{
				System.out.println(RED+"INVALID OTP PLEASE TRY AGAIN!"+RESET);
				System.out.println(" ");
				otp();
			}
		}
	
    		void mode(){
      			System.out.println(SET_BOLD_TEXT+bgyellow+"SELECT PAYMENT MODE"+RESET);
        		System.out.println(" \n 1.UPI \n 2.NET BANKING \n 3.DEBIT CARD");
			String paymentMode="";
        		int n = sc.nextInt();
        		switch(n)
        		{
         		case 1:
             			paymentMode="UPI";
				upi();
				//num();
				//otp();
				System.out.println(" " );
				System.out.println(BLINK+GREEN+"PAYMENT SUCCESSFULLY COMPLETED"+RESET);
              			break;

            		case 2:
             			paymentMode="NET BANKING";
				netBanking();
				//num();
				//otp();
				System.out.println(" ");
				System.out.println(BLINK+GREEN+"PAYMENT SUCCESSFULLY COMPLETED"+RESET);
				System.out.println(" "); 
             	 		break;

            		case 3: 
              			paymentMode="DEBIT CARD";
				debit();
				//otp();
				System.out.println(" ");
				System.out.println(BLINK+GREEN+"PAYMENT SUCCESSFULLY COMPLETED"+RESET);
              			break;

			default :
              			System.out.println(BLINK+RED+"INVALID NUMBER"+RESET);
				System.out.println(" ");
				mode();
        		}
     
     		}
		void upi(){
			System.out.println(SET_BOLD_TEXT+bggreen+"SELECT UPI MODE"+RESET);
         		System.out.println(" \n 1.PHONE PAY \n 2.GOOGLE PAY \n 3.PAYTM \n 4.BHARATH PAY");
	 		String UPI="";
         		int n = sc.nextInt();
         		switch(n)
        		{
            		case 1:
              			UPI="PHONE PAY";
				num();
              			break;
            		case 2:
              			UPI="GOOGLE PAY";
				num();
              			break;
           		case 3: 
             			UPI="PAYTM";
				num();
              			break;
	    		case 4:
				UPI="BHARATH PAY";
				num();
				break;
            		default :
              			System.out.print(RED+"INVALID "+RESET);
        		}
     
     		}
		void netBanking(){
			System.out.println(SET_BOLD_TEXT+"SELECT YOUR BANK"+RESET);
         		System.out.println(" \n 1.SBI \n 2.HDFC \n 3.ICICI");
	 		String BANK="";
         		int n = sc.nextInt();
        		switch(n)
        		{
           		case 1:
              			BANK="SBI";
				num();
             			break;
            		case 2:
              			BANK="HDFC";
				num();
             			break;
            		case 3: 
              			BANK="ICICI";
				num();
              			break;
            		default :
              			System.out.print("RED+INVALID +RESET");
        		}
     
     		}
		void debit(){
			System.out.println(SET_BOLD_TEXT+bgblue+"PLEASE ENTER YOUR DEBIT CARD NUMBER:"+RESET);
			System.out.println("(must contain 16 digits)");
			String debit_num=sc.next();
			int length_debit=debit_num.length();
			if(length_debit==16)
			{
				System.out.println(" " );
				System.out.println(GREEN+"DEBIT NUMBER VERIFIED SUCCESSFULLY."+RESET);
				System.out.println(" " );
				
					
			}
			else
			{
				System.out.println(" " );
				System.out.println(RED+"INVALID NUMBER PLEASE TRY AGAIN"+RESET);
				System.out.println(" " );debit();
			}
			System.out.println(YELLOW+"EXPIRY DATE:"+RESET);
			System.out.println("(dd/mm/yyyy)");
			String date=sc.next();
			System.out.println(" " );
			System.out.println(CYAN+"CVV NUMBER:"+RESET);
			System.out.println("(must be 3 digits)");
			int cvv=sc.nextInt();
			System.out.println(" ");
			otp();
		}
}

class Test
{
   public static void main(String[]args)
  { 
	login obj=new login();
        obj.mobile();
  } 
}