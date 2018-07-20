package pl.HaniaKamil.MemySpring.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.HaniaKamil.MemySpring.models.Mem;
import pl.HaniaKamil.MemySpring.models.MemDao;
import pl.HaniaKamil.MemySpring.models.MemStaticDao;

@Controller
public class MemController {
    private MemDao memDao = new MemStaticDao();

    @GetMapping("/")
    public String home() {
        return "add";
    }

    @GetMapping("/add")
    public String add( @ModelAttribute Mem mem,
                      ModelMap modelmap) {
        memDao.addMem(mem);
        modelmap.put("newMem", mem);
        return "added";
    }
    @GetMapping("/all")
    public String findAll(ModelMap modelMap){
        modelMap.put("mems",memDao.findAll());
        return "all";
    }

    @GetMapping("/fav")
    public String favs(ModelMap modelMap){
        modelMap.put("mems", memDao.findFavor());
        return "fav";
    }

}
