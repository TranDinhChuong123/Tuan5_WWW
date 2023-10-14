package com.example.tuan5.models;

public enum SkillType {
    SOFT_SKILL(1),
    UNSPECIFIC(2),
    TECHNICAL_SKILL(3);

    private final int code;

    SkillType(int code) {
        this.code = code;

    }


//
//    EmployeeStatus(int code) {
//        this.code = code;
//    }

    public int getCode() {
        return code;
    }
}
