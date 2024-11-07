package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testing")
public class MyController {

    @Autowired
    public DataService service;

    @GetMapping
    public String getApi(){
        return "Get Api works...";
    }

    @PostMapping("/new/{name}/{id}/{city}")
    public String postApi(@PathVariable String name,@PathVariable int id,@PathVariable String city){
        System.out.println(name);
        System.out.println(id);
        System.out.println(city);
        return "post api works...";
    }

    @PostMapping
    public String postApi1(@RequestParam String name,@RequestParam int id,@RequestParam String city){
        System.out.println(name);
        System.out.println(id);
        System.out.println(city);
        return "post api works...";
    }


    @PostMapping("/body")
    public String postApi2(@RequestBody Data data){
        System.out.println(data.getName());
        System.out.println(data.getId());
        System.out.println(data.getCity());
        return "post api works...";
    }


    @GetMapping("/all")
    public List<Data> getAllDate(){
        return service.getAllData();
    }

    @PostMapping("/data")
    public String insertData(@RequestBody Data data){
        return service.insertData(data);
    }

    @PutMapping("/update")
    public String updateData(@RequestBody Data data){
        return service.updateData(data);
    }

    @DeleteMapping
    public String deleteData(@RequestParam int id){
        return service.deleteData(id);
    }

}
