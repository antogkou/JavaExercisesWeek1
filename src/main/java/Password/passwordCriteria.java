package Password;


public class passwordCriteria {

    // A utility function to check
    // whether a password is valid or not
    public static boolean isValid(String password)
    {

        if (!((password.length() >= 8))) {
            return false;
        }

        if (password.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return false;
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        if (true) {
            int count = 0;

            for (int i = 90; i <= 122; i++) {

                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {

        //a not a valid password test!
        String password1 = "NotValidPassw0rd";

        if (isValid(password1)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password!!!");
        }

        //a valid password test!
        String password2 = "V@L1DPa$$w0rd";
        if (isValid(password2)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password!!!");
        }
    }
}
