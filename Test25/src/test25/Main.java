package test25;

public class Main {
    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.findPersonInfo();
                    break;
                case 2:
                    Manager.coppyNewFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}
