package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository ("fakeDao")
public class FakePersonDataAcessService implements PersonDao{

    private static List<Person> DB =new ArrayList<>();

    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    public List <Person> selectAllPeople(){
        return DB;
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public Optional<Person> selectPersonById() {
        return Optional.empty();
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }

}
