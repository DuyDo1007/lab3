package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
public DigitalVideoDisc(String title) {
    this.title = title;
}

public DigitalVideoDisc(String category, String title, float cost) {
    this.category = category;
    this.title = title;
    this.cost = cost;
}

public void setTitle(String title) {
	this.title = title;
}

public void setCategory(String category) {
	this.category = category;
}

public void setDirector(String director) {
	this.director = director;
}

public void setLength(int length) {
	this.length = length;
}

public void setCost(float cost) {
	this.cost = cost;
}

public DigitalVideoDisc(String director, String category, String title, float cost) {
    this.director = director;
    this.category = category;
    this.title = title;
    this.cost = cost;
}

public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    this.title = title;
    this.category = category;
    this.director = director;
    this.length = length;
    this.cost = cost;
}
public String getTitle() {
    return title;
}

public String getCategory() {
    return category;
}

public String getDirector() {
    return director;
}

public int getLength() {
    return length;
}

public float getCost() {
    return cost;
}
private static int nbDigitalVideoDiscs = 0;
private int id;
public DigitalVideoDisc(String title) {
    this.title = title;
    nbDigitalVideoDiscs++;
    this.id = nbDigitalVideoDiscs;
}
public boolean isMatch(String title) {
	if (this.title == title) return true;
	return false;
}

@Override
public String toString() {
    return "DVD - " + title +"-"+ category +"-"+ director +"-" +length +":" + cost + "$";
}

}


