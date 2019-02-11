package guru.springframework.controllers;

import guru.springframework.servicies.RecipeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oaryukov on 08.02.2019.
 */
@Controller
public class IndexController {

    private final RecipeServiceImpl recipeService;

    public IndexController(RecipeServiceImpl recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/"})
    public String getIndexPage (Model model){
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}

