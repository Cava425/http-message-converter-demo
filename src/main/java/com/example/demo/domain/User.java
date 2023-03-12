package com.example.demo.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    @JSONField(name = "firstName")
    private String firstName;
    private String lastName;
}
