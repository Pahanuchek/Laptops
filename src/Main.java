import java.util.*;

public class Main {
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
        Laptop laptop1 = new Laptop("Acer", "Windows", 17.5,
                16, 512, "Intel", "Black");
        Laptop laptop2 = new Laptop("Mac", "MacOS", 19.4,
                8, 256, "AMD", "Grey");
        return new HashSet<>(Arrays.asList(laptop1, laptop2));
    }

    public static void runProgram(Menu menu, Request request, Map<String,String> mapRequest, Scanner scanner) {
        while (true) {
            menu.printMenu();
            String point = menu.getMenuPoint(scanner);
            if (!point.equals(LaptopParameters.THROW_OFF.label)) {
                Map<Integer, String> subMenu = SubMenu.getParametersSubMenu(setListLaptop(), point);
                SubMenu.printSubMenu(subMenu);
                String pointSubMenu = SubMenu.getSubMenuPoint(subMenu, scanner);
                if (pointSubMenu.equals(LaptopParameters.BACK.label)) continue;
                mapRequest = request.setRequest(point, pointSubMenu);
                System.out.println(request);
            } else {
                request = new Request();
            }
        }
    }
}


