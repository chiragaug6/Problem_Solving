
//Read Solution FOR MORE

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        String str="G()(al)";
        System.out.println(interpret(str));
    }

    static String interpret(String command) {
        String command2=command.replace("()","o");
        return command2.replace("(al)","al");
    }
}
