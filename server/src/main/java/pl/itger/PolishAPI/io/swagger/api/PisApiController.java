package pl.itger.PolishAPI.io.swagger.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

@Controller
public class PisApiController implements PisApi {

    private final PisApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public PisApiController(PisApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public PisApiDelegate getDelegate() {
        return delegate;
    }
}
