import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SubMenu {
    public static Map<Integer, String> getParametersSubMenu(Set<Laptop> listLaptop, String flag) {
        Map<Integer, String> listParameters = new TreeMap<>();
        int count = 1;
        switch (flag) {
            case "Title":
                for (Laptop laptop: listLaptop) {
                    listParameters.put(count, laptop.getTitle());
                    count++;
                }
                break;
            case "Operation system":
                for (Laptop laptop: listLaptop) {
                    listParameters.put(count, laptop.getOperationSystem());
                    count++;
                }
                break;
            case "Screen diagonal":
                for (Laptop laptop: listLaptop) {
                    listParameters.put(count, laptop.getScreenDiagonal() + "");
                    count++;
                }
                break;
            case "Random access memory":
                for (Laptop laptop: listLaptop) {
                    listParameters.put(count, laptop.getRandomAccessMemory() + "");
                    count++;
                }
                break;
            case "Solid state drive":
                for (Laptop laptop: listLaptop) {
                    listParameters.put(count, laptop.getSolidStateDrive() + "");
                    count++;
                }
                break;
            case "Procession title":
                for (Laptop laptop: listLaptop) {
                    listParameters.put(count, laptop.getProcessorTitle());
                    count++;
                }
                break;
            case "Color":
                for (Laptop laptop: listLaptop) {
                    listParameters.put(count, laptop.getColor());
                    count++;
                }
                break;
        }
        listParameters.put(0, "Back");
        return listParameters;
    }

    public static void printSubMenu(Map<Integer, String> listParameters) {
        for (Map.Entry<Integer, String> param: listParameters.entrySet()) {
            System.out.println(param.getKey() + ". " + param.getValue());
        }
        System.out.print(">>> ");
    }

    public static String getSubMenuPoint(Map<Integer, String> subMenu, Scanner scanner) {
        int point = scanner.nextInt();
        System.out.println(" ");
        return subMenu.get(point);
    }
}
