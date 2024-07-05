import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static Set<Laptop> resultFilter = new HashSet<>();
    public static Map<String,String> mapRequest = new HashMap<>();
    public static Menu menu = new Menu();
    public static Request request = new Request();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            runProgram(menu, request, mapRequest, scanner);
        } catch (Exception e) {
            System.out.println("\nВведите корректное значение!!!\n");
            runProgram(menu, request, mapRequest, scanner);
        }
        finally {
            scanner.close();
        }
    }
    public static Set<Laptop> setListLaptop() {
        Laptop laptop1 = new Laptop("Acer", "Windows", 24,
                16, 512, "Intel", "Black");
        Laptop laptop2 = new Laptop("Apple", "MacOS", 24,
                8, 256, "AMD", "Grey");
        Laptop laptop3 = new Laptop("Apple", "MacOS", 24,
                4, 512, "Intel", "White");
        Laptop laptop4 = new Laptop("Apple", "MacOS", 32,
                16, 1024, "AMD", "Green");
        Laptop laptop5 = new Laptop("Apple", "MacOS", 42,
                8, 256, "Intel", "Grey");
        Laptop laptop6 = new Laptop("Apple", "MacOS", 24,
                32, 128, "Intel", "Yellow");
        Laptop laptop7 = new Laptop("Apple", "MacOS", 32,
                16, 512, "AMD", "Grey");
        Laptop laptop8 = new Laptop("Acer", "Linux", 42,
                4, 512, "Intel", "Black");
        Laptop laptop9 = new Laptop("Acer", "Windows", 24,
                4, 128, "AMD", "Yellow");
        Laptop laptop10 = new Laptop("Acer", "Windows", 32,
                16, 256, "Intel", "Grey");
        Laptop laptop11 = new Laptop("Acer", "Linux", 24,
                8, 1024, "AMD", "Black");
        Laptop laptop12 = new Laptop("Acer", "Windows", 42,
                32, 512, "Intel", "Yellow");
        Laptop laptop13 = new Laptop("HP", "Linux", 24,
                8, 256, "Intel", "Grey");
        Laptop laptop14 = new Laptop("HP", "Windows", 24,
                8, 512, "AMD", "White");
        Laptop laptop15 = new Laptop("HP", "Windows", 24,
                16, 256, "Intel", "Black");
        Laptop laptop16 = new Laptop("HP", "Linux", 32,
                16, 512, "Intel", "Yellow");
        Laptop laptop17 = new Laptop("HP", "Windows", 32,
                8, 128, "AMD", "Black");
        Laptop laptop18 = new Laptop("HP", "Linux", 42,
                64, 1024, "Intel", "Grey");
        return new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6,
                laptop7, laptop8, laptop9, laptop10, laptop11, laptop12, laptop13, laptop14, laptop15,
                laptop16, laptop17, laptop18));
    }

    public static void runProgram(Menu menu, Request request, Map<String,String> mapRequest, Scanner scanner) {
        while(true) {
            menu.printMenu();
            String point = menu.getMenuPoint(scanner);
            if (!point.equals(LaptopParameters.THROW_OFF.label) && !point.equals(LaptopParameters.QUALIFY.label)) {
                Map<Integer, String> subMenu = SubMenu.getParametersSubMenu(setListLaptop(), point);
                SubMenu.printSubMenu(subMenu);
                String pointSubMenu;
                pointSubMenu = SubMenu.getSubMenuPoint(subMenu, scanner);
                if (pointSubMenu.equals(LaptopParameters.BACK.label)) continue;
                mapRequest = request.setRequest(point, pointSubMenu);
                System.out.println(request);
            } else if(point.equals(LaptopParameters.QUALIFY.label)) {
                resultFilter = Laptop.getQualify(mapRequest, setListLaptop());
                Laptop.printLaptop(resultFilter);
            } else if (point.equals(LaptopParameters.THROW_OFF.label)){
                mapRequest = new HashMap<>();
            }
        }
    }
}


