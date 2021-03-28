package com.example.demo.data;

import com.example.demo.Taco;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JdbcTacoRepositoryTest {


    @Test
    public void test(){
        Taco taco = new Taco();
        taco.setCreatedAt(new Date());
        PreparedStatementCreator psc = new PreparedStatementCreatorFactory(
                "insert into Taco (name,createdAt) values (?,?)", Types.VARCHAR,Types.TIMESTAMP)
                .newPreparedStatementCreator(Arrays.asList(taco.getName()
                        ,new Timestamp(taco.getCreatedAt().getTime())));

        KeyHolder keyHolder = new GeneratedKeyHolder();
        System.out.println(keyHolder.getKey());
    }

}