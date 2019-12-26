package pl.itger.polishAPI.io.swagger.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

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
