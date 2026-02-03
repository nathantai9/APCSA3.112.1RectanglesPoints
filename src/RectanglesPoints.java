import java.awt.geom.Point2D;
import java.util.Scanner;
import java.awt.Rectangle;
import java.awt.Point;
public class RectanglesPoints {
  // Check out the Rectangle class in the Java API:
  // https://docs.oracle.com/javase/8/docs/api/index.html?java/awt/Rectangle.html
  // Check out the Point class in the Java API:
  // https://docs.oracle.com/javase/8/docs/api/index.html?java/awt/Point.html

  // You will create ONE class with:
  // - 7 methods that work with Rectangles
  // - 2 methods that work with Points
  // - public static void main() app that contains code for 5 exercises


  /**
   * calculateArea(Rectangle rec)
   * 
   * Calculates the total area of the given Rectangle.
   *
   * @param rec The Rectangle object to be measured.
   * @return The area of the rectangle (width multiplied by height).
   * 
   *        Preconditions: rec is a rectangle object that is not null. 
   *        Postconditions: rec has not been changed. The method returns the 
   *        product of the rectangle's width and height.
   */
    // DONE define a public static method named calculate area
    //   public static double calculateArea(Rectangle rec) {
    //       // Calculate and return the area by multiplying rec's width and height.
    //         return ???
    //   }
    
    public static double calculateArea(Rectangle rec) {
          return rec.getWidth() * rec.getHeight();
    }

  /**
   * jumpRight(Rectangle rec)
   * 
   * Looks at Rectangle rec and returns a new Rectangle that is located
   * rec's width to the right of rec.
   *
   * @param rec The original Rectangle to be referenced.
   * @return A new Rectangle object shifted to the right.
   * 
   *         Preconditions: rec is a rectangle object that is not null. rec has a
   *         width greater than 0.
   *         Postconditions: rec has not been changed. The method returns a new
   *         Rectangle object with the same y-location but with an x-location that equals
   *         rec's x plus rec's width.
   */
  // DONE
    //   public static Rectangle jumpRight(Rectangle rec){
    //     // DONE construct a new Rectangle object with:
    //         //    - the same width and height as rec
    //         //    - the same y-location as rec but shifted to the right by width
    //     return ???
    //   }
    
    public static Rectangle jumpRight(Rectangle rec){
        return new Rectangle(rec.x + rec.width, rec.y, rec.width, rec.height);
    }


  /**
   * jumpDown(Rectangle rec)
   * 
   * Looks at Rectangle rec and returns a new Rectangle that is located
   * rec's height below rec.
   *
   * @param rec The original Rectangle to be referenced.
   * @return A new Rectangle object shifted downward.
   * 
   *         Preconditions: rec is a rectangle object that is not null. rec has a
   *         height greater than 0.
   *         Postconditions: rec has not been changed. The method returns a new
   *         Rectangle object with the same x-location but with a y-location that equals
   *         rec's y plus rec's height.
   */
  // DONE

    public static Rectangle jumpDown(Rectangle rec){
        return new Rectangle (rec.x, rec.y + rec.height, rec.width, rec.height);
    }

  /**
   * jumpLeft(Rectangle rec)
   * 
   * Looks at Rectangle rec and returns a new Rectangle that is located
   * rec's width to the left of rec.
   *
   * @param rec The original Rectangle to be referenced.
   * @return A new Rectangle object shifted to the left.
   * 
   *         Preconditions: rec is a rectangle object that is not null. rec has a
   *         width greater than 0.
   *         Postconditions: rec has not been changed. The method returns a new
   *         Rectangle object with the same y-location but with an x-location that equals
   *         rec's x minus rec's width.
   */
  // DONE

  public static Rectangle jumpLeft(Rectangle rec){
      return new Rectangle (rec.x - rec.width, rec.y, rec.width, rec.height);
  }

  /**
   * jumpUp(Rectangle rec)
   * 
   * Looks at Rectangle rec and returns a new Rectangle that is located
   * rec's height above rec.
   *
   * @param rec The original Rectangle to be referenced.
   * @return A new Rectangle object shifted upward.
   * 
   *         Preconditions: rec is a rectangle object that is not null. rec has a
   *         height greater than 0.
   *         Postconditions: rec has not been changed. The method returns a new
   *         Rectangle object with the same x-location but with a y-location that equals
   *         rec's y minus rec's height.
   */
  // DONE

    public static Rectangle jumpUp(Rectangle rec){
        return new Rectangle (rec.x, rec.y - rec.height, rec.width, rec.height);
    }

  /**
   * doubleSize(Rectangle rec)
   * 
   * Looks at Rectangle rec and returns a new Rectangle that has twice
   * the width and twice the height of rec.
   *
   * @param rec The original Rectangle to be referenced.
   * @return A new Rectangle object with doubled dimensions.
   * 
   *         Preconditions: rec is a rectangle object that is not null.
   *         Postconditions: rec has not been changed. The method returns a new
   *         Rectangle object with the same x and y coordinates, but with a width equal to
   *         rec's width * 2 and a height equal to rec's height * 2.
   */
  // DONE

    public static Rectangle doubleSize(Rectangle rec){
        return new Rectangle (rec.x, rec.y, rec.width * 2, rec.height * 2);
    }

  /**
   * growFixed(Rectangle rec, int amount)
   * 
   * Looks at Rectangle rec and returns a new Rectangle that is at the
   * same x and y location, but with dimensions increased by the specified amount.
   *
   * @param rec    The original Rectangle to be referenced.
   * @param amount The integer amount to be added to both width and height.
   * @return A new Rectangle object with increased dimensions.
   * 
   *         Preconditions: rec is a rectangle object that is not null.
   *         amount is a non-negative integer.
   *         Postconditions: rec has not been changed. The method returns a new
   *         Rectangle object with the same (x, y) coordinates, but with a
   *         width equal to (rec.width + amount) and a
   *         height equal to (rec.height + amount).
   */
  // DONE

    public static Rectangle growFixed(Rectangle rec, int amount){
        return new Rectangle (rec.x, rec.y, rec.width + amount, rec.height + amount);
    }

  /**
   * isTouching(Point p1, Point p2, double minimumDistance)
   * 
   * Determines if two points are close enough to be considered "touching"
   * based on a specified threshold.
   *
   * @param p1              The first Point object.
   * @param p2              The second Point object.
   * @param minimumDistance The maximum distance allowed for the points to be
   *                        "touching."
   * @return true if the distance between p1 and p2 is less than or equal to
   *         minimumDistance; false otherwise.
   * 
   *         Preconditions: p1 and p2 are not null. minimumDistance is
   *         non-negative.
   *         Postconditions: p1 and p2 have not been changed.
   */
  // DONE
    // Look at the Point API: https://docs.oracle.com/javase/7/docs/api/java/awt/Point.html
    // Find the distance between them, using the distance method (which is available because it is
    // inherited from a different class)
    //
    // if (distanceBetween <= minimumDistance){
    //     return true;
    // }

    public static boolean isTouching(Point p1, Point p2, double minimumDistance){
        double distanceBetween = p1.distance(p2);
        if (distanceBetween <= minimumDistance){
            return true;
        } else {
            return false;
        }
    }

  /**
   * findMidpoint(Point p1, Point p2)
   * 
   * Calculates the coordinates halfway between two points and returns
   * a new Point2D.Double object at the average x, average y location.
   * NOTE: use Point2D.Double middle = new Point2D.Double(x, y);
   *
   * @param p1 The first Point object.
   * @param p2 The second Point object.
   * @return A new Point2D.Double object located exactly between p1 and p2.
   * 
   *         Preconditions: p1 and p2 are not null.
   *         Postconditions: p1 and p2 have not been changed. The method returns
   *         a new Point with x at p1.x + p2.x / 2 and y at p1.y + p2.y / 2.
   *         For example, the midpoint of (3,3) and (4,4) is (3.5, 3.5)
   */
  // DONE
  // Point objects can only use int x and int y
  // This static method with return a new Point2D.Double object
  // NOTE: use Point2D.Double middle = new Point2D.Double(x, y);

    public static Point2D.Double findMidpoint(Point p1, Point p2){
        double midX = (p1.x + p2.x) / 2.0;
        double midY = (p1.y + p2.y) / 2.0;
        Point2D.Double middle = new Point2D.Double(midX, midY);
        return middle;
    }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    System.out.println("\n\n- ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -  Part 1 of 5 - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -");

    System.out.println("\nLet's explore the Java Rectangle library");
    System.out.println("Make a big Rectangle at the origin (0,0) with width 2000 and height 3000");

    // Look at the Rectangle API: https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html

    // Constuct a Rectangle named box1 at location (0,0) with a width of 2000 and height of 3000
    // DONE Rectangle box1 = ???
    Rectangle box1 = new Rectangle (0, 0, 2000, 3000);

    // use the static class method calculateArea to calculate the area and save in a variable named areaOfBox1
    // DONE ??? = ???
    int areaOfBox1 = (int) calculateArea(box1);
    System.out.println("\nGuess the area of box1!");
    System.out.print("Type a whole number: ");

    // collect user input and save it in a variable named areaGuess
    // DONE ??? = input.nextInt();
    int areaGuess = input.nextInt();
    if(areaOfBox1 == areaGuess){
        System.out.println("\nYou win!\n");
    } else {
        System.out.println("\nOh no! Your guess was not correct!\n");
    }

    // print the results
    System.out.println("You guessed " + areaGuess);
    System.out.println("Expect area 6000000");
    System.out.println("Actual area " + areaOfBox1);

    // Print box1 to reveal
    System.out.println(box1);

    

    System.out.println("\nI will use the setSize method to make box1 width 90,000 and the height 90,000");

    // use the Rectangle class setSize method to make box1 width 90,000 and the height 90,000
    // DONE
    box1.setSize(90000, 90000);
    // using static class method calculateArea to calculate the area and save in a variable named areaOfBox1
    areaOfBox1 = (int) calculateArea(box1);


    System.out.println("\nGuess the NEW area of box1!");
    System.out.print("Type a whole number: ");

    // collect user input and save it in a variable named areaGuess
    // DONE ??? = ???
    areaGuess = input.nextInt();
    if(areaOfBox1 == areaGuess){
        System.out.println("\nYou win!\n");
    } else {
        System.out.println("\nOh no! Your guess was not correct!\n");
    }

    // print the results
    System.out.println("You guessed " + areaGuess);
    System.out.println("Expect area 8100000000");
    System.out.println("Actual area " + areaOfBox1);

    // Print box1 to reveal
    System.out.println(box1);

    System.out.print("\nType any letter to continue: ");
    input.nextLine();
  

    
    System.out.println("\n\n- ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -  Part 2 of 5 - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -");

    System.out.println("\nLet's explore the methods in the Java Rectangle library");
    System.out.println("Compare the Rectangle class translate method and setLocation method\n");

    // Look at the Rectangle API: https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html

    // Constuct a Rectangle named box2 at location (6,7) with a width of 10 and height of 10
    // DONE Rectangle box2 = ???
    Rectangle box2 = new Rectangle (6, 7, 10, 10);
    System.out.println("I have constructed a Rectangle named box2 at location (6,7)");

    // Print the box2 to reveal where it is located
    System.out.println(box2);

    // Use the Rectangle class translate method to move it by 5 on the x-axis and 5 on the y-axis
    // DONE
    box2.translate(5, 5);
    System.out.println("\nGuess where box2 will be located after translate(5,5)");
    System.out.print("Guess the new x-location as a whole number: ");
    int xLocationGuess = input.nextInt();
    System.out.print("Guess the new y-location as a whole number: ");
    int yLocationGuess = input.nextInt();

    // Look at the Point API: https://docs.oracle.com/javase/8/docs/api/java/awt/Point.html

    // Use the user input to construct a new Point object named userGuess1
    // DONE Point userGuess1 = ???
    Point userGuess1 = new Point(xLocationGuess, yLocationGuess);

    // Use the Rectangle class getLocation method to get the new x,y coordinates as a Point object named translatePoint
    // DONE Point translatePoint = ???
    Point translatePoint = box2.getLocation();

    if(isTouching(translatePoint, userGuess1, 0.1) == true){
        System.out.println("\nYou win!\n");
    } else {
        System.out.println("\nOh no! Your guess was not correct!\n");
    }

    // Print the box2 to reveal where it is located
    System.out.println(box2);
    System.out.println("\nLocation (11,12) is the new location of box2");

    // Use the Rectangle class setLocation method to move it to 5 on the x-axis and 5 on the y-axis
    // DONE
    box2.setLocation(5, 5);

    System.out.println("\nGuess where box2 will be located after setLocation(5,5)");
    System.out.print("Guess the new x-location as a whole number: ");
    xLocationGuess = input.nextInt();
    System.out.print("Guess the new y-location as a whole number: ");
    yLocationGuess = input.nextInt();

    // Use the user input to construct a new Point object named userGuess2
    // DONE Point userGuess2 = ???
    Point userGuess2 = new Point(xLocationGuess, yLocationGuess);
    // using the Rectangle class getLocation method to get the new x,y coordinates as a Point object named setLocationPoint
    // DONE Point setLocationPoint = ???
    Point setLocationPoint = box2.getLocation();

    if(isTouching(setLocationPoint, userGuess2, 0.1) == true){
        System.out.println("\nYou win!\n");
    } else {
        System.out.println("\nOh no! Your guess was not correct!\n");
    }

    // Print the box2 to reveal where it is located
    System.out.println(box2);
    System.out.println("\nLocation (5,5) is the new location of box2");

    System.out.print("\nType any letter to continue: ");
    input.nextLine();
 
    System.out.println("\n\n- ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -  Part 3 of 5 - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -");

    System.out.println("\nThe Rectangle class grow method is weird\n");
    System.out.println("Compare the Rectangle class grow method and our static growFixed method");
    System.out.println("\nbox2 is currently width 10 and height 10");

    // Use the Rectangle class grow method to grow it by 1 horizontally and 1 vertically
    // DONE
    box2.grow(1, 1);
    System.out.println("Guess what the width of box2 will be after grow(1, 1)");
    System.out.print("Guess the new width as a whole number: ");
    int widthGuess = input.nextInt();

    if(widthGuess == 12){
        System.out.println("\nYou win!\n");
    } else {
        System.out.println("\nOh no! Your guess was not correct!\n");
    }

    // Print the box2 to reveal
    System.out.println(box2);
    System.out.println("\n12 is the new width of box2... isn't that weird?!?!?!?! Why?!");
    System.out.println("All of the sides moved by one. The left side moved left by one and the right side moved right by one.");
    System.out.println("Notice that it is not at (5,5) anymore... it's now at (4,4)?!");

    // Using the static class method growFixed to get a new Rectangle that is +1 wider and taller
    // Save the new Rectangle that gets returned in variable box2
    box2 = growFixed(box2, 1);

    System.out.println("\nGuess what the width of box2 will be after growFixed(1, 1)");
    System.out.print("Guess the new width as a whole number: ");
    widthGuess = input.nextInt();

    if(widthGuess == 13){
        System.out.println("\nYou win!\n");
    } else {
        System.out.println("\nOh no! Your guess was not correct!\n");
    }

    // Print the box2 to reveal
    System.out.println(box2);
    System.out.println("\n13 is the new width of box2");


    System.out.print("\nType any letter to continue: ");
    input.nextLine();

    System.out.println("\n\n- ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -  Part 4 of 5 - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -");
    
    System.out.println("\n\n• • • • • • • • • • CATCH THE MYSTERY SPOT! • • • • • • • • • •\n");
    System.out.println("I'm thinking of a random Point with an x 0-10 and a y 0-10");
    System.out.println("Try to catch the mystery point within your Rectangle!");

    // Constuct a Point object named mysterySpot with a random x 0-10, and a random y 0-10 use Math.random
    // DONE Point mysterySpot = ???
    int mysteryX = (int)(Math.random() * 11);
    int mysteryY = (int)(Math.random() * 11);
    Point mysterySpot = new Point(mysteryX, mysteryY);
    // Loop until the game is over or the user wants to quit
    while(true){
        System.out.println("\n• • • • • • • • • •");
        // Prompt the user for x and y.
        System.out.print("\nGive me the x-location as a whole number 0-10: ");
        xLocationGuess = input.nextInt();
        System.out.print("Give me the y-location as a whole number 0-10: ");
        yLocationGuess = input.nextInt();

        // Construct a Rectangle object named userBox.
        // DONE Rectangle userBox = ???
        Rectangle userBox = new Rectangle (xLocationGuess, yLocationGuess, 1, 1);
        System.out.println("\nPlease enter the width and height of your Rectangle");
        // Prompt the user for width and height.
        System.out.print("Give me the width as a whole number 0-10: ");
        int w = input.nextInt();
        System.out.print("Give me the height as a whole number 0-10: ");
        int h = input.nextInt();

        // Use the Rectangle class setSize method to adjust the width and height of userBox
        // DONE
        userBox.setSize(h, w);
        System.out.println("\nHere is your Rectangle");
        // Print the userBox to reveal where it is located
        System.out.println(userBox);

        boolean isCaught;
        // Look into the API documentation of the Rectangle class and find the contains method
        // https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html
        // Notice that there are multiple versions of the contains method
        // Use the Rectangle class contains method to see if the mysterySpot is within userBox
        // Store what the contains method returns in the variable isCaught
        // DONE isCaught = ???
        isCaught = userBox.contains(mysterySpot);
        if(isCaught == true){
            System.out.println("\nYou win!\n");
            break; // break out of the forever loop
        } else {
            System.out.println("\nOh no! Your Rectangle did NOT catch the mystery spot\n");
        }

        System.out.print("Try again? Type anything to try again or type Q to Quit: ");
        if(input.next().toLowerCase().equals("q")){
            break;
        }
    }
    System.out.println("\nThe mystery spot was located here...");
    // Print the mysterySpot to reveal where it is located
    System.out.println(mysterySpot);


    System.out.print("\nType any letter to continue: ");
    input.nextLine();

    System.out.println("\n\n- ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -  Part 5 of 5 - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ - ☺ -");

    System.out.println("\n\n☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐ FIND THE SECRET BOX! ☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐\n");
    System.out.println("The AP CSA student that coded this app has made a secret box");
    System.out.println("Try to guess a point within the box!");

    // Constuct a Rectangle object named secretBox with any x location, any y location, a width of 30, and height of 20
    // DONE Rectangle secretBox = ???
    int secretX = (int)(Math.random() *  (11 - 0 + 1)) + 0;
    int secretY = (int)(Math.random() *  (11 - 0 + 1)) + 0;
    Rectangle secretBox = new Rectangle (secretX, secretY, 30, 20);
    // Loop until the game is over or the user wants to quit
    while(true){
        System.out.println("\n☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐ ☐");
        // Prompt the user for x and y.
        System.out.print("\nGive me the x-location as a whole number 0-10: ");
        xLocationGuess = input.nextInt();
        System.out.print("Give me the y-location as a whole number 0-10: ");
        yLocationGuess = input.nextInt();

        // Construct a Point object named userGuess.
        Point userGuess = new Point(xLocationGuess, yLocationGuess);

        System.out.println("\nHere is your Point");
        System.out.println(userGuess);

        boolean isCaught;
        // Look into the API documentation of the Rectangle class and find the contains method
        // https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html
        // Notice that there are multiple versions of the contains method
        // Use the Rectangle class contains method to see if the userGuess is within secretBox
        // Store what the contains method returns in the variable isCaught
        // DONE isCaught = ???
        isCaught = secretBox.contains(userGuess);
        if(isCaught == true){
            System.out.println("\nYou win!\n");
            break; // break out of the forever loop
        } else {
            System.out.println("\nOh no! You didn't find the secret box!\n");
        }

        System.out.print("Try again? Type anything to try again or type Q to Quit: ");
        if(input.next().toLowerCase().equals("q")){
            break;
        }
    }
    System.out.println("\nThe secret box was located here...");
    // Print the secretBox to reveal where it was located
    System.out.println(secretBox);

    System.out.println("BYE!");
    input.close();

  }
}