import java.util.ArrayList;

public class Counter {
    private ArrayList<String> rowList;

    public Counter() {
        this.rowList = new ArrayList<>();
    }

    public boolean addRow(String row) {
        if (row.trim().equalsIgnoreCase("stop")) {
            return true;
        }
        rowList.add(row);
        return false;
    }

    public int countRows() {
        return rowList.size();
    }

    public int countCharacters() {
        int count = 0;
        for (int i = 0; i < rowList.size(); i++) {
            count += rowList.get(i).length();
        }

        return count;
    }

    public int countWords() {
        int count = 0;
        for (int i = 0; i < rowList.size(); i++) {
            count += rowList.get(i).split(" ").length;
        }
        return count;
    }

    public String longestWord() {
        String longestWord = "";
        for (int i = 0; i < rowList.size(); i++) {
            String[] words = rowList.get(i).split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() > longestWord.length()) {
                    longestWord = words[j];
                }
            }
        }
        return longestWord;
    }


}
