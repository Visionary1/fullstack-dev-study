package constructor_12_03;

public class test {
    public static void main(String[] args) {
        SharpPencil sharp = new SharpPencil();

        sharp.setAmount(1000);

        System.out.println(sharp.getAmount());
    }
}
