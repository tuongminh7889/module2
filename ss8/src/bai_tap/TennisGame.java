package ss8.src.bai_tap;

public class TennisGame {
    private static final String NO_0_POIN = "Love";
    private static final String NO_1_POIN = "Fifteen";
    private static final String NO_2_POIN = "Thirty";
    private static final String NO_3_POIN = "Forty";
    private static final String DEUCE = "Deuce";

    public static String getDeuceFinalScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        if (player1Score >= 4 || player2Score >= 4) {
            int difference = player1Score - player2Score;
            if (difference == 1) score = player1Name + "advantage";
            else if (difference == -1) score = player2Name + "advantage";
            else if (difference >= 2) score = player1Name + "Win";
            else score = player2Name + "Win";
        }
        return score;
    }

    public static String getDeuceScore(int player1Score, int player2Score) {
        String score = "";
        if (player1Score == player2Score)
            switch (player1Score) {
                case 0:
                    score = NO_0_POIN + "All";
                    break;
                case 1:
                    score = NO_1_POIN + "All";
                    break;
                case 2:
                    score = NO_2_POIN + "All";
                    break;
                case 3:
                    score = NO_3_POIN + "All";
                    break;
                default:
                    score = DEUCE;
                    break;
            }
        return score;
    }

    public static String getNotDeuceCore(int player1Score, int player2Score) {
        int tempScore;
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                score += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    score += NO_0_POIN;
                    break;
                case 1:
                    score += NO_1_POIN;
                    break;
                case 2:
                    score += NO_2_POIN;
                    break;
                case 3:
                    score += NO_3_POIN;
                    break;
            }
        }
        return score;
    }
}