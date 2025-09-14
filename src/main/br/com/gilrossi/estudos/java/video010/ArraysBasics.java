package video010;



public class ArraysBasics {
	public static void main(String[] args) {
		String [] pet = new String [] {"Totti", "Antonella"};
		String [] teamItaly = {"Buffon", "Del Piero", "Totti"};
		
		System.out.println(pet[1]);
		System.out.println(teamItaly.length);
		System.out.println(pet);
		System.out.println(teamItaly);
		System.out.println(pet[0].equals(teamItaly[2]));
		
	}
}
