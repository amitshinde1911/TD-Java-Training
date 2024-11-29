package day3;

public class ReplaceandDelete {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I love programming");
        
        sb.replace(2, 6, "enjoy");
        System.out.println("After Replace: " + sb);

        sb.delete(7, 18);
        System.out.println("After Delete: " + sb);
    }
}

