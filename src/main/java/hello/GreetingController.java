package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String resp ="Hello world";
    private final AtomicLong counter= new AtomicLong();

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public Greeting greeting(){
        return new Greeting(counter.incrementAndGet(),resp);
    }

}
