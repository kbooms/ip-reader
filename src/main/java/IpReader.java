import model.Guest;
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
        System.out.println("Making API call to api.myip.com");
        RestTemplate restTemplate = new RestTemplate();
        // get the ip address data as a Guest object
        ResponseEntity response = restTemplate.getForEntity(API_BASE_URL, String.class);
        System.out.println(response.getBody());
        System.out.println("API Call Successful");

        System.out.println("Making same call to return as data object");
        Guest responseGuest = restTemplate.getForObject(API_BASE_URL, Guest.class);
        // *error* Could not extract response: no suitable HttpMessageConverter found for response type [class model.Guest] and content type [text/html;charset=UTF-8]
        // broken
        System.out.println(responseGuest.toString());

    }
}
