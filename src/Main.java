import java.util.Stack;

public class Main {
    public Main(String eq){
        Stack<String> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        String[] output = eq.split(" ");
        for (String value : output){
            if (Character.isDigit(value.charAt(0))){
                operand.push(value);
            }
            else {
                switch(value){
                    case "+", "*", "/", "-" -> operator.push(value);
                    case ")" -> {
                        int num2 = Integer.parseInt(operand.pop());
                        int num1 = Integer.parseInt(operand.pop());
                        switch(operator.pop()){
                            case "+"-> operand.push(Integer.toString(num1 + num2));
                            case "-"-> operand.push(Integer.toString(num1 - num2));
                            case "*"-> operand.push(Integer.toString(num1 * num2));
                            case "/"-> operand.push(Integer.toString(num1 / num2));
                        }
                    }
                    default -> {}
                }
            }
        }
        System.out.println(operand.peek());
    }
}
