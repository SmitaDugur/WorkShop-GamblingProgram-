package WorkShop;

public class GamblingProgram {
 {

		  public static void main(String[] args) {
		    {
		       public static int gamblerAmountDay = 100;
		        public static int gamblerHalfAmount = 50;
		        public static int betEachGame = 1;
		        public static int totalDays = 20;

		        {
		                GamblerBet();

		        }
		        public static void GamblerBet() {
		            int amountOfTwentyDays = 0;
		            for (int i = 0; (i <= totalDays); i++) {
		                while ((gamblerAmountDay <= gamblerHalfAmount)) {
		                    Random random = new Random();
		                    int bet = random.Next(0, 2);
		                    if ((bet == 0)) {
		                        Console.WriteLine("lost the bet");
		                        gamblerAmountDay--;
		                    }
		                    else {
		                        Console.WriteLine("you won the bet");
		                        gamblerAmountDay++;
		                    }
		                    
		                }