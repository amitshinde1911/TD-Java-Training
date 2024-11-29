package day3;

public class AppendandInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome");
        
        sb.append(" to Java!");
        System.out.println("After Append: " + sb);

        sb.insert(8, " programming");
        System.out.println("After Insert: " + sb);
    }
}

