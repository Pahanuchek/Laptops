import java.util.*;

public class Laptop {
    private String title;
    private String operationSystem;
    private double screenDiagonal;
    private int randomAccessMemory;
    private int solidStateDrive;
    private String processorTitle;
    private String color;

    public Laptop(String title, String operationSystem, int screenDiagonal,
                  int randomAccessMemory, int solidStateDrive, String processorTitle,
                  String color) {
        this.title = title;
        this.operationSystem = operationSystem;
        this.screenDiagonal = screenDiagonal;
        this.randomAccessMemory = randomAccessMemory;
        this.solidStateDrive = solidStateDrive;
        this.processorTitle = processorTitle;
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public int getSolidStateDrive() {
        return solidStateDrive;
    }

    public void setSSD(int solidStateDrive) {
        this.solidStateDrive = solidStateDrive;
    }

    public String getProcessorTitle() {
        return processorTitle;
    }

    public void setProcessorTitle(String processorTitle) { this.processorTitle = processorTitle; }

    public String getColor() {
        return color;
    }

    public void setColor(String color) { this.color = color; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(screenDiagonal, laptop.screenDiagonal) == 0
                && randomAccessMemory == laptop.randomAccessMemory
                && solidStateDrive == laptop.solidStateDrive
                && Objects.equals(title, laptop.title)
                && Objects.equals(operationSystem, laptop.operationSystem)
                && Objects.equals(processorTitle, laptop.processorTitle)
                && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, operationSystem, screenDiagonal, randomAccessMemory,
                solidStateDrive, processorTitle, color);
    }

    @Override
    public String toString() {
        return "Laptop: " + title + System.lineSeparator() +
                "Operation System: " + operationSystem + System.lineSeparator() +
                "Screen Diagonal: " + screenDiagonal + System.lineSeparator() +
                "Random Access Memory: " + randomAccessMemory + "Mb" + System.lineSeparator() +
                "Solid State Drive: " + solidStateDrive + "Gb" + System.lineSeparator() +
                "Processor Title: " + processorTitle + System.lineSeparator() +
                "Color: " + color + System.lineSeparator();
    }

    public static Set<Laptop> getQualify(Map<String, String> request, Set<Laptop> laptopList) {
        Set<Laptop> resultFilter = new HashSet<>();
        for (Laptop laptop: laptopList) {
            if ((request.get(LaptopParameters.TITLE.label) == null ||
                    laptop.getTitle().equals(request.get(LaptopParameters.TITLE.label))) &&
                    (request.get(LaptopParameters.OPERATION_SYSTEM.label) == null ||
                    laptop.getOperationSystem().equals(request.get(LaptopParameters.OPERATION_SYSTEM.label))) &&
                    (request.get(LaptopParameters.SCREEN_DIAGONAL.label) == null ||
                    laptop.getScreenDiagonal() >= Double.parseDouble(request.get(LaptopParameters.SCREEN_DIAGONAL.label))) &&
                    (request.get(LaptopParameters.RANDOM_ACCESS_MEMORY.label) == null ||
                    laptop.getRandomAccessMemory() >= Integer.parseInt(request.get(LaptopParameters.RANDOM_ACCESS_MEMORY.label))) &&
                    (request.get(LaptopParameters.SOLID_STATE_DRIVE.label) == null ||
                    laptop.getSolidStateDrive() >= Integer.parseInt(request.get(LaptopParameters.SOLID_STATE_DRIVE.label))) &&
                    (request.get(LaptopParameters.PROCESSOR_TITLE.label) == null ||
                    laptop.getProcessorTitle().equals(request.get(LaptopParameters.PROCESSOR_TITLE.label))) &&
                    (request.get(LaptopParameters.COLOR.label) == null ||
                    laptop.getColor().equals(request.get(LaptopParameters.COLOR.label)))) {
                resultFilter.add(laptop);
            }
        }
        return resultFilter;
    }

    public static void printLaptop(Set<Laptop> listLaptop) {
        for(Laptop laptop: listLaptop) {
            System.out.println(laptop);
        }
    }
}
