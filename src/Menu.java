import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Menu {
    private final Map<Integer, String> menu;

    public Menu() {
        this.menu = new TreeMap<Integer, String>();
        menu.put(0, LaptopParameters.EXIT.label);
        menu.put(1, LaptopParameters.TITLE.label);
        menu.put(2, LaptopParameters.OPERATION_SYSTEM.label);
        menu.put(3, LaptopParameters.SCREEN_DIAGONAL.label);
        menu.put(4, LaptopParameters.RANDOM_ACCESS_MEMORY.label);
        menu.put(5, LaptopParameters.SOLID_STATE_DRIVE.label);
        menu.put(6, LaptopParameters.PROCESSOR_TITLE.label);
        menu.put(7, LaptopParameters.COLOR.label);
        menu.put(8, LaptopParameters.QUALIFY.label);
        menu.put(9, LaptopParameters.THROW_OFF.label);
    }

    public void printMenu() {
        System.out.println("Select number an item to select the parameters:");
        for (Map.Entry<Integer, String> point: menu.entrySet()) {
            System.out.println(point.getKey() + ". " + point.getValue());
        }
        System.out.print(">>> ");
    }

    public String getMenuPoint(Scanner scanner) {
        int point = scanner.nextInt();
        if (point == 0) System.exit(0);
        System.out.println(" ");
        return menu.get(point);
    }
}
