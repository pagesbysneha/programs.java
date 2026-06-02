class AddSub {
    double a, b;

    AddSub(double a, double b) { this.a = a; this.b = b; }

    double add()      { return a + b; }
    double subtract() { return a - b; }
}

class MulDiv extends AddSub {

    MulDiv(double a, double b) { super(a, b); }

    double multiply() { return a * b; }
    double divide()   { return b != 0 ? a / b : Double.NaN; }
}

public class Addsub_muldiv_inheritance {
    public static void main(String[] args) {
        MulDiv m = new MulDiv(20, 4);
        System.out.println("Add      : " + m.add());
        System.out.println("Subtract : " + m.subtract());
        System.out.println("Multiply : " + m.multiply());
        System.out.println("Divide   : " + m.divide());
    }
}


