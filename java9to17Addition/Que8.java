package java9to17Addition;

import java.util.stream.IntStream;


class Music implements AutoCloseable{
    public Music() {
        System.out.println("Music Queued");
    }

    public void start() {
        System.out.println("Music Started");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Music stop method invoked");
    }
}

public class Que8 {
    public static void main(String[] args) throws Exception {
        Music Music1 = new Music();

        try(Music1){
            Music1.start();

        }catch (Exception ex){

        }
    }
}
