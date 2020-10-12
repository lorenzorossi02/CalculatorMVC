package logic.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Model {
    private static final Logger LOGGER = Logger.getLogger(Model.class.getName());
    public long calculate(long number1, long number2, String operator) {
    	try {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
             default:
            	 LOGGER.log(Level.INFO,"Unknown operator:   {}", operator);
                 return 0;
        }
    	}catch(ArithmeticException e) {
    		return 0;
    		
    	}
       
    }
}