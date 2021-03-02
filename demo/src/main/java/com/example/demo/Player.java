package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Player {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }
    
  
    private String namn;
    private int age;
    private int jersey;
    private String born;

    public void SetBorn(String s)
    {
        born  = s;
    }
    public String GetBorn()
    {
        return born;
    }


    public void SetNamn(String v)
    {
        namn = v;
    }

    public void SetAge(int v)
    {
        age  = v;
    }
    public void SetJersey(int v)
    {
        jersey  = v;
    }


    public String GetNamn()
    {
        return namn;
    }
    public int GetAge()
    {
        return age;
    }
    public int GetJersey()
    {
        return jersey;
    }
}
