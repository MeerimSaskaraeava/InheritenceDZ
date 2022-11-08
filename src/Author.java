public class Author {
    private String fullName;
    private String email;
    private String gender;

    public Author(){
    }

    public Author(String fullName, String email, String gender) {
        this.fullName = fullName;
        this.email = email;
        this.gender = gender;
    }

    private String getFullName() {
        return fullName;
    }

    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
