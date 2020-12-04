package com.roy.validation;

import com.roy.entity.Teacher;
import org.hibernate.validator.spi.group.DefaultGroupSequenceProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * description：
 * author：dingyawu
 * date：created in 23:08 2020/8/22
 * history:
 */
public class TeacherGroupSequenceProvider  implements DefaultGroupSequenceProvider<Teacher> {
    @Override
    public List<Class<?>> getValidationGroups(Teacher teacher) {
        List<Class<?>> defaultGroupSequenece = new ArrayList<>();
        defaultGroupSequenece.add(Teacher.class);
        if (null != teacher){
            if (teacher.getAge() <= 25 && teacher.getAge() >= 20){
                defaultGroupSequenece.add(Teacher.TitleJunior.class);
            }else if (teacher.getAge() <= 30 && teacher.getAge() > 25){
                defaultGroupSequenece.add(Teacher.TitleMiddle.class);
            }
        }
        return defaultGroupSequenece;
    }
}
