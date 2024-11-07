package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    @Autowired
    public DataRepository repository;

    public String insertData(Data data){
        repository.save(data);
        return "data saved.";
    }

    public List<Data> getAllData(){
        return repository.findAll();
    }

    public String updateData(Data data){
        repository.save(data);
        return "Data updated.";
    }

    public String deleteData(int id){
        repository.deleteById(id);
        return "Data deleted.";
    }

}
