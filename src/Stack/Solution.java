package Stack;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String masuk = "";

        while (in.hasNext()) {
            masuk = masuk + in.next()+"\n";
        }
        // System.out.println(isValid(masuk.split(" ")));
        // String masuk = in.nextLine();
        System.out.println(validator(masuk));
        in.close();
    }

    private static String validator(String input){
        if (isValid(input.split("\n"))){
            return "TRUE";
        }
        return "FALSE";
    }
    //<html> <body> </body> </html>
    //<html> <body> </html> </body>
    //<html> </html> <php>
    private static boolean isValid (String [] array){
        StackXML stack = new StackXML();
        for (int i = 0; i < array.length; i++){
            if (array[i].equalsIgnoreCase("<html>")||array[i].equalsIgnoreCase("<body>")||array[i].equalsIgnoreCase("<php>")){
                stack.Push(new XML (array[i]));
                // System.out.println("Sini 1");
                // stack.Print();
            }else if (stack.isEmpty()){
                // System.out.println("Sini 2");
                return false;
                
            }else{
                // System.out.println("Sini Buang");
                XML ambil = stack.Pop();
                if ((ambil.getData().equalsIgnoreCase("<html>") && !array[i].equalsIgnoreCase("</html>"))
                    || (ambil.getData().equalsIgnoreCase("<body>")&& !array[i].equalsIgnoreCase("</body>"))
                    || (ambil.getData().equalsIgnoreCase("<php>")&& !array[i].equalsIgnoreCase("</php>"))){
                    // System.out.println("Sini 3");
                    return false;
                }
                
            }
        }
        return stack.isEmpty();
    }
}

class XML {
    private String data;
    private XML next;
    XML(String data){
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public void setNext(XML next){
        this.next = next;
    }
    public XML getNext() {
        return next;
    }
}

class StackXML {
    private XML head;
    public void Push(XML data){
        if (head == null){
            head = data;
            return;
        }
        data.setNext(head);
        head = data;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public XML Pop(){
        if (head == null){
            return null;
        }
        XML Hasil = head;
        head = Hasil.getNext();
        Hasil.setNext(null);
        return Hasil;
    }
    public void Print(){
        XML temp = head;
        System.out.print(temp.getData() + " ");
        temp = temp.getNext();
    }
}
