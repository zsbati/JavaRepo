import java.nio.charset.StandardCharsets;

class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        return fullName.trim();
         // write your code here
    }
}