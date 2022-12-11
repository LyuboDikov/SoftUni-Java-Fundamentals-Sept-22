package ObjectsAndClasses.Exercise.articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();

            String command = input.split(": ")[0];

            switch (command){
                case "Edit":
                    String newContent = input.split(": ")[1];
                    article.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = input.split(": ")[1];
                    article.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = input.split(": ")[1];
                    article.rename(newTitle);
                    break;
            }
        }
        System.out.println(article);
    }
}
