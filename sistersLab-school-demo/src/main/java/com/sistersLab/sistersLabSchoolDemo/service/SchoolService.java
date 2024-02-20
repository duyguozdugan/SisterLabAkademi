package com.sistersLab.sistersLabSchoolDemo.service;

import com.sistersLab.sistersLabSchoolDemo.converter.SchoolConverter;
import com.sistersLab.sistersLabSchoolDemo.dto.request.SchoolRequest;
import com.sistersLab.sistersLabSchoolDemo.dto.response.SchoolResponse;
import com.sistersLab.sistersLabSchoolDemo.exception.SchoolAlreadyExistsException;
import com.sistersLab.sistersLabSchoolDemo.exception.SchoolNotFoundException;
import com.sistersLab.sistersLabSchoolDemo.model.School;
import com.sistersLab.sistersLabSchoolDemo.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public SchoolResponse createSchool(SchoolRequest schoolRequest) {
        Optional<School> schoolByName= schoolRepository.findBySchoolName(schoolRequest.getSchoolName());
        if(schoolByName.isPresent()){
           throw new SchoolAlreadyExistsException("School name already exists with name: "+schoolRequest.getSchoolName());
        }
        return SchoolConverter.convertToSchoolResponse(
                schoolRepository.save(SchoolConverter.convertToSchool(schoolRequest)));
    }

    public void deleteSchoolById(Long id) {
        schoolRepository.deleteById(id);
    }

    public SchoolResponse getSchoolById(Long id) {

    return SchoolConverter.convertToSchoolResponse(
            getSchool(id));
    }

    private School getSchool(Long id) {
        return schoolRepository.findById(id)
                .orElseThrow(() -> new SchoolNotFoundException("School not found." + id));
    }

    public void updateSchool(Long id, SchoolRequest schoolRequest) {
      School oldSchool = getSchool(id);
      oldSchool.setSchoolName(schoolRequest.getSchoolName());
      schoolRepository.save(oldSchool);
    }

    public List<School> getSchool(String name) {
        if(name==null){
            return schoolRepository.findAll();
        }else {
            return schoolRepository.findAllBySchoolName(name);
        }
    }
}
