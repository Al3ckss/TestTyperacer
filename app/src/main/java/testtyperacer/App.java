package testtyperacer;

public class App {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        view.setLabel1(model.getRandom());
        new Controller(model, view);
        
        //TODO mettere interfacce
        //TODO mettere javadoc in tutti i metodi
        //TODO raggruppare in cartelle MVC
        //TODO fare test
    }
}
