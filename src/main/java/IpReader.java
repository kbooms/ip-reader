import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class IpReader {

    public static final String API_BASE_URL = "https://api.myip.com";
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity response = restTemplate.getForEntity(API_BASE_URL, String.class);

        System.out.println(response.getBody());
    }
}
