package devsuperior.composition1.application;

import devsuperior.composition1.entities.Comment;
import devsuperior.composition1.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.ENGLISH);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("11/11/2022 15:36:20"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(sdf.parse("11/11/2022 15:57:56"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println();
        System.out.println(p2);

    }
}
