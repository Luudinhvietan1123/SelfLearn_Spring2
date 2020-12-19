package com.example.SelfLearn_Spring2;

import org.springframework.stereotype.Repository;

@Repository
//Repository de giao tiep voi tang DB
public class GirlRepositoryImpl implements GirlRepository {

    @Override
    public Girl getGirlByName(String name){
        return new Girl(name);
    }
}
