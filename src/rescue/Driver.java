/* James Greene
 * IT-145-X3331
 * Project Two - Driver
 * Due: 2-25-2024 */

package rescue;

// Functional Imports
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
	private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		initializeDogList();
		initializeMonkeyList();
		String selection = "";

		// Main menu
		while (!selection.equalsIgnoreCase("q")) {
			displayMenu();
			selection = scnr.nextLine();

			switch (selection) {
			case "1":
				intakeNewDog(scnr);
				break;
			case "2":
				intakeNewMonkey(scnr);
				break;
			case "3":
				reserveAnimal(scnr);
				break;
			case "4":
				printAnimals("dog");
				break;
			case "5":
				printAnimals("monkey");
				break;
			case "6":
				printAnimals("available");
				break;
			case "q":
				System.out.println("Quitting application");
				break;
			default:
				System.out.println("Invalid selection. Please try again.");
			}
		}
	}

	// This method prints the menu options

	public static void displayMenu() {
		System.out.println("\n\n");
		System.out.println("\t\t\t\tRescue Animal System Menu");
		System.out.println("[1] Intake a new dog");
		System.out.println("[2] Intake a new monkey");
		System.out.println("[3] Reserve an animal");
		System.out.println("[4] Print a list of all dogs");
		System.out.println("[5] Print a list of all monkeys");
		System.out.println("[6] Print a list of all animals that are not reserved");
		System.out.println("[q] Quit application");
		System.out.println();
		System.out.println("Enter a menu selection");
	}

	// Adds dogs to a list for testing

	public static void initializeDogList() {
		Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
				false, "United States");

		Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
				"United States");

		Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
				"Canada");

		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
	}

	// Adds monkeys to a list for testing

	public static void initializeMonkeyList() {
		Monkey Monkey1 = new Monkey("Kong", "Marmoset", "Male", "6", "7.5", "17.3", "17", "31.2", "3-17-2018", "India",
				"in service", false, "Mexico");

		monkeyList.add(Monkey1);
	}


	// New dog intake method
	public static void intakeNewDog(Scanner scanner) {
		System.out.println("What is the dog's name?");
		String name = scanner.nextLine();
		// Check for exiting dog in system
		for (Dog dog : dogList) {
			if (dog.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis dog is already in our system\n\n");
				return; // returns to menu
			}
		}

		// Instantiate new dog attributes
		System.out.println("Enter the breed of the dog:");
		String breed = scanner.nextLine();

		System.out.println("Enter the dog gender:");
		String gender = scanner.nextLine();

		System.out.println("Enter the dog age:");
		String age = scanner.nextLine();

		System.out.println("Enter the dog weight:");
		String weight = scanner.nextLine();

		System.out.println("Enter the acquisition date of the dog:");
		String acquisitionDate = scanner.nextLine();

		System.out.println("Enter the acquisition country of the dog:");
		String acquisitionCountry = scanner.nextLine();

		System.out.println("Enter the training status of the dog:");
		String trainingStatus = scanner.nextLine();

		System.out.println("Is the dog reserved? (true/false):");
		boolean reserved = Boolean.parseBoolean(scanner.nextLine());

		System.out.println("Enter the dog service country:");
		String inServiceCountry = scanner.nextLine();

		Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
				reserved, inServiceCountry);

		dogList.add(newDog);
		System.out.println(name + " has been added to the system.");

	}

	//New monkey intake method
	public static void intakeNewMonkey(Scanner scanner) {
		System.out.println("What is the monkey's name?");
		String name = scanner.nextLine();
		// Check for existing monkey in system
		for (Monkey monkey : monkeyList) {
			if (monkey.getName().equalsIgnoreCase(name)) {
				System.out.println("\n\nThis monkey is already in our system\n\n");
				return; // returns to menu
			}
		}

		// Display allowed monkey species
		List<String> allowedSpecies = Arrays.asList("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel Monkey",
				"Tamarin");

		String species = "";
		boolean validSpecies = false;
		
		// Check for requested species against those allowed
		while (!validSpecies) {
			System.out.println(
			"Enter the species of the monkey - (Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin): ");
			species = scanner.nextLine();
			if (allowedSpecies.contains(species)) {
				validSpecies = true;
			}

			else {
				System.out.println("Please enter a valid species from the list provided.");
			}
		}

		//Instantiate remaining monkey attributes
		System.out.println("Enter the monkey gender:");
		String gender = scanner.nextLine();

		System.out.println("Enter the monkey age:");
		String age = scanner.nextLine();

		System.out.println("Enter the monkey weight:");
		String weight = scanner.nextLine();

		System.out.println("Enter the monkey tail length:");
		String tailLength = scanner.nextLine();

		System.out.println("Enter the monkey height:");
		String height = scanner.nextLine();

		System.out.println("Enter the monkey body length:");
		String bodyLength = scanner.nextLine();

		System.out.println("Enter the acquisition date of the monkey:");
		String acquisitionDate = scanner.nextLine();

		System.out.println("Enter the acquisition country of the monkey:");
		String acquisitionCountry = scanner.nextLine();

		System.out.println("Enter the training status of the monkey:");
		String trainingStatus = scanner.nextLine();

		System.out.println("Is the monkey reserved? (true/false):");
		boolean reserved = Boolean.parseBoolean(scanner.nextLine());
		
		System.out.println("Enter the monkey service country:");
		String inServiceCountry = scanner.nextLine();

		Monkey newMonkey = new Monkey(name, species, gender, age, weight, tailLength, height, bodyLength,
		acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);

		monkeyList.add(newMonkey);
		System.out.println(name + " has been added to the system.");

		}

	// reserveAnimal method
	public static void reserveAnimal(Scanner scanner) {
		System.out.println("Enter the type of animal to reserve (dog/monkey):");
		String animalType = scanner.nextLine().toLowerCase();
		System.out.println("Enter the in-service country of the animal:");
		String inServiceCountry = scanner.nextLine();

		boolean found = false;

		// Check requested animal type and Service country for availability
		if (animalType.equals("dog")) {
			for (Dog dog : dogList) {
				if (!dog.getReserved() && dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) {
					dog.setReserved(true);
					System.out
							.println(dog.getName() + " from " + inServiceCountry + " has been successfully reserved.");
					found = true;
					break;
				}
			}
		} else if (animalType.equals("monkey")) {
			for (Monkey monkey : monkeyList) {
				if (!monkey.getReserved() && monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry)) {
					monkey.setReserved(true);
					System.out.println(
							monkey.getName() + " from " + inServiceCountry + " has been successfully reserved.");
					found = true;
					break;
				}
			}
		} else {
			System.out.println("Invalid animal type entered. Please try again.");
			return;
		}

		if (!found) {
			System.out.println("No available " + animalType + " in " + inServiceCountry + " found.");
		}
	}

	// Print animals method
	public static void printAnimals(String listType) {
		// Print all dogs
		if ("dog".equalsIgnoreCase(listType)) {
			System.out.println("List of all dogs:");
			for (Dog dog : dogList) {
				System.out.println(
						"Name: " + dog.getName() + ", Status: " + dog.getTrainingStatus() + ", Acquisition Country: "
								+ dog.getAcquisitionLocation() + ", Reserved: " + dog.getReserved());
			}
		} 
		
		// Print all monkeys
		else if ("monkey".equalsIgnoreCase(listType)) {
			System.out.println("List of all monkeys:");
			for (Monkey monkey : monkeyList) {
				System.out.println("Name: " + monkey.getName() + ", Status: " + monkey.getTrainingStatus()
						+ ", Acquisition Country: " + monkey.getAcquisitionLocation() + ", Reserved: "
						+ monkey.getReserved());
			}
		} 
		
		// Print only fully trained and not reserved animals
		else if ("available".equalsIgnoreCase(listType)) {
			System.out.println("List of all available animals (in service and not reserved):");
			for (Dog dog : dogList) {
				if ("in service".equalsIgnoreCase(dog.getTrainingStatus()) && !dog.getReserved()) {
					System.out.println(
							"Dog Name: " + dog.getName() + ", Acquisition Country: " + dog.getAcquisitionLocation());
				}
			}
			for (Monkey monkey : monkeyList) {
				if ("in service".equalsIgnoreCase(monkey.getTrainingStatus()) && !monkey.getReserved()) {
					System.out.println("Monkey Name: " + monkey.getName() + ", Acquisition Country: "
							+ monkey.getAcquisitionLocation());
				}
			}
		} 
		
		// Open end for future additional menu options
		else {
			System.out.println("This option needs to be implemented.");
		}
	}
}