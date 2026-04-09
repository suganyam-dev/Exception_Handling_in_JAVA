package Exception_Handling;

class calc {
    void div() throws Exception {
        int a = 10 / 0;
    }
}

public class Throws {
    public static void main(String args[]) {
        calc c = new calc();
        
        try {
            c.div();
        } catch (Exception e) {
            System.out.println("Exception handled: " + e);
        }
    }
}