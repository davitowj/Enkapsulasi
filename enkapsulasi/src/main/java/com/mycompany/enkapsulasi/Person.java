/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasi;
class Person {
    public String name;
    private String username;
    private String password;

        public void setName(String name){
            this.name = name;
        }
    
        public String getName(){
            return this.name;
        }

        public Person (){
            System.out.println("Mengeksekusi constructor");
        }
}
