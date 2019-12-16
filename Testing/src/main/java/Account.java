public class Account {
    private String name,password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name==null){
            throw new IllegalArgumentException("name empty");
        }
    }

    public String getPassword() {
        if(password.length()<4) {
            return "too short";
        }
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
