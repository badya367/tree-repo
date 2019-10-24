package org.dmitriy.app;


import java.util.Scanner;

public class NodeProjectApp {
    public static void main (String[] args) {
        // 1) Получаем заполненное дерево
        Node filledUniversityNode = getFilledUniversityNode();
        System.out.println(filledUniversityNode);

        // 2) Ведём диалог с пользователем
        String userData = getUserData(); // получаем на вход строку
        System.out.println("Вы ввели: " + userData);

        // 3) Сплит
        String[] userNodesArray = userData.split("[.]"); // Получили массив узлов по (.)
        System.out.println(userNodesArray.length);
        /*
        for (String value :
                userNodeArray) {
          System.out.println(value);
        }
         */

        // 4) Поиск узла
        Node node = findNode(userNodesArray, filledUniversityNode);
        System.out.println("Нашли узел" + node.getAddress());
    }

    private static Node findNode (String[] userDataPath, Node filledNode) {
        Node result = null;
        // прописать логику получения последнего узла,
        // в нашем случае из адреса "kniit.ssu.com"
        // получить узел "kniit".
        return result;
    }

    public static String getUserData() {
        /*Scanner data = new Scanner (System.in);
        System.out.println("Введите адрес, пожалуйста \n (условие: узлы пишутся через точку \n" +
                "и заканчиваются корневым узлом 'com'");

        // ........
        // Валидация
        String adres = data.nextLine(); */
        String data = "kniit.ssu.com";
        if (validateUserData(data)) {
            return data;
        } else {
            return getUserData();
        }
    }

    private static boolean validateUserData(String data) {
        if (data == null || data.isEmpty()) {
            System.out.println("Введён неккоректный адрес \n пожалуйста, повторите попытку");
            return false;
        }
        // другие валидации
        return true;
    }

    public static Node getFilledUniversityNode() {
        /*
        Заполняем дерево
         */
        Node ssuNode = new Node(); // Узел СГУ
        ssuNode.setAddress("ssu");
        Node sgtuNode = new Node(); // Узел СГТУ
        sgtuNode.setAddress("sgtu");
        Node kniitNode = new Node(); // Узел факультета Книит
        kniitNode.setAddress("kniit");
        Node mmNode = new Node(); // Узел факультета Мех-Мат
        mmNode.setAddress("mm");
        Node ftipNode = new Node(); // Узел факультета Фтип
        ftipNode.setAddress("ftip");
        Node mashNode = new Node(); // Узел факультета Maш
        mashNode.setAddress("mash");
        Node comNode = new Node(); // Корневой узел
        comNode.setAddress("com");

        return comNode;
    }
}
