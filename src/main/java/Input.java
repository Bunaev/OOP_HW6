import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    private final String clientName;
    private final String product;
    private final int qnt;
    private final double price;

    public Input() {
        clientName = processInput("Имя клиента: ");
        product = processInput("Продукт: ");
        qnt = Integer.parseInt(processInput("Кол-во: "));
        price = Double.parseDouble(processInput("Цена: "));
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    private String processInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
