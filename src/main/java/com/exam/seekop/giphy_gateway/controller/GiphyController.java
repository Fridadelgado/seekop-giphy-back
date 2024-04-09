package com.exam.seekop.giphy_gateway.controller;

import com.exam.seekop.giphy_gateway.entity.GiphyResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Api(tags = "Giphy Controller", description = "APIs for interacting with Giphy")

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("")
public class GiphyController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findGiphyByName")
    @ApiOperation("Find Giphy by name")
    public ResponseEntity<String> findGipghyByName(@RequestParam String q) {
        try {
            String apiKey = "ZcCpPvQSbfyEUufWRootKOGwCltVyQDC";
            String phrase = q;
            int limit = 10;
            String apiUrl = "https://api.giphy.com/v1/gifs/search?q=" + phrase + "&api_key=" + apiKey + "&limit=" + limit;
            System.out.println(apiUrl);
            ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
            System.out.println(response);
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}