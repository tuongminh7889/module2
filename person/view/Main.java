package person.view;
import person.controller.PersonController;
public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.showMenu();
    }
}
