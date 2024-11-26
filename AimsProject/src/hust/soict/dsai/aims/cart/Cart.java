package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	private DigitalVideoDisc[] items = new DigitalVideoDisc[20];
	private int qtyOrdered = 0;
public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if (qtyOrdered < 20) {
        items[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added.");
    } else {
        System.out.println("The cart is almost full.");
    }
}
public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    for (int i = 0; i < qtyOrdered; i++) {
        if (items[i] == disc) {
            for (int j = i; j < qtyOrdered - 1; j++) {
                items[j] = items[j + 1];
            }
            items[qtyOrdered - 1] = null;
            qtyOrdered--;
            System.out.println("The disc has been removed.");
            return;
        }
    }
    System.out.println("The disc was not found in the cart.");
}
public float totalCost() {
    float total = 0;
    for (int i = 0; i < qtyOrdered; i++) {
        total += items[i].getCost();
    }
    return total;
}
public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    for (DigitalVideoDisc dvd : dvdList) {
        this.addDigitalVideoDisc(dvd);
    }
}
public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
    for (DigitalVideoDisc dvd : dvds) {
        this.addDigitalVideoDisc(dvd);
    }
}
public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    this.addDigitalVideoDisc(dvd1);
    this.addDigitalVideoDisc(dvd2);
}
public void print() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". " + items[i].toString());
    }
    System.out.println("Total cost: " + totalCost() + "$");
    System.out.println("***************************************************");
}
public void searchByTitle(String title) {
    boolean found = false;
    System.out.println("Searching for DVDs with title: " + title);
    for (int i = 0; i < qtyOrdered; i++) {
        if (items[i].isMatch(title)) {
            System.out.println((i + 1) + ". " + items[i].toString());
            found = true;
        }
    }
    if (!found) {
        System.out.println("No DVDs found with the title \"" + title + "\".");
    }
}
}

