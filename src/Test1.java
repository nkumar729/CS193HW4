public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;

   useIfElse
        if (operation == Operation.ADD) {
	 result = num1 + num2;
	} else if (operation == Operation.SUBTRACT) {
	 result = num1 - num2;
	} else if (operation == Operation.MULTIPLY) {
	 result = num1 * num2;
	} else if (operation == Operation.DIVIDE) {
	 if (num2 == 0) {
	  System.out.println("Can't divide by 0");
	 } else {
	  result = ((double)num1) / num2;
	 }
	}

	return result;
    }
