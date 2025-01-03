package lombokDemo;

public class TestPerson {

	public static void main(String[] args) {

		Person person = new Person("Nisha","Dubai");

		System.out.println(person.getName());   
        System.out.println(person.getAddress());
		person.setName("Sham");
		person.setAddress("Pune");

		System.out.println(person.getAddress());
		System.out.println(person);
	}

}
