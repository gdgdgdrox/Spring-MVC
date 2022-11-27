package springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="register")
public class RegisterController {
    
//    Method 1 - Query String
//    @RequestParam extracts information from the URL query string : http://localhost:8080/register?name=daniel&age=34&email=danieltan%40yahoo.com
    @GetMapping
    public String register(@RequestParam String name,
                            @RequestParam (required=true) Integer age,
                            @RequestParam("email") String personEmail,
                            @RequestParam (defaultValue="true") boolean advertisementOptIn){
        System.out.println("NAME >>> " + name);
        System.out.println("AGE >>> " + age);
        System.out.println("EMAIL >>> " + personEmail);
        System.out.println("OPT IN FOR ADVERTISEMENT? >>> " + advertisementOptIn);
        return "blank";
    }

    // Method 1 - Query String
    // Using MultiValueMap. This is good if the query string is long.
    // Caveat is that because the map type is String,String, you have to cast the value from String to Integer (for age) and boolean (for advertisement opt in)
    // @GetMapping
    // public String register2(@RequestParam MultiValueMap<String,String> params){
    //     System.out.printf("NAME >>> %s\n",params.getFirst("name"));
    //     System.out.printf("AGE >>> %s\n",params.getFirst("age"));
    //     System.out.printf("EMAIL >>> %s\n",params.getFirst("email"));
    //     System.out.printf("OPT IN FOR ADVERTISEMENT? >>> %s",params.getFirst("advertisementOptIn"));
    //     return "blank";
    // }

    //Method 2 - Path Variable
    //Info is extracted from the URL i.e. http://localhost:8080/register/5
    // @GetMapping(path="/{id}")   //note that the path is /register/{id} since @RequestMapping("register") is applied at the class level
    // public String register2(@PathVariable String id){
    //     System.out.println("ID >>> " + id);
    //     return "blank";
    // }

    //Method 3 - Binding Object
    //Instantiate an empty object and pass it to the model. Upon filling in form data and clicking submit, Spring will call
    //setter methods to bind the form data to the object. 
    // @GetMapping
    // public String registrationPage(Model model){
    //     Person person = new Person();
    //     model.addAttribute("person", person);
    //     return "registrationPage";
    // }

    //Retrieve the object using the @ModelAttribute annotation. This Person object should have data bound to it. 
    // @GetMapping(path = "person")
    // public String registrationResult(@ModelAttribute Person person){
    //     System.out.printf("NAME >>> %s\n",person.getName());
    //     System.out.printf("AGE >>> %s\n",person.getAge());
    //     System.out.printf("EMAIL >>> %s\n",person.getEmail());
    //     System.out.printf("OPT IN FOR ADVERTISEMENT? >>> %s",person.getAdvertisementOptIn());
    //     return "blank";
    // }
}
