public class SearchUsers {
    public static int getMaxAgedUser(User[] users){
        int age = users[0].age;
        for (int i = 1; i < users.length; i++) {
            if(users[i].age>age){
                age = users[i].age;
            }
        }
        return age;
    }
}
