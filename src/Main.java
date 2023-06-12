import Modules.Function;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Function f = new Function();

        Thread.sleep(1000);
        f.login("admin", "admin123");
        Thread.sleep(2000);
        f.hide_menu();
        f.show_menu();
        f.change_tab("PIM");
        Thread.sleep(2000);
        f.create_user("Roman", "Marian", "Kowalski", "0", false);
        Thread.sleep(4000);
        f.bye();
    }
}