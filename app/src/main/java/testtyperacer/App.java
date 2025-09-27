package testtyperacer;

public class App {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        view.setLabel1(model.getRandom());
        Controller controller = new Controller(model, view);
    }
}
