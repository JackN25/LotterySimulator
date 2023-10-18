public class Lottery {
    //Variables
    private int lotteryNumber;
    private int winnings;
    //Constructor
    public Lottery() {
        lotteryNumber = (int) (Math.random() * 99);
    }

    //Returns earnings
    public int determineWinnings(int userNumber) {
        if (userNumber == lotteryNumber) {
            winnings = 100;
        } else if ((userNumber % 10 == lotteryNumber / 10) && (userNumber / 10 == lotteryNumber % 10)) {
            winnings = 10;
        } else if ((userNumber % 10 == lotteryNumber % 10) || (userNumber % 10 == lotteryNumber / 10) || (userNumber / 10 == lotteryNumber % 10) || (userNumber / 10 == lotteryNumber /10)) {
            winnings = 3;
        } else {
            winnings = 0;
        }
        return winnings;
    }

    public int getLotteryNumber() {
        return lotteryNumber;
    }
}
