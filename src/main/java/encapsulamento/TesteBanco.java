public class TesteBanco {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria("Enzo", "C001", 1);

        ContaBancaria conta02 = new ContaBancaria();
        conta01.sacar(10.5);

    }
}
