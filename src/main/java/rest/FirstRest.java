package rest;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class FirstRest {

    @PostMapping("/login")
    public boolean login(@RequestParam("id") int id){

        System.out.println(id);
        return true;
    }

    @GetMapping("/lule")
    public String lule(){
        return "Lule";
    }
}
