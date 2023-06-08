public class MyTable {
    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        @Override
        public String toString() {
            return ch + "->" + str;
        }
    }

    private Entry[] entries;

    MyTable() {
        entries = new Entry[26];
    }

    public String get(char c) {
        String result = null;
        if (isValidChar(c)) {
            final int index = (int) c - (int) 'a';
            result = entries[index].str;
        }
        return result;
    }

    public void add(char c, String s) {
        if (isValidChar(c)) {
            final int index = (int) c - (int) 'a';
            entries[index] = new Entry(c, s);
        }
    }

    private boolean isValidChar(char c) {
        return ((int) c >= (int) 'a' && (int) c <= (int) 'z');
    }

    @Override
    public String toString() {
        String strToPrint = "";
        for (Entry entry : entries) {
            if (entry != null) {
                strToPrint += entry.toString() + "\n";
            }
        }
        return strToPrint;
    }
}
