package model;

public class Guest {

    private String ipAddress;
    private String country;
    private String cC;

    public Guest() { /* default constructor */ }

    public Guest(String ipAddress, String country, String cC) {
        this.ipAddress = ipAddress;
        this.country = country;
        this.cC = cC;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getcC() {
        return cC;
    }

    public void setcC(String cC) {
        this.cC = cC;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "ipAddress='" + ipAddress + '\'' +
                ", country='" + country + '\'' +
                ", cC='" + cC + '\'' +
                '}';
    }
}
