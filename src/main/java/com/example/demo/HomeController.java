package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    Book book = new Book("Вище неба", "Dbl", "214323", "eggvdxv", "kgemmbias", "2140124", "jsdfwufhskjbcnjdsbfhjsjkfnkzdslvml");
    Book book2 = new Book("Вище неба1", "Dbl", "214323", "eggvdxv", "kgemmbias", "2140124", "jsdfwufhskjbcnjdsbfhjsjkfnkzdslvml");
    Book book3 = new Book("Вище неба2", "Dbl", "214323", "eggvdxv", "kgemmbias", "2140124", "jsdfwufhskjbcnjdsbfhjsjkfnkzdslvml");
    Book book4 = new Book("Вище неба2", "Dbl", "214323", "eggvdxv", "kgemmbias", "2140124", "jsdfwufhskjbcnjdsbfhjsjkfnkzdslvml");

   List<Book> books =  new ArrayList();



    @GetMapping("/")
    public String home(Model model) {

        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);


        String title = book.getTitle();
        String publishing = book.getPublishing();
        String year = book.getYear();
        String genre = book.getGenre();
        String author = book.getAuthor();
        String views = book.getViews();


        String description = book.getDescription();
        model.addAttribute("title", title);
        model.addAttribute("publishing", publishing);
        model.addAttribute("year", year);
        model.addAttribute("genre", genre);
        model.addAttribute("author", author);
        model.addAttribute("views", views);
        model.addAttribute("description", description);


        model.addAttribute("books", books);


        return "index";
    }

}