package cucumberTest.prodCode;

public class isItFriday {
    public static String isItFriday(String today, String wantedDay) {
        if (today.equals(wantedDay)) {
            return "TGIF";
        }
        return "Nope";
    }
}
