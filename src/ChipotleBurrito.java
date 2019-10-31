import java.util.ArrayList;
import java.util.Random;

public class ChipotleBurrito {
    public static void main(String[] args) {

        for (int i = 0; i < 25; i++) {

            //Rice List
            ArrayList<String> rice = new ArrayList<String>();

            rice.add("White rice");
            rice.add("Brown rice");
            rice.add("No rice");
            rice.add("All rice");

            //Select an random rice from the Rice list
            Random rnd = new Random();
            int r = rnd.nextInt(3);
            String rice1 = rice.get(r);

            //Meat list
            ArrayList<String> meat = new ArrayList<String>();

            meat.add("Chicken");
            meat.add("Steak");
            meat.add("Carnidas");
            meat.add("Chorizo");
            meat.add("Sofritas");
            meat.add("Veggie");
            meat.add("No meat");
            meat.add("All meat");

            //Select a random meat from the list
            int m = rnd.nextInt(7);
            String meat1 = meat.get(m);

            //Beans list
            ArrayList<String> beans = new ArrayList<String>();

            beans.add("Pinto beans");
            beans.add("Black beans");
            beans.add("No beans");

            //Select a random bean from the list
            int b = rnd.nextInt(2);
            String bean1 = beans.get(b);

            //Salsa list
            ArrayList<String> salsas = new ArrayList<String>();

            salsas.add("Mild salsa");
            salsas.add("Medium salsa");
            salsas.add("Hot salsa");
            salsas.add("No salsa");
            salsas.add("All salsas");

            //Select a random salsa from the list
            int s = rnd.nextInt(4);
            String salsa1 = salsas.get(s);

            //Veggies list
            ArrayList<String> veggies = new ArrayList<String>();

            veggies.add("Lettuce");
            veggies.add("Fajitas");
            veggies.add("Veggies");
            veggies.add("No veggies");
            veggies.add("all veggies");

            //Select a random veggie from the list
            int v = rnd.nextInt(4);
            String veggie1 = veggies.get(v);

            //Cheese list
            ArrayList<String> cheese = new ArrayList<String>();

            cheese.add("Cheese");
            cheese.add("No cheese");

            //Select a random cheese from the list
            int c = rnd.nextInt(1);
            String cheese1 = cheese.get(c);


            //Guacamole list
            ArrayList<String> guaca = new ArrayList<String>();

            guaca.add("Guacamole");
            guaca.add("No Guacamole");

            //Select a random guacamole choice from the list
            int g = rnd.nextInt(1);
            String guaca1 = guaca.get(g);

            //Queso list
            ArrayList<String> queso = new ArrayList<String>();

            queso.add("Queso");
            queso.add("No Queso");

            //Select a random queso choice from the list
            int q = rnd.nextInt(1);
            String queso1 = queso.get(q);

            //Sour cream list
            ArrayList<String> sourCream = new ArrayList<String>();

            sourCream.add("Sour Cream");
            sourCream.add("No Sour Cream");

            //Select a random sour cream choice from the list
            int sc = rnd.nextInt(1);
            String sourCream1 = sourCream.get(sc);


            //Print 25 Burritos
            System.out.println("Burrito " + (i + 1) + ": " + rice1 + ", " + meat1 + ", " + bean1 +
                    ", " + salsa1 + ", " + veggie1 + ", " + cheese1 + ", " + guaca1 + ", " + queso1 +
                    ", " + sourCream1);


            ArrayList<String> burritos = new ArrayList<String>();
            burritos.add(rice1);
            burritos.add(meat1);
            burritos.add(bean1);
            burritos.add(salsa1);
            burritos.add(veggie1);
            burritos.add(cheese1);
            burritos.add(guaca1);
            burritos.add(queso1);
            burritos.add(sourCream1);

            //call the method and print the sum
            double totalOrder =  price(burritos);
            System.out.println("Total is: $" + totalOrder);



        }  //close for loop

    }//closing main method

    //Lets add the method here
    public static double price(ArrayList<String> burritos){

        double total = 3.00;
        for (int i = 0; i < burritos.size(); i++) {
            String rice1 = burritos.get(i);
            String meat1 = burritos.get(i);
            String bean1 = burritos.get(i);
            String salsa1 = burritos.get(i);
            String veggie1 = burritos.get(i);
            String cheese1 = burritos.get(i);
            String guaca1 = burritos.get(i);
            String queso1 = burritos.get(i);
            String sourCream1 = burritos.get(i);


            //compute total price

            //compute meat
            if(rice1.equalsIgnoreCase("brown rice") ||
                    rice1.equalsIgnoreCase("white rice")){
                total = total + 0.50;
            }
            else if(rice1.equalsIgnoreCase("all rice")){
                total = total + 1.00;
            }

            //compute chicken
            if(meat1.equalsIgnoreCase("steak") ||
                    meat1.equalsIgnoreCase("chicken") ||
                    meat1.equalsIgnoreCase("carnidas") ||
                    meat1.equalsIgnoreCase("chorizo") ||
                    meat1.equalsIgnoreCase("sofritas") ||
                    meat1.equalsIgnoreCase("veggie")) {
                total = total + 0.50;
            }
            else if(meat1.equalsIgnoreCase("all meat")) {
                total = total  + 3.00;
            }

            //compute beans
            if(bean1.equalsIgnoreCase("black beans") ||
                    bean1.equalsIgnoreCase("pinto beans")){
                total = total + 0.50;
            }
            else if(bean1.equalsIgnoreCase("all beans")) {
                total = total  + 1.00;
            }

            //compute salsas
            if(salsa1.equalsIgnoreCase("mild salsa") ||
                    salsa1.equalsIgnoreCase("medium salsa") ||
                    salsa1.equalsIgnoreCase("hot salsa")) {
                total = total + 0.50;
            }
            else if(salsa1.equalsIgnoreCase("all salsas")) {
                total = total  + 1.50;
            }

            //compute veggies
            if(veggie1.equalsIgnoreCase("lettuce") ||
                    veggie1.equalsIgnoreCase("fajita") ||
                    veggie1.equalsIgnoreCase("veggies")){
                total = total + 0.50;
            }
            else if(veggie1.equalsIgnoreCase("all veggies")){
                total = total + 1.50;
            }

            //compute cheese
            if(cheese1.equalsIgnoreCase("cheese")){
                total = total + 0.50;
            }

            //compute guacamole
            if(guaca1.equalsIgnoreCase("guacamole")){
                total = total + 0.50;
            }

            //compute queso
            if(queso1.equalsIgnoreCase("queso")){
                total = total + 0.50;
            }

            //compute sour cream
            if(sourCream1.equalsIgnoreCase("sour cream")){
                total = total + 0.50;
            }




        }//end-for loop inside the price method

        return total;

    }//End - price method


}//End



