package com.sda.java18.test;

public class Test {

    private static class Dog {
        public String voice;
        public String getVoice() {
            return voice;
        }
        public void setVoice(String voice) {
            this.voice = voice;
        }
    }

    public static void main(String[] args) {
        Dog pimpus = new Dog();
        pimpus.setVoice("Hau Hau!");
        changeVoice(pimpus);
        System.out.println(pimpus.getVoice());

        pimpus.setVoice("Hau Hau!");
        pimpus = changeVoiceAndReturn(pimpus);
        System.out.println(pimpus.getVoice());

        int wartosc = 10;
        changeValue(wartosc);
        System.out.println(wartosc);
    }

    public static void changeVoice(Dog dog) {
        dog.setVoice("Miau!");
        dog = new Dog();
        dog.setVoice("Kici kici");
        System.out.println(dog.getVoice());
    }

    public static Dog changeVoiceAndReturn(Dog dog) {
        dog.setVoice("Miau!");
        dog = new Dog();
        dog.setVoice("Kici kici");
        return dog;
    }

    public static void changeValue(int value){
        value = 15;
    }
}

