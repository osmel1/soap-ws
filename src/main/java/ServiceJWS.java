import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServiceJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8080/";
        System.out.println("Web service started at " + url);
        Endpoint.publish(url, new BankService());
    }
}
