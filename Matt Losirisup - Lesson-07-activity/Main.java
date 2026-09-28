
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  System.out.println("Name a value for x.");
  double x = Input.readDouble();
  System.out.println(Math.pow(x,7));
/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  System.out.println("Name a value for z.");
  double z = Input.readDouble();
  System.out.println((Math.pow(z,3) + 5));
/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
*/
  System.out.println("Name values for r and t.");
  double r = Input.readDouble();
  double t = Input.readDouble();
  System.out.println(Math.pow(t,5) * (Math.pow(r + 2, 4)));
/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
*/
  System.out.println("Name values for a and b.");
  double a = Input.readDouble();
  double b = Input.readDouble();
  System.out.println(Math.sqrt(a) + Math.sqrt(b));
/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
*/
  System.out.println("Name values for x1, x2, y1, y2.");
  double x1 = Input.readDouble();
  double x2 = Input.readDouble();
  double y1 = Input.readDouble();
  double y2 = Input.readDouble();
  double d = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
  System.out.println(d);
/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/





/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/




/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}