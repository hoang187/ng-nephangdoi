package Basic.devhh;
import java.util.Scanner;
import java.util.Stack;

public class MainApp {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        
        s.add(1);
        s.add(2);
        s.add(3);
            
        
        int count = s.size();
        System.out.println("a. số phần tử của stack là: " + count);
        
        System.out.println("b. Nhập phần tử muốn xuất");
        int n = sc.nextInt();
        System.out.println("phần tử trong stack: " + s.get(n-1));
        
        System.out.println("c. nội dung của stack: " + s);
        
        System.out.println("d. Nhập phần tử muốn loại");
        int indexToRemove = sc.nextInt();
        int removedElement = s.remove(indexToRemove-1);
        System.out.println("loại phần tử " + removedElement);
        
        
       
        Stack<Integer> tempStack = new Stack<Integer>();
        while (!s.isEmpty()) {
            tempStack.push(s.pop());
        }
        s = tempStack;
        System.out.println("5. Đảo stack: " + s);
        
        while(s.size() > 0) {
            int decimal = s.pop();
            String binary = decimalToBinary(decimal);
            System.out.println(decimal + " trong số nhị phân là " + binary);
        }
        }
            
           
            
        
        public static String decimalToBinary(int decimal) {
            Stack<Integer> stack = new Stack<Integer>();
            
            while (decimal > 0) {
                int remainder = decimal % 2;
                stack.push(remainder);
                decimal /= 2;
            }
            
            StringBuilder binary = new StringBuilder();
            while (!stack.isEmpty()) {
                binary.append(stack.pop());
            }
            
            return binary.toString();
    }

    }
