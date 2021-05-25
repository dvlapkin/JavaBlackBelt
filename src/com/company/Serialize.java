package com.company;

import java.io.*;

public class Serialize {
    public static void main(String[] args) throws Exception {

        UserChild user = new UserChild();
        user.lifeLevel = 55;
        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;
        user.childlevel = 90;
      //  user.sword.level=666;

        User user2 = new User();
        user2.lifeLevel = 77;

        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
       // objectOutputStream.writeObject(user2);

        objectOutputStream.writeInt(100);
        objectOutputStream.writeInt(200);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser= (UserChild) objectInputStream.readObject();
      //  User newUser2= (User) objectInputStream.readObject();
        int x = (int) objectInputStream.readInt();
        int x2 = (int) objectInputStream.readInt();

        user2.st=10;
        System.out.println("USER 1:");
        System.out.println(newUser.lifeLevel);
        System.out.println(newUser.st);
        System.out.println(newUser.sword);
        System.out.println(newUser.childlevel);

        System.out.println("USER 2:");
   //     System.out.println(newUser2.lifeLevel);

        System.out.println("NUMBERS :");
        System.out.println(x+","+x2);
    }
}
