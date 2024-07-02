import java.util.Objects;

public class Laptop {
    private String title;
    private String operationSystem;
    private double screenDiagonal;
    private int randomAccessMemory;
    private int solidStateDrive;
    private String processorTitle;
    private String color;

    public Laptop(String title, String operationSystem, double screenDiagonal,
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

    public void setProcessorTitle(String processorTitle) {
        this.processorTitle = processorTitle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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
        return "Laptop{" +
                "title='" + title + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", screenDiagonal=" + screenDiagonal +
                ", randomAccessMemory=" + randomAccessMemory +
                ", solidStateDrive=" + solidStateDrive +
                ", processorTitle='" + processorTitle + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
