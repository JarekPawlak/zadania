package zadInheritance7;
/*
Utwórz klasę Pracownik zawierający pola imie, wiek oraz listę (np. ArrayList) adresów (klasa Address).
W klasie Pracownik dodaj metody
    zwrocWszystkieAdresy()
    zwrocAktualnyAdres() (który będzie zawsze na pozycji 0 w liście)
    dodajNowyAdres() (powinien być dodawany na pozycji 0)
    przedstawPracownika()
 */

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private int age;
    private List<Address> addressList = new ArrayList<>();

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addNewAddress(Address address) {
        addressList.add(0, address);
    }

    public String showCurrentAddress() {
        Address adr = addressList.get(0);
        return String.format("%s's current address is: %s %s, %s %s",
                getName(), adr.getCityCode(), adr.getCity(), adr.getStreet(), adr.getStreetNumber());
    }

    public void showAllAddresses() {
        System.out.println(getName() + "'s all addresses:");
        for (int i = 0; i < addressList.size(); i++) {
            Address adr = addressList.get(i);
            System.out.printf("Address #%s - City: %s %s, street: %s %s.\n",
                    i + 1, adr.getCityCode(), adr.getCity(), adr.getStreet(), adr.getStreetNumber());
        }
    }

    public String introducePerson() {
        Address adr = addressList.get(0);
        return MessageFormat.format(
                "Meet {0}, our employee. {0} is {1} years old, and currently lives in {2}, at {3} {4} street",
                getName(), getAge(), adr.getCity(), adr.getStreet(), adr.getStreetNumber());
    }
}
