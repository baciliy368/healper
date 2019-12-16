package models.interfaces;

public interface EmojInterface {
    String emojiMoney = "\uD83E\uDD11";
    String emojiStateOnline = "\uD83C\uDF36";
    String emojiStateOffline = "\uD83D\uDCA4";
    String emojiSellAll = "\uD83D\uDCA5";
    String emojiDog = "\uD83D\uDC36";
    String emojiInventory = "\uD83D\uDDC4";
    String knife = "\uD83D\uDD2A";
    String subPistol = "\uD83C\uDF00";
    String pistol = "\uD83D\uDD2B";
    String priceEmoji = "\uD83D\uDDE3";
    String stopEmoji = "\uD83D\uDEAB";
    String clearEmoji = "\uD83D\uDCA8";
    String doneEmoji = "\uD83D\uDC9A";

    static String getTextWithEmojieSurround(String text, String emoji) {
        return String.format("%s %s %s", emoji, text, emoji);
    }
}