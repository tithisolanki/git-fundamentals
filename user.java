public class user {
    String name;
    int age;
    
    public user(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void userInfo() {
        System.out.println("Hello from branch: User");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        user u = new user("ABC", 22);

        u.userInfo();
    }
}
