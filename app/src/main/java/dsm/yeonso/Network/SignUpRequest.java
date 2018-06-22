package dsm.yeonso.Network;

/**
 * Created by dsm2016 on 2018-06-20.
 */

public class SignUpRequest {
    public String email;
    public String name;
    public String password;

    public SignUpRequest(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
