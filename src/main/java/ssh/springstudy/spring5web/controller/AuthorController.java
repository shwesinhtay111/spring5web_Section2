package ssh.springstudy.spring5web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ssh.springstudy.spring5web.repositories.AuthorRepository;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @RequestMapping("/authors")
    public String getAuthor(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "author";
    }
    
}
