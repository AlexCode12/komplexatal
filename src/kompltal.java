public class kompltal {
    double a;
    double b;

    public kompltal(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public kompltal add(kompltal z2) {
        double a = this.a + z2.a;
        double b = this.b + z2.b;
        kompltal z3 = new kompltal(a,b);
        return z3;
    }
    public kompltal multiply(kompltal z2) {
        double a = this.a * z2.a;
        double b = this.a * z2.b;
        kompltal z4 = new kompltal(a,b);
        return z4;
    }
    
}
