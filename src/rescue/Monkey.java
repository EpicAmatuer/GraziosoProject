/* James Greene
 * 2-25-2024 */

package rescue;

public class Monkey extends RescueAnimal {
    
	// Instance variables
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;

	// Constructor
	public Monkey(String name, String species, String gender, String age, String weight, String tailLength,
	String height, String bodyLength, String acquisitionDate, String acquisitionCountry, String trainingStatus,
	boolean reserved, String inServiceCountry) {
		setName(name);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
	}
    
	// Accessors and Mutators
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String monkeySpecies) {
        this.species = monkeySpecies;
	}

	public String getTailLength() {
		return tailLength;
	}

	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
}
