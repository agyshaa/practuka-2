package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
Book book=new Book ("Вище неба", "Dbl", "214323","eggvdxv", "kgemmbias", "2140124", "jsdfwufhskjbcnjdsbfhjsjkfnkzdslvml");

    @GetMapping("/")
    public String home(Model model) {
        String title = book.getTitle();
        String publishing=book.getPublishing();
        String year=book.getYear();
        String genre=book.getGenre();
        String author=book.getAuthor();
        String views=book.getViews();
        String description=book.getDescription();
        model.addAttribute("title", title);
        model.addAttribute("publishing", publishing);
        model.addAttribute("year", year);
        model.addAttribute("genre", genre);
        model.addAttribute("author", author);
        model.addAttribute("views", views);
        model.addAttribute("description", description);
        return "index";
    }

}