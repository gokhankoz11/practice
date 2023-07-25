package variablestekrar0;

public  class Araba {
    private String id;
    private  String username;
    private  String password;
    private  boolean active;
    private boolean signedIn;

    public Araba(String id, String username, String password, boolean active, boolean signedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }
}