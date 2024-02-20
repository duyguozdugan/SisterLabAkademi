package com.sistersLab.sistersLabSchoolDemo.controller;

import com.sistersLab.sistersLabSchoolDemo.dto.request.SchoolRequest;
import com.sistersLab.sistersLabSchoolDemo.dto.response.SchoolResponse;
import com.sistersLab.sistersLabSchoolDemo.exception.SchoolAlreadyExistsException;
import com.sistersLab.sistersLabSchoolDemo.exception.SchoolNotFoundException;
import com.sistersLab.sistersLabSchoolDemo.model.School;
import com.sistersLab.sistersLabSchoolDemo.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
@RestController
public class SchoolController {
    private final SchoolService schoolService;

    @PostMapping("/create")
    public SchoolResponse createSchool(@RequestBody SchoolRequest schoolRequest){
        return schoolService.createSchool(schoolRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSchoolById(@PathVariable Long id){
        schoolService.deleteSchoolById(id);
    }

    @GetMapping("/getById/{id}")
    public SchoolResponse getSchoolById(@PathVariable Long id){
      return  schoolService.getSchoolById(id);
    }

    @PutMapping("update/{id}")
    public void updateSchool(@PathVariable Long id, @RequestBody SchoolRequest schoolRequest){
      schoolService.updateSchool(id, schoolRequest);
    }

    @GetMapping()
    public List<School> getSchool(@RequestParam(required = false) String name){
      return  schoolService.getSchool(name);
    }

    //aslında bu metot burada olmamalı geçiçi olarak koyuldu

    @ExceptionHandler(SchoolAlreadyExistsException.class)
    public ResponseEntity<String> handleSchoolAlreadyExistsException(SchoolAlreadyExistsException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SchoolNotFoundException.class)
    public ResponseEntity<String> handleSchoolNotFoundException(SchoolNotFoundException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
    }



}
