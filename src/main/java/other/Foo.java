package other;

import java.io.IOException;

class Foo{
    public static void main(String[] args){
        try{
            Runtime.getRuntime().exec("notepad");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
