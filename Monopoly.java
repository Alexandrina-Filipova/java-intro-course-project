
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Monopoly {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {

    }

    /**
     * Опция за четене на информация от файл.
     * @throws Exception
     */
    private static void companyFile() throws Exception {
        File file = new File("src/Company");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    /**
     * Опция за четене на информация от файл.
     * @throws Exception
     */
    private static void evilPlanFile() throws Exception {
        File file = new File("src/EvilPlan");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    /**
     * Опция за четене на информация от файл.
     * @throws Exception
     */
    private static void negativeChanceFile() throws Exception {
        File file = new File("src/NegativeChance");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    /**
     * Опция за четене на информация от файл.
     * @throws Exception
     */
    private static void positiveChanceFile() throws Exception {
        File file = new File("src/PositiveChance");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    /**
     * Опция за четене на информация от файл.
     * @throws Exception
     */
    private static void trapMenuFile() throws Exception {
        File file = new File("src/TrapMenu");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    /**
     * Инвестиционни решения(ходове) в играта.
     */
    private static void boardPawns() {
        final String Trap         = "T";     // 7 бр.
        final String Invest       = "I";     // 3 бр.
        final String PartyHard    = "P";     // 3 бр.
        final String Chance       = "C";     // 3 бр.
        final String Steal        = "St";    // 3 бр.
        final String Empty        = "  ";
        final String firstPlayer  = "FP";
        final String secondPlayer = "SP";
        final String Start        = "S";
    }

    /**
     * Меню с опции в Trap
     * @param scanner четене от конзолата
     * @throws Exception
     */
    private static void trapBoardMoves(Scanner scanner) throws Exception {
        int trap = scanner.nextInt();
        trapMenuFile();
        System.out.println("Изберете цифра от менюто: ");
        switch (trap) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }

    }

    /**
     * Двустенен зар, за избиране на играчите.
     *
     * @param random случаен принцип
     */
    private static void twoDice(Random random) {
        int dice = random.nextInt(2) + 1;
        for (int i = 1; i <= dice; i++) {
            if (dice == 1) {
                System.out.println("Играч 1 е пръв!");
            } else {
                System.out.println("Играч 2 е пръв!");
            }
        }
    }

    /**
     * Десетстенен зар, показва дали играчът стъпил върху
     * собствения си капан е спасен или не.
     *
     * @param random случаен принцип
     */
    private static void tenDice(Random random) {
        int dice = random.nextInt(10) + 1;
        for (int i = 1; i <= dice; i++) {
            if (dice % 3 == 0) {
                System.out.println("Вие сте спасени, няма да има последствия!");
            } else {
                System.out.println("Днес късметът не е с вас!");
            }
        }
    }

    /**
     * Стостенен зар, показва негативните шансове в играта.
     *
     * @param random случаен принцип
     */
    private static void oneHundredDiceNegativeChance(Random random) {
        int dice = random.nextInt(100) + 1;
        for (int i = 1; i <= dice; i++) {
            if (dice <= 39) {
                System.out.println("1001 нощ");
            } else if (dice >= 40 || dice <= 65) {
                System.out.println("Балът на феите");
            } else if (dice >= 65 || dice <= 79) {
                System.out.println("Война и мир");
            } else if (dice >= 80 || dice <= 94) {
                System.out.println("Престъпление и наказание");
            } else if (dice >= 95 || dice <= 100) {
                System.out.println("Гроздовете на гнева");
            }
        }
    }

    /**
     * Стостенен зар, показва положителните шансове в играта.
     *
     * @param random случаен принцип
     */
    private static void oneHundredDicePositiveChance(Random random) {
        int dice = random.nextInt(100) + 1;
        for (int i = 1; i <= dice; i++) {
            if (dice <= 39) {
                System.out.println("Големите надежди");
            } else if (dice >= 40 || dice <= 65) {
                System.out.println("Лолита");
            } else if (dice >= 65 || dice <= 79) {
                System.out.println("Гордост и предразсъдъци");
            } else if (dice >= 80 || dice <= 94) {
                System.out.println("Повелителя на мухите");
            } else if (dice >= 95 || dice <= 100) {
                System.out.println("Хобит");
            }
        }
    }

    /**
     * Десетстенен зар, показва какъв шанс (положителен или отрицателен) ви се е паднал.
     *
     * @param random случаен принцип
     */
    private static void tenDiceChance(Random random) {
        int dice = random.nextInt(10) + 1;
        for (int i = 1; i <= dice; i++) {
            if (dice % 2 == 0) {
                System.out.println("Днес е радостен ден за вас!");
            } else {
                System.out.println("Ти изтегли късата клечка!");
            }
            oneHundredDicePositiveChance(random);
            oneHundredDiceNegativeChance(random);
        }
    }
}