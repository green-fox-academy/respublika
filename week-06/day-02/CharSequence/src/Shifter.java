public class Shifter implements CharSequence {
    String string="";
    int shift=0;

    public Shifter(String stringInput, Integer shift) {
        this.string=stringInput;
        this.shift=shift;
    }

    @Override
    public int length() {
        return this.string.length()+this.shift;
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(index+this.shift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.string.subSequence(start+this.shift, end+this.shift);
    }
}
