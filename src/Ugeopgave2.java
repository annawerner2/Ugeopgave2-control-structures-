public class Ugeopgave2 {

    void main () {

/*Betingelser
Simple betingelser
Opgave 1: Shopping discount
Scenario: En butik giver 20% discount hvis totalPrice > 1000 kr.

Opgave: Beregn final price efter discount. */
/*
    double totalPrice = 1200.0;
    double finalPrice = 0;

    if (totalPrice > 1000) {
      finalPrice = totalPrice * 0.8;  // 20% discount
      System.out.println("Discount applied!");
    }

    System.out.println("Final price: " + finalPrice + " kr"); */


/*Betingelser med AND
Opgave 3: Time of day greeting
Scenario: Afhængig af hvad tid på dagen det er, skal der printes en passende besked. Hvis klokken er mellem 5-11 er det formiddag, eftermiddag (12-17), aften (18-21), nat (22-4).

Opgave: Klokken er 14. */

    /*int hour = 14;

    if (hour >= 5 && hour <= 11) {
      System.out.println("Good morning!");
    } else if (hour >= 12 && hour <= 17) {
      System.out.println("Good afternoon!");
    } else if (hour >= 18 && hour <= 21) {
      System.out.println("Good evening!");
    } else {
      System.out.println("Good night!");
    } */

    /*
Betingelser med OR
Opgave 5: Shipping eligibility
Scenario: Free shipping hvis: (totalPrice > 500) OR (isMember AND totalPrice > 200). Beregn shipping cost (0 hvis free, ellers 50 kr).
Test med totalPrice = 350, isMember = true. */

    /*
    double totalPrice = 350.0;
    boolean isMember = true;
    double shippingCost;

    if (totalPrice > 500 || (isMember && totalPrice > 200)) {
      shippingCost = 0.0;
      System.out.println("Free shipping!");
    } else {
      shippingCost = 50.0;
    }

    double finalTotal = totalPrice + shippingCost;
    System.out.println("Subtotal: " + totalPrice + " kr");
    System.out.println("Shipping: " + shippingCost + " kr");
    System.out.println("Total: " + finalTotal + " kr"); */

/*Kombinerede operatorer
Opgave 8: Insurance premium calculator
Scenario: Et forsikringsselskab beregner præmie baseret på risiko. Højere præmie gives hvis kunden er ung (under 25) eller ældre (over 70), har haft mere end 2 ulykker, eller bor i en risikozone.

Opgave: Skriv kode der beregner præmien. Basispræmie er 5000 kr, tillæg for høj risiko er 2000 kr. Test med age = 22, hasAccidents = false, accidents = 0, riskZone = false.
*/
/*
    int age = 22;
    boolean hasAccidents = false;
    int accidents = 0;
    boolean riskZone = false;

    int basePremium = 5000;
    int premium;

    if ((age < 25 || age > 70) || (hasAccidents && accidents > 2) || riskZone) {
      premium = basePremium + 2000;
      System.out.println("Higher risk category");
    } else {
      premium = basePremium;
      System.out.println("Standard risk category");
    }

    System.out.println("Annual premium: " + premium + " kr");
*/



//Switch-case
        /* Opgave 10: Restaurant menu pricing */
  /*  String item = "pizza";
    int quantity = 2;
    double price;

    switch (item) {
      case "burger":
        price = 89.0;
        break;
      case "pizza":
        price = 95.0;
        break;
      case "salad":
        price = 65.0;
        break;
      case "pasta":
        price = 79.0;
        break;
      case "steak":
        price = 145.0;
        break;
      default:
        price = 0.0;
        System.out.println("Item not found");
    }

    double total = price * quantity;

    System.out.println("Item: " + item);
    System.out.println("Price: " + price + " kr");
    System.out.println("Quantity: " + quantity);
    System.out.println("Total: " + total + " kr"); */



/* While loops
Opgave 15: Savings goal
Scenario: Du sparer 500 kr om måneden. Hvor mange måneder før du har 10,000 kr?

Opgave: Simulate saving med while loop.*/
   /*
    double savings = 0.0;
    double monthlyDeposit = 500.0;
    double goal = 10000.0;
    int months = 0;

    while (savings < goal) {
      savings += monthlyDeposit;
      months++;
      System.out.println("Month " + months + ": " + savings + " kr");
    }

    System.out.println("Goal reached in " + months + " months");
*/

/*For loops
Opgave 20: Savings calculator
Scenario: Du sparer 1000 kr om måneden i 12 måneder.

Opgave: Print savings efter hver måned.
 */
/*
    for (int n = 1; n <= 10; n++) {
      System.out.println("=== Table for " + n + " ===");
      for (int i = 1; i <= 10; i++) {
        System.out.println(n + " × " + i + " = " + (n * i));
      }
      System.out.println();
    }
 */

/*For loops med array
Opgave 24: Grade statistics
Scenario: En klasse har scores: {85, 92, 78, 88, 95, 73, 90}.

Opgave: Calculate:

Average
Højeste karakter
Laveste karakter
Antal over 80 */
/*
    int[] scores = {85, 92, 78, 88, 95, 73, 90};

// Average
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    double average = (double) sum / scores.length;

// Min and max
    int min = scores[0];
    int max = scores[0];
    for (int i = 1; i < scores.length; i++) {
      if (scores[i] < min) min = scores[i];
      if (scores[i] > max) max = scores[i];
    }

// Count above 80
    int countAbove80 = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > 80) {
        countAbove80++;
      }
    }

    System.out.println("=== GRADE STATISTICS ===");
    System.out.println("Average: " + average);
    System.out.println("Highest: " + max);
    System.out.println("Lowest: " + min);
    System.out.println("Scores above 80: " + countAbove80);*/


/* For-each loops
Opgave 29: Product inventory
Scenario: En skobutik har sko i 7 størrelser. Lad os sige fra str 38 til 44. På den første plads i tabellen kan man se at der er 45 par tilbage i størrelse 38.

Stock levels: {45, 12, 67, 8, 34, 5, 89}.

Hvis der er 10 eller færre par tilbage af en størrelse, skal der genbestilles.
Reorder threshold: 10.

Opgave: Tæl hvor mange størrelser, der skal genbestilles (stock <= 10). */

/*
    int[] stock = {45, 12, 67, 8, 34, 5, 89};
    int reorderThreshold = 10;
    int reorderCount = 0;

    for (int level : stock) {
      if (level <= reorderThreshold) {
        reorderCount++;
      }
    }

    System.out.println("Products needing reorder: " + reorderCount); */












    }



}
