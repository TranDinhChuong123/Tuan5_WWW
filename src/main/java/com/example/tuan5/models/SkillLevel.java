package com.example.tuan5.models;

public enum SkillLevel {
    MASTER(1),
    BEGINER(2),
    ADVANCED(3),
    PROFESSIONAL(4),
    IMTERMEDIATE(5);
    private final int code;


    SkillLevel(int code) {
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
