import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class SorteoSecreto {
      // datos del sorteo (raffle data)
    static String raffleName        = "";
    static String raffleDescription = "";
    static double raffleBudget      = 0.0;
    static LocalDate raffleDate     = null;
    static String raffleStatus      = "created";

      // Participant data
    static final int MAX_PARTICIPANTS = 100;
    static String[] participants = new String[MAX_PARTICIPANTS];
    static String[] secretFriends = new String[MAX_PARTICIPANTS];
    static int participantCount   = 0;

    // Tools
    static Scanner scanner = new Scanner(System.in);
    static Random  random  = new Random();


}