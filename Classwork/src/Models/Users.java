package Models;

public class Users {
String name;
String contact;

int User_id;

    public Users(String name, String contact, int user_id) {
        this.name = name;
        this.contact = contact;
        User_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        User_id = user_id;
    }
}
