import Modules.Function;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Function f = new Function();

        Thread.sleep(1000);
        f.login("admin", "admin123");

        f.hide_menu();
        f.show_menu();
        f.change_tab("PIM");

        f.create_user("Krzyś", "Marian", "Kowalski", "0", true, true);
        f.logout();
        f.login("KrzyśKowalski","Marian213769");
        Thread.sleep(6000);
        f.bye();
    }
}