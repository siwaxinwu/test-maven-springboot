package com.roy.entity;

import com.roy.validation.TeacherGroupSequenceProvider;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.group.GroupSequenceProvider;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * description：age 在20-25之间，title以初级开头，age在25-30之间，title以中级开头
 * author：dingyawu
 * date：created in 22:51 2020/8/22
 * history:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@GroupSequenceProvider(TeacherGroupSequenceProvider.class)
public class Teacher {
    @NotNull
    private Integer age;
    @NotEmpty
    @Pattern(regexp = "^\u521d\u7ea7.*", groups = TitleJunior.class)//初级，不能写中文，只能写unicode码
    @Pattern(regexp = "^\u4e2d\u7ea7.*", groups = TitleMiddle.class)//中级
    private String title;

    public interface TitleJunior{

    }
    public interface TitleMiddle{

    }
}
