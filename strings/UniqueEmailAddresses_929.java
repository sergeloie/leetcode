package strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] splitted = email.split("@");
            String left = splitted[0];
            left = left.replaceAll("\\.", "");
            left = left.split("\\+")[0];
            set.add(left + "@" + splitted[1]);
        }
        return set.size();
    }

}
