package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping, numberOfPeperoniTopping;


    public Pizza(char size, int numberOfCheeseTopping, int numberOfPeperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPeperoniTopping = numberOfPeperoniTopping;
    }



    public double calcCost(){
        double startingPrice = (size == 'S')? 10 : (size == 'M')? 12 : 14;

        double totalPrice = startingPrice + (numberOfCheeseTopping+numberOfPeperoniTopping) * 2;

        return totalPrice;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPeperoniTopping=" + numberOfPeperoniTopping +
                ", total price= $" + calcCost() +
                '}';
    }


}


/*
Pizza Task:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
