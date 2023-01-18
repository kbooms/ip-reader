import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/* I'm building the start of a hit counter for my website. https://myip.com has an API that returns the local IP
*  address of the caller. Making the call returns the IP address, country, and country code of the caller in JSON.
*  From there I want to log the data, parse out unique IP addresses, and "hit" counts. Then count the total of unique
*  IP addresses, and display that result to the user.
* */


// log the ip address
// count how many times the ip address has "visited"
// if the IP is new (unique) add to the hit counter

public class IpReader {

    public static final String API_BASE_URL = "https://api.myip.com";

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        // get the ip address as part of a ResponseEntity
        ResponseEntity response = restTemplate.getForEntity(API_BASE_URL, String.class);
        // Comes in as a String for now. I should make this into a model class, and getForObject instead.
        // I think that will make it easier to parse the data

        // displays the ip address, country, and country code
        System.out.println(response.getBody());

    }
}
