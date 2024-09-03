package Oops.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight =-1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //  What is this ?
        // call the parent class constructor
        // used to intialize values present in parent class
        this.weight = weight;
    }
}
