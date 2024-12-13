package com.example.demo;
 public class Book {
    private String title;
    private String publishing;
    private String year;
    private String genre;
    private String author;
    private String views;
    private String description;
    public Book(String title, String publishing, String year, String genre, String author, String views, String description) {
         this.title = title;
         this.publishing = publishing;
         this.year = year;
         this.genre = genre;
         this.author = author;
         this.views = views;
         this.description = description;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getPublishing() {
         return publishing;
     }

     public void setPublishing(String publishing) {
         this.publishing = publishing;

     }

     public String getYear() {
         return year;
     }

     public void setYear(String year) {
         this.year = year;
     }

     public String getGenre() {
         return genre;
     }

     public void setGenre(String genre) {
         this.genre = genre;
     }

     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public String getViews() {
         return views;
     }

     public void setViews(String views) {
         this.views = views;
     }

     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }


     @Override
     public String toString() {
         return "Book{" +
                 "title='" + title + '\'' +
                 '}';
     }
 }

