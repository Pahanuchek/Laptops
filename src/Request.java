import java.util.Map;
import java.util.TreeMap;

public class Request {
    private Map<String, String> request;

    public Request() {
        this.request = new TreeMap<>();
        this.request.put(LaptopParameters.BACK.label, null);
        this.request.put(LaptopParameters.TITLE.label, null);
        this.request.put(LaptopParameters.OPERATION_SYSTEM.label, null);
        this.request.put(LaptopParameters.SCREEN_DIAGONAL.label, null);
        this.request.put(LaptopParameters.RANDOM_ACCESS_MEMORY.label, null);
        this.request.put(LaptopParameters.SOLID_STATE_DRIVE.label, null);
        this.request.put(LaptopParameters.PROCESSOR_TITLE.label, null);
        this.request.put(LaptopParameters.COLOR.label, null);
    }

    public Map<String, String> setRequest(String point, String request) {
        this.request.replace(point, request);
        return this.request;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Filter setting:\n");
        for (Map.Entry<String, String> req : request.entrySet()) {
            if (request.get(req.getKey()) == null) {
                continue;
            }
            result.append(req.getKey() + ": " + req.getValue() + "; ");
        }
        return result.toString() + "\n";
    }
}

