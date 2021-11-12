package com.bridgelabz;

public class MainDeckOfCard {
        private static int num;
        public static void main(String[] args){
            System.out.println("Players of the game :");
            DeckOfCard distrubuteCards = new DeckOfCard();
            for (num=1;num<=4;num++)
            {
                distrubuteCards.DistrubuteCardsplayers(num);
                System.out.println(".......................................................");
                System.out.println("Players :"+num+ "");
                System.out.println(".......................................................");
                distrubuteCards.showShuffledCards(num);
            }
        }
        }