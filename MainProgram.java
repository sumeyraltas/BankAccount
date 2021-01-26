import java.util.*;


public class MainProgram {

	public static void main(String[] args) {
		

		 ArrayList<Person> personArrL = new ArrayList<Person>();
	     ArrayList<Bank> bankArrL = new ArrayList<Bank>();
	     ArrayList<BankAccount>  bankAccountArrL = new ArrayList<BankAccount>();
		
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a command: ");
		String command = scan.next();

		while (!command.equals("Q")) {
			
			switch (command) {
			
			case "createPerson":
			
				String firstName = scan.next();
				String lastName = scan.next();
				String birthDay = scan.next();
				//Address 
				String streetP = scan.next();
				String cityP = scan.next();
				String postCodeP = scan.next();
				String countryP = scan.next();
				
				Address address = new Address(streetP, cityP, postCodeP, countryP);
				
				Person person = new Person(firstName, lastName,  address , birthDay );
				
				System.out.println(person.toString());
				
				personArrL.add(person);
				
				break;
				
			case "createBank":
				
				String bankName = scan.next();
				//Address
				String streetB = scan.next();
				String cityB = scan.next();
				String postCodeB = scan.next();
				String countryB = scan.next();
				
				Address bankAddress = new Address(streetB, cityB, postCodeB, countryB);
				
				Bank bank = new Bank(bankName, bankAddress );
				
				System.out.println(bank.toString());
				
				bankArrL.add(bank);
				
				break;
				
			case "createBankAccount":
				
				
				//personIndex
				//bankIndex
				int personIndex = scan.nextInt();
				int bankIndex = scan.nextInt();
				double balance = scan.nextDouble();
				int accountNumber = scan.nextInt();
				
				BankAccount bankAccount1 = new BankAccount(bankArrL.get(bankIndex), personArrL.get(personIndex), balance, accountNumber);
				
			
				System.out.println(bankAccount1.toString());
				 
				bankAccountArrL.add(bankAccount1);
				
				break;
				
			case "withdraw":
				
				int accountNumber1 = scan.nextInt();
				double amount1 = scan.nextDouble();
				
				 for(int i = 0 ; i < bankAccountArrL.size();i++){
	                    if(bankAccountArrL.get(i).getAccountNumber()==accountNumber1){
	                    	
	                    	if (bankAccountArrL.get(i).withdraw(amount1) == -1){
	                            System.out.println("Cannot withdraw a bigger amount than balance.");
	                        }
	                        else{
	                            System.out.println(bankAccountArrL.get(i).toString());
	                        }
	                        break;
	                    }

	                }
			
				
				
				break;
				
			case "deposit":
				
				int accountNumber2 = scan.nextInt();
				double amount2 = scan.nextDouble();
				
			    for(int i = 0 ; i < bankAccountArrL.size();i++){
                    if(bankAccountArrL.get(i).getAccountNumber()==accountNumber2){

                    	bankAccountArrL.get(i).deposit(amount2) ;
                        System.out.println(bankAccountArrL.get(i).toString());

                        break;
                    }

                }
			
				
				break;
				

			case "changeAccountNum":
				
				
				int accountNumIndex = scan.nextInt();
				int newaccountNumIndex = scan.nextInt();
				
				
					
					for(int i = 0 ; i < bankAccountArrL.size() ; i++) { 
					 	
					//personArrL.get(index);	
						if(bankAccountArrL.get(i).getAccountNumber() == accountNumIndex) {
						   
							bankAccountArrL.get(i).setAccountNumber(newaccountNumIndex);
					
							//bankAccountArrL.set(accountNumIndex , newaccountNumIndex);
							
							System.out.println(personArrL.get(i).toString());
							System.out.println("New account number: " + newaccountNumIndex);
						
					}
				
					}
				
				
				break;
				
			}

			
			System.out.println("Enter a command: ");
			command = scan.next();
			
			
		}
	}
}