package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    //post를 통해 data를 보내는 방법
    // HTML <Form>
    // ajax 검색
    // http post body -> data

    //보내진 data가 화면에 표시되는 방법
    // json, xml, multipart-form / text-plain

    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {

        return searchParam;
    }


}
