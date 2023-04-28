import service.Service;

public class Main {
    public static void main(String[] args) {
        System.out.println("Begin");

        Service service = new Service();
        service.incrementAndGet(5);

        System.out.println("End");
    }
}