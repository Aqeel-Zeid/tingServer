package com.ting.tingServer.Controller;

import com.ting.tingServer.Controller.jsonResponseFormats.TestGETResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/test")
public class TestController {
    @GetMapping(path="/testGET")
    public @ResponseBody
    String testController(@RequestBody TestGETResponse testGETResponse) {
        // This returns a JSON or XML with the users
        return "Test Param = " + testGETResponse.getTestParam();
    }
}
