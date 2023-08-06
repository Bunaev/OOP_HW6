public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order(new Input());
        SaveToJson save = new SaveToJson(order.input);
        save.saveToJson();
        save.readToJson();

    }
}
