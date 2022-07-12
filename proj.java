
import java.io.*;

class Main{
	void intro(){

		String name = null;

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		System.out.println("\nHii i am \"JARVIS\"... \n");
		System.out.println("How may i help you");
		System.out.print("Tell me your Beautiful name : ");

		try{
			name = br.readLine();
		}catch(IOException ie){
			System.out.println("Stream Closed...");
		}

		System.out.println("\n--> Hii "+name+",");
	//	System.out.println("I can do something like that\n\n");

	}

	void options(){
	System.out.println();
	System.out.println("1.Time\t2.Wikipedia\t3.Browser\t4.Google Search");
	System.out.println("5.bitcoin price\t6.Exit\t7.\t8.");	

	}

	public static void main(String[] args){

		int choice =0;
		int exit=0;
		Main m = new Main();

		m.intro();

		System.out.println("\nWhich technology you preffered ?");
		System.out.println("\t1.Command Line.\t\t2.Voice mode");
		//System.out.println("I can do something like that\n\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("--> ");
			choice = Integer.parseInt(br.readLine());

		} catch (IOException ie){
			System.out.println("Stream closed");
		}
		System.out.println("I can do something like that\n\n");

		if(choice == 1){
			int opt=0;

			do{
				m.options();
				System.out.print("--> ");
				try {
					 opt  = Integer.parseInt(br.readLine());
				} catch(IOException ie){
					
				}

				
				System.out.println("-----------------------------------------------------");	
				switch(opt){
					case 1 : System.out.println("In Time");
						 break;
					case 2 : System.out.println("In Wikipwdia");
						 break;
					case 3 : System.out.println("In Browser");
						 break;
					case 4 : System.out.println("In Google Search");
						 break;
					case 5 : System.out.println("In Bitcoin");
						 break;
					case 6 : exit = 1;
						 System.out.println("Than you... !!!");
						 break;
				}
				System.out.println("-----------------------------------------------------");	
			}while(exit != 1);

		}else if(choice == 2){
			System.out.println("Welcome to Voice based System");
			System.out.println("sorry for inconvenience, Work in progress !!! ");
		}
	}
}
