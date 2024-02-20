package com.sistersLab.sistersLabSchoolDemo.converter;

import com.sistersLab.sistersLabSchoolDemo.dto.request.SchoolRequest;
import com.sistersLab.sistersLabSchoolDemo.dto.response.SchoolResponse;
import com.sistersLab.sistersLabSchoolDemo.model.School;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SchoolConverter {
    public static School convertToSchool(SchoolRequest schoolRequest){
        School school=new School();
        school.setSchoolName(schoolRequest.getSchoolName());
        return school;
    }

    public static SchoolResponse convertToSchoolResponse(School school){
        SchoolResponse schoolResponse= new SchoolResponse();
        schoolResponse.setSchoolName(school.getSchoolName());
        schoolResponse.setCreatedDate(school.getCreatedDate());
        return schoolResponse;
    }
}
