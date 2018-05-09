public class Gnirts implements CharSequence {
    String string="";

    public Gnirts(String stringInput) {
        for (int i = stringInput.length()-1; i >= 0 ; i--) {
            this.string+=stringInput.charAt(i);
        }
    }

    @Override
    public int length() {
        return this.string.length();
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.string.subSequence(start, end);
    }
}
