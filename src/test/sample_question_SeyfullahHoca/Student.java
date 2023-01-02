package test.sample_question_SeyfullahHoca;

import java.util.Scanner;


  public class Student {
         String ogrencininAdiSoyadi;
         byte age;
         char gender;
         String school = "";

        public Student(String ogrencininAdiSoyadi, byte age, char gender, String school) {
            this.ogrencininAdiSoyadi = ogrencininAdiSoyadi;
            this.age = age;
            this.gender = gender;
            this.school = school;
        }

        @Override
        public String toString() {
            return "StudentMain{" +
                    "ogrencininAdiSoyadi='" + ogrencininAdiSoyadi + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';

        }
    }
