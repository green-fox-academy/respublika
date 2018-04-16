public class TodoPrint {
    public static void main(String[] args){
        String todoText = " - Buy milk\n";
        StringBuilder todoTextSB=new StringBuilder(todoText);
        todoTextSB.insert(0, "My todo:\n");
        todoTextSB.append(" - Download games\n");
        todoTextSB.append("\t - Diablo\n");
        todoText=todoTextSB.toString();
        System.out.println(todoText);
    }
}