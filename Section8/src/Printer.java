public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel <= 100 && tonerLevel >= 0 ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            int total = tonerLevel + tonerAmount;
            if (total > 100) {
                return -1;
            }

            tonerLevel = total;
            return tonerLevel;
        }

        return -1;
    }

    public int printPages(int pages) {
//        if (duplex) {
//            System.out.println("It is a duplex printer");
//            int sheets = (pages / 2) + (pages % 2);
//            pagesPrinted += sheets;
//            return sheets;
//        } else {
//            pagesPrinted += pages;
//            return pages;
//        }
        int sheets = duplex ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pages;
        return sheets;
    }
}
