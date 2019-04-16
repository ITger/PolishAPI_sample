package pl.itger.PolishAPI.io.swagger.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

@Controller
public class AsApiController implements AsApi {

    private final AsApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public AsApiController(AsApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public AsApiDelegate getDelegate() {
        return delegate;
    }
}
