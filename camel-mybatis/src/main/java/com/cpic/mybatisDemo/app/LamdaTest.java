package com.cpic.mybatisDemo.app;

import com.cpic.mybatisDemo.inter.Ilike;

public class LamdaTest {



    public static void main(String[] args) {
        Ilike like =new Ilike() {
            @Override
            public void lambda(final int a) {
                System.out.println("I like lambda"+a);
            }
        };
        like.lambda(3);

        like= (final int a)->{System.out.println("I like lambda"+a);};
        like.lambda(5);

    }

}



