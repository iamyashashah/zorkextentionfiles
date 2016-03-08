package zorkfiles;


import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter; 
import java.io.IOException; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.FileReader;

public class zorkextentionfiles {

	static Scanner darkly = new Scanner(System.in);
	static int [] entryFlag = new int [8];
	static Random rnd1 = new Random ();
	static double [] money = {200, 600, 800, 1000, 1200, 1500, 1800, 9999};
	static double [] collected =new double [8];
	static String [] thingSee =new String[8];
	int total  ;
	int[]amt;
	static String []roomNum;
	static int roomCount = 0;


	private static void roomDescribe(String where, String[] stuff, String directions)
	{


		System.out.println("You are in " + where);

		for (String thing : stuff) {
			System.out.println("You see " + thing);
		}

		System.out.println("You can go " + directions);





	}

	public static void room1()
	{   

		countMoney();
		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		thingSee[0]=things[0];

		entryFlag[0]=1;
		if (collected[0]==0)
		{
			collected[0]=money[0];
			money[0]=0;
		}
		String direct = " to the north (n) or the south (s)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room2();
			}
			else if(choice.equals("s"))
			{
				System.out.println("You have chosen to exit");
				ghost();
				countRooms();


				countMoney();
				ThingsSeen();
				System.exit(0);
			}
		} while (1==1);
	}

	public static void room2()
	{
		countMoney();
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a phone";
		thingSee[1]=things[0];
		entryFlag[1]=1;
		if (collected[1]==0)
		{
			collected[1]=money[1];
			money[1]=0;
		}
		String direct = " to the east (e), the south (s) or the west (w)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room1();
			} else if (choice.equals("e")) 
			{
				room4();
			} else if (choice.equals("w")) 
			{
				room3();
			}
		} while (1==1);
	}
	public static void room3()
	{
		countMoney();
		String place = "library";
		String[] things = new String[1];
		things[0] = "spiders";
		thingSee[2]=things[0];
		entryFlag[2]=1;
		if (collected[2]==0)
		{
			collected[2]=money[2];
			money[2]=0;
		}
		String direct = " to the east (e) or the north (n)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room5();
			} else if (choice.equals("e")) 
			{
				room2();
			}
		} while (1==1);
	}
	public static void room4()
	{
		countMoney();
		String place = "the kitchen";
		String[] things = new String[1];
		things[0] = "bats";
		thingSee[3]=things[0];
		entryFlag[3]=1;
		if (collected[3]==0)
		{
			collected[3]=money[3];
			money[0]=0;
		}
		String direct = "  the north (n) or the west (w)";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("n")) 
			{
				room7();
			} 
			else if (choice.equals("w")) 
			{
				room2();
			}
		} while (1==1);
	}
	public static void room5()
	{
		countMoney();
		String place = "the dining Room";
		String[] things = new String[2];
		things[0] = "dust";
		things[1] = "boxes";
		thingSee[0]=things[0] +"and" +things[1];
		entryFlag[4]=1;
		if (collected[4]==0)
		{
			collected[4]=money[4];
			money[4]=0;
		}
		String direct = " to the south (s) ";

		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room1();
			}
		} while (1==1);
	}
	public static void room6()
	{

		countMoney();
		Random rnd =new Random();
		Scanner sc = new Scanner(System.in);
		//int random =3; Testing purpose
		int random = rnd.nextInt(4);
		int guess; // to open door of secret room
		String place = "vault";
		String[] things = new String[1];
		things[0] = "3 walking skeletons";
		thingSee[5]=things[0];
		entryFlag[5]=1;
		if (collected[5]==0)
		{
			collected[5]=money[5];
			money[5]=0;
		}
		String direct = " to the east (e)";

		do{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("e"))
			{

				System.out.println("Guess a number from 1 to 4 to find treasure!!!");


				guess = sc.nextInt();
				if(guess == random)
				{
					room8();
				}
				else {
					room7();
				}
			}
		} while (1==1);
	}

	public static void room7()
	{
		countMoney();
		String place = "parlor";
		String[] things = new String[1];
		things[0] = "treasure chest";
		thingSee[6]=things[0];
		entryFlag[6]=1;
		if (collected[6]==0)
		{
			collected[6]=money[6];
			money[6]=0;
		}
		String direct = " the south (s) or the west (w)";


		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("s")) 
			{
				room4();
			}  else if (choice.equals("w")) 
			{
				room6();
			}
		} while (1==1);
	}
	public static void room8()
	{
		countMoney();
		String place = "the secret";
		String[] things = new String[1];
		things[0] = "piles of gold";
		thingSee[7]=things[0];
		entryFlag[7]=1;
		String direct = " to the west (w)";
		if (collected[7]==0)
		{
			collected[7]=money[7];
			money[7]=0;
		}


		do
		{
			roomDescribe(place, things, direct);

			String choice = darkly.next();

			if (choice.equals("w")) 
			{
				room6();
			} 
		} while (1==1);
	}
	public static void ghost()
	{
		Random rnd = new Random();
		int rand = rnd.nextInt(4);
		if(rand == 3)
			System.out.println("You are being followed: "+rand);
		else
			System.out.println("You are Safe!!");


	}
	public static void main(String[] args) {
		for(int i =0;i<8;i++)
		{
			entryFlag[i] =0;
			thingSee[i] = "";
			collected[i] = 0;

		}
		room1();

	}
	public static void countRooms()
	{
		int roomCount=0;

		try 
		{


			File file = new File("noroomsvisited");
			file.createNewFile();

			PrintWriter pw = new PrintWriter(file);

			for(int i=0;i<8;i++)
			{
				roomCount+=entryFlag[i];

			}
			pw.println("Total Rooms Visited: " + roomCount);
			pw.flush();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ( (line = br.readLine())!= null)
			{
				System.out.println(line);
			}
			br.close();


		}catch (IOException e) {
			System.out.println("Oops! An error occurred.");
		}
	}
	public static void countMoney()
	{
		try 
		{
			File file = new File("moneycollected");
			file.createNewFile();

			PrintWriter pw = new PrintWriter(file);

			int totalMoney=0;
			for(int i=0;i<8;i++)
			{
				totalMoney+=collected[i];
				pw.println("money in room " + i +  collected[i]);
			}
			System.out.println("Total Money accumulated: " + totalMoney);

			pw.println("Total money: " + totalMoney);
			pw.flush();

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			br.close();

		}catch (IOException e) {
			System.out.println("Oops! An error occurred.");
		}
	}


	public static void ThingsSeen()
	{
		try 
		{


			File file = new File("thingsseen");
			file.createNewFile();

			PrintWriter pw = new PrintWriter(file);
			for(int i=0;i<8;i++)
			{
				pw.println("Things seen along the way: "+ i + " " + thingSee[i]);
				pw.flush();

			}
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ( (line = br.readLine())!= null)
			{
				System.out.println(line);
			}
			br.close();


		}catch (IOException e) {
			System.out.println("Oops! An error occurred.");
		}
	}
}



