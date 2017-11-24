package kmitl.bank58070041.finalproject.lazycafe.model;

/**
 * Created by Bankkok_Bank on 24/11/2560.
 */

public class User {
    private String id;
    private String username;
    private String uriProfile;

    public User() {
    }

    public User(String id, String username, String uriProfile) {
        this.id = id;
        this.username = username;
        this.uriProfile = uriProfile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUriProfile() {
        return uriProfile;
    }

    public void setUriProfile(String uriProfile) {
        this.uriProfile = uriProfile;
    }
}