package ObjectsAndClasses.Lab.songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSongs = new ArrayList<>();

        for (int i = 1; i <= n ; i++) {
            String songData = scanner.nextLine();

            String typeList = songData.split("_")[0];
            String name = songData.split("_")[1];
            String time = songData.split("_")[2];

            Song song = new Song(typeList, name, time);
            listSongs.add(song);
        }
        String command = scanner.nextLine();

        if (command.equals("all")){
            for (Song song : listSongs){
                System.out.println(song.getName());
            }
        } else {
            for (Song song : listSongs){
                if (song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
