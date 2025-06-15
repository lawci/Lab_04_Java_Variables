public class Main {
    public static void main(String[] args) {
        // Integer variables
        int intOperandA = 5;
        int intOperandB = 7;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        // Double variables
        double doubleOperandA = 3.50;
        double doubleOperandB = 2.25;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;

        // Output statements
        System.out.println("Sum (int): " + intOperandA + " + " + intOperandB + " = " + intSum);
        System.out.println("Product (int): " + intOperandA + " * " + intOperandB + " = " + intProduct);
        System.out.println("Quotient (int): " + intOperandA + " / " + intOperandB + " = " + intQuotient);
        System.out.println("Modulo (int): " + intOperandA + " % " + intOperandB + " = " + intModulo);
        System.out.println("Sum (double): " + doubleOperandA + " + " + doubleOperandB + " = " + doubleSum);
        System.out.println("Product (double): " + doubleOperandA + " * " + doubleOperandB + " = " + doubleProduct);
    }
}