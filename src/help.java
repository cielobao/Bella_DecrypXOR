public class help {
    // decode the top secret message
    // prompt enter the message
    // enter -h for help
    // enter "quit" to exit
    // enter "who" to view users + privileges
    // enter "username" to view messages
    // enter the key to decrypt
    // you've read the top secret message!

    public static String h() {
        return "'quit' -- To exit the program" +
                "\n'who' -- To view users and privileges" +
                "\n'login' -- To sign in and view messages, type a number associated with the user" +
                "\n'decrypt' -- To decrypt a message" +
                "\n'access' -- To view who has access to what" +
                "\n";
    }
}
