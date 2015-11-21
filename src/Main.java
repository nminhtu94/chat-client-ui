public class Main {
    public static void main(String[] args) {
        StartForm app = new StartForm();
        NavigationController.getInstance().pushFrame(app);
    }
}