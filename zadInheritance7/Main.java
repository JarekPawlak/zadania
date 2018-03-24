package zadInheritance7;

public class Main {

    public static void main(String[] args) {
        Employee person1 = new Employee("Jack", 32);
        Address newAddress = new Address("95-200", "Pabianice", "Zamkowa", 18);
        Address anotherAddress = new Address("90-361", "Łódź", "Piotrkowska", 250);
        person1.addNewAddress(newAddress);

        System.out.println(person1.showCurrentAddress());

        person1.addNewAddress(anotherAddress);
        System.out.println(person1.showCurrentAddress());

        person1.showAllAddresses();

        System.out.println(person1.introducePerson());

    }
}
