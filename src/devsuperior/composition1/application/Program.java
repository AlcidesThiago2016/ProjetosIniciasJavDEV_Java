package devsuperior.composition1.application;

import devsuperior.composition1.entities.Comment;
import devsuperior.composition1.entities.Post;

import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");


    }
}
