import lombok.Cleanup;

import java.io.*;

/**
 * Created by Lukasz Kolacz on 03.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.setAge(5);
        player.setName("Lukas");
//          !!!!!!! toString method !!!!!!
        System.out.println(player.toString());


//        Do @Builder w klasie Player

//        Player player1 = Player.builder().age(1).name("Lukas")
//                .age1(10)
//                .name1("Matis")
//                .age2(2)
//                .name2("Jakies")
//                .age3(5).name3("Cos").build();


        try {
            @Cleanup
            InputStream in = new FileInputStream(new File("tutaj_sciezka_do_pliku"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
