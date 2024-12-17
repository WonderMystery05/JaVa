import java.util.Scanner;

public class IPv4Validator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IPv4 address: ");
        String ipAddress = scanner.nextLine();

        if (isValidIPv4(ipAddress)) {
            System.out.println(ipAddress + " is a valid IPv4 address.");
        } else {
            System.out.println(ipAddress + " is not a valid IPv4 address.");
        }

        scanner.close();
    }

    public static boolean isValidIPv4(String ip) {
        // Split the IP address into parts
        String[] octets = ip.split("\\.");

        // Check if there are exactly 4 octets
        if (octets.length != 4) {
            return false;
        }

        for (String octet : octets) {
            // Check if the octet is a valid integer
            if (!isValidOctet(octet)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidOctet(String octet) {
        // Check if the octet is numeric and within the valid range
        if (octet.length() == 0 || octet.length() > 3) {
            return false;
        }

        for (char c : octet.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        int value = Integer.parseInt(octet);
        return value >= 0 && value <= 255 && !(octet.length() > 1 && octet.startsWith("0"));
    }
}
