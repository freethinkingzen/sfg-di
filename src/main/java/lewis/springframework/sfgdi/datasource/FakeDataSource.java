package lewis.springframework.sfgdi.datasource;

public class FakeDataSource {

    private String username;
    private String password;
    private String jdbcurl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getjdbcurl() {
        return jdbcurl;
    }

    public void setjdbcurl(String jdbculr) {
        this.jdbcurl = jdbculr;
    }
}
