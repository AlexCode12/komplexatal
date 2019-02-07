public class testKompltal {
    public static void main(String[] args) {
        kompltal z1 = new kompltal(2, 3);
        kompltal z2 = new kompltal(4, -2);

        kompltal z3 = z1.add(z2);
        kompltal z4 = z1.multiply(z2);

        System.out.println(z3);
        System.out.println(z4);

    }
}
