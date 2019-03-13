package pl.itger.PolishAPI.io.swagger.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

@Controller
public class CafApiController implements CafApi {

    private final CafApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public CafApiController(CafApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public CafApiDelegate getDelegate() {
        return delegate;
    }
}
