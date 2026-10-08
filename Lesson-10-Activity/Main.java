
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}
 /*Challenge 1:

Write a function "gpa" that takes in the GPA value and returns the calcuation : if it's over 90, return gpa*1.1, otherwise return the raw gpa.*/
double gpa(double GPA){
	if (gpa > 90){
		return gpa * 1.1;
	}else{
		return gpa;
	}
}
/*
Challenge 2:

Write a function "isGraduating" that accepts the grade level and number of credits earned that returns the boolean value TRUE if a student is a Senior and has 44 or more credits, otherwise return FALSE.


In the init function:
Display to console "Student is Graduating" or "Student is NOT Graduating" depending on the value return by the function.*/

String isGraduating(String grade, int credits){
	if (grade == "Senior" && credits >= 44){
		return "Student is Graduating";
	}else{
		return "Student is NOT Graduating";
	}
}

/* 
Challenge 3:
BMI
Write a function "BMI" that accepts a weight in pounds and 
height in inches. Calculate the BMI (google the formula) and 
return return the following:
    BMI 18.4 or less return Underweight
    BMI is 18.5 - 24.9	(inclusive) return Normal
    BMI is 25.0 - 39.9	(inclusive) return Overweight
    BMI is 40.0	or greater return  Obese  */

*/

String BMI(double weight, double height){
	form = (weight/Math.pow(height,2)) * 703;
	if (form < 18.5){
		return "Underweight";
	} else if (form >= 18.5 && form <= 24.9){
		return "Normal";
	} else if (form >= 25 && form <= 39.9){
		return "Overweight";
	} else{
		return "Obese";
	}
}

/*
Challenge 4:

Write a function "shippingCost" that accepts a weigth 
in units of pounds and returns:
      - 0.00, if 10 pounds or less,
      - 5.00, if more than 10 pounds but 15 pounds 
        or less,
      - 10.00, if more than 15 pounds but 25 pounds 
        or less,
      - 10.00 Plus 2 cents per pound over 25 pound, 
        if over 25 pounds.  */

double shippingCost(double pounds){
	if (pounds <= 10){
		return 0.00;
	} else if (pounds >= 10 && pounds <= 15){
		return 5.00;
	} else if (pounds >= 15 && pounds <= 25){
		return 10.00;
	} else if (pounds > 25){
		return 10.00 + (0.02 * pounds);
	}
/*
Challenge 5:

Write a function "blueOrViolet" that accepts a light frequency in THz units and returns true for either blue frequence (600-670 THz) or violet frquence (700-750 THz), otherwise return false
*/

String blueOrViolet(double THz){
	if (THz >= 600 && THz <= 670){
		return "True";
	} else if (THz >= 700 && THz <= 750){
		return "False";
	}
}

	void init(){
  
   

  }

 
  
}