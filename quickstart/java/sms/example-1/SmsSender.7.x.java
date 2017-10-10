// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID = "AC1fb44dbb4311dcd7a8131757e0104b49";
    public static final String AUTH_TOKEN = "cca9e4b4196639beaf9214435058088c";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
            .creator(new PhoneNumber("+917092542313"), // to
                     new PhoneNumber("+18314403068"), // from
                     "Where's Wallace?")
            .create();

        System.out.println(message.getSid());
    }
}
