import java.util.*;

public class SubMenu {
    public static Map<Integer, String> getParametersSubMenu(Set<Laptop> listLaptop, String flag) {
        Map<Integer, String> listParameters = new TreeMap<>();
        int count = 1;
        Set<String> listParameterExclusive = new TreeSet<>();
        switch (flag) {
            case "Title":
                for (Laptop laptop: listLaptop) {
                    listParameterExclusive.add(laptop.getTitle());
                }
                for (String title: listParameterExclusive) {
                    listParameters.put(count, title);
                    count++;
                }
                break;
            case "Operation system":
                for (Laptop laptop: listLaptop) {
                    listParameterExclusive.add(laptop.getOperationSystem());
                }
                for (String operationSystem: listParameterExclusive) {
                    listParameters.put(count, operationSystem);
                    count++;
                }
                break;
            case "Screen diagonal":
                for (Laptop laptop: listLaptop) {
                    listParameterExclusive.add(laptop.getScreenDiagonal() + "");
                }
                for (String screenDiagonal: listParameterExclusive) {
                    listParameters.put(count, screenDiagonal);
                    count++;
                }
                break;
            case "Random access memory":
                for (Laptop laptop: listLaptop) {
                    listParameterExclusive.add(laptop.getRandomAccessMemory() + "");
                }
                for (String randomAccessMemory: listParameterExclusive) {
                    listParameters.put(count, randomAccessMemory);
                    count++;
                }
                break;
            case "Solid state drive":
                for (Laptop laptop: listLaptop) {
                    listParameterExclusive.add(laptop.getSolidStateDrive() + "");
                }
                for (String solidStateDrive: listParameterExclusive) {
                    listParameters.put(count, solidStateDrive);
                    count++;
                }
                break;
            case "Procession title":
                for (Laptop laptop: listLaptop) {
                    listParameterExclusive.add(laptop.getProcessorTitle());
                }
                for (String processorTitle: listParameterExclusive) {
                    listParameters.put(count, processorTitle);
                    count++;
                }
                break;
            case "Color":
                for (Laptop laptop: listLaptop) {
                    listParameterExclusive.add(laptop.getColor());
                }
                for (String color: listParameterExclusive) {
                    listParameters.put(count, color);
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
