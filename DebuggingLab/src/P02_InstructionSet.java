import java.util.Scanner;

public class P02_InstructionSet {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opCode = input.nextLine();
        
        while (!opCode.equals("END")) {
        	//Fixed Regex
            String[] codeArgs = opCode.split("\\s+");

            long result = 0; //All inputs fixed to long;
            switch (codeArgs[0]) {
                case "INC": {
                    int operandOne = Integer.parseInt(codeArgs[1]);
                  //Fixed +1
                    result = ++operandOne;
                    break;
                }
                case "DEC": {
                    int operandOne = Integer.parseInt(codeArgs[1]);
                  //Fixed -1
                    result = --operandOne;
                    break;
                }
                case "ADD": {
                	//fixed
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    result = operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                	//fixed int to long 
                    long operandOne  = Integer.parseInt(codeArgs[1]);
                    long operandTwo = Integer.parseInt(codeArgs[2]);
                    result = (long)(operandOne * operandTwo);
                    break;
                }
                default:
                    break;
            }

            System.out.println(result);
            
        	// Read the input again;
            opCode = input.nextLine();
        }
    }
}
