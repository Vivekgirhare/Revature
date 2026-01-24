package jan20.CollectionDemos;

import java.util.HashSet;

public class Taskque4 {
    public static void main(String[] args) {
        HashSet<String> emailSet = new HashSet<>();
        registerEmail(emailSet, "vivek@gmail.com");
        registerEmail(emailSet, "girhare@yahoo.com");
        registerEmail(emailSet, "vivek@gmail.com");   // duplicate
        registerEmail(emailSet, "vivekgirhare@outlook.com");
        registerEmail(emailSet, "girhare@yahoo.com");  // duplicate


        System.out.println("\nUnique Registered Emails:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
    
    static void registerEmail(HashSet<String> emailSet, String email) {
        if (emailSet.add(email)) {
            System.out.println("Email registered successfully: " + email);
        } else {
            System.out.println("Duplicate email rejected: " + email);
        }
    }
}
