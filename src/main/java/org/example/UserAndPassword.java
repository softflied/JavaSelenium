package org.example;

public class UserAndPassword {
    String correctUser;
    String correctPassword;
    String wrongPassword;
    public UserAndPassword()
    {
        setCorrectUser("c1928026");
        setCorrectPassword("Eyupozturk0.");
        setWrongPassword("SDFSFDDSFDSAS");
    }

    public String getCorrectUser() {
        return correctUser;
    }



    public void setCorrectUser(String correctUser) {
        this.correctUser = correctUser;
    }

    public String getCorrectPassword() {
        return correctPassword;
    }

    public void setCorrectPassword(String correctPassword) {
        this.correctPassword = correctPassword;
    }

    public String getWrongPassword() {
        return wrongPassword;
    }

    public void setWrongPassword(String wrongPassword) {
        this.wrongPassword = wrongPassword;
    }
}
