package gr.kouk.audiomanager;

public class Main {
    public static void main(String[] args) {
        Ui ui = new Ui();
        FileList list = new FileList();
        list.loadlist("list.txt");
        ui.manage(list);
    }
}
