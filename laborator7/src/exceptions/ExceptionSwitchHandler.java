package exceptions;

public class ExceptionSwitchHandler {
    public static void handleException(Exception e) {
        switch (e) {
            case NullPointerException npe -> System.out.println("Null error " + npe.getMessage());
            case NumberFormatException nfe -> System.out.println("Invalid number " + nfe.getMessage());
            case Exception ex -> System.out.println("Generic exception: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (Exception e) {
            handleException(e);
        }
    }
}
