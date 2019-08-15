//java calc "(multiply 2 (add (multiply 2526515400 3) 8))"

public class calc {
    public static void main(String []args) {
        String expr = args[0];
        
        while (expr.contains("(")) {
            expr = evaluate(expr);
        }
        
        System.out.println(expr);
     }
     
     public static String evaluate(String expr) {
        int right = expr.indexOf(")"); int left = 0;
        for (int i = right; i >= 0; i--) {
            Character c = expr.charAt(i);
            if (c.equals('(')) {
                left = i;
                break;
            }
        }
        
        String current = expr.substring(left+1, right);
        
        String action = current.substring(0, current.indexOf(" "));
        current = current.substring(current.indexOf(" ")+1);
        
        String num1 = current.substring(0, current.indexOf(" "));
        current = current.substring(current.indexOf(" ")+1);
        
        String num2 = current;
        
        return expr.substring(0, left) + calculate(action, num1, num2) + expr.substring(right+1);
     }
     
     public static long calculate(String action, String num1, String num2) {
        if (action.equals("add")) {
            return Long.parseLong(num1) + Long.parseLong(num2);
        } else if (action.equals("multiply")) { 
            return Long.parseLong(num1) * Long.parseLong(num2);
        }
        
        return 0;
     }
}
