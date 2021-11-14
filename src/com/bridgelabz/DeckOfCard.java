package com.bridgelabz;

public class DeckOfCard {
    public static void main(String[] args) {
        String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] Ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] cardsArray = new String[52];
        int start = 0, end = 12, k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = start; j <= end; j++) {
                cardsArray[j] = Suits[i] + " " + Ranks[k];
                k++;
            }
            k = 0;
            start = end + 1;
            end += 13;
        }
        int k1 = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("For Player " + i + ": \n");
            for (int j = 0; j < 9; j++) {
                System.out.print(cardsArray[k1] + "\n");
                k1++;
            }
            System.out.println("--------------------------------------------------------");
        }

    }
}